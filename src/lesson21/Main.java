package lesson21;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Saul");
        person.setAge(34);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/home/khazar/IdeaProjects/khazarmammadov/src/person22");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("/home/khazar/IdeaProjects/khazarmammadov/src/person22");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            try {
                 person = (Person) objectInputStream.readObject();
                System.out.println(person.getName() + " " + person.getAge());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
