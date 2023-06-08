package lesson18;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class Student1 {
        private String name;
        private String surname;
        private int age;
        private String groupName;

        public Student1(String name, String surname, int age, String groupName) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.groupName = groupName;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getAge() {
            return age;
        }

        public String getGroupName() {
            return groupName;
        }

        public static void main(String[] args) {
            List<Student1> students = Arrays.asList(
                    new Student1("John", "Doe", 20, "Group A"),
                    new Student1("Jane", "Smith", 19, "Group B"),
                    new Student1("Michael", "Johnson", 21, "Group A"),
                    new Student1("Emily", "Williams", 20, "Group B")
            );

            Map<String, List<Student1>> groupedStudents = students.stream()
                    .collect(Collectors.groupingBy(Student1::getGroupName));

            for (Map.Entry<String, List<Student1>> entry : groupedStudents.entrySet()) {
                String groupName = entry.getKey();
                List<Student1> groupStudents = entry.getValue();

                System.out.println("Group: " + groupName);
                for (Student1 student : groupStudents) {
                    System.out.println(student.getName());
                }
                System.out.println();
            }
        }
    }

