package lesson18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Khazar", "Mammadov", 18));
        studentList.add(new Student("Khayal", "ysll", 28));
        studentList.add(new Student("Eli", "How", 9));
        studentList.add(new Student("Why", "What", 21));

        Comparator<Student> comparator = Comparator.comparing(Student::getAge);

        Optional<Student> max = studentList.stream().max(comparator);


        Student student = max.get();
        System.out.println(student.getName() + " " + student.getSurname() + " " + student.getAge());

    }
}



