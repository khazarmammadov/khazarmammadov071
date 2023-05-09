package lesson5;

public class User {
    private String name;
    private String surname;
    private int age;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3) {
            System.out.println("This name must be greather than 3 Characters");
            return;
        }
        char[] arr = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (arr[i] < 'A' || arr[i] > 'z') {
                System.out.println("Name cant be constrains Symbol");
                return;
            }

        }
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        if(surname.length() < 3) {
            System.out.println("This surname must be greather than 3 Characters");
            return;
        }
        char[] arr = surname.toCharArray();
        for (int i = 0; i < surname.length(); i++) {
            if (arr[i] < 'A' || arr[i] > 'z') {
                System.out.println("Surname cant be constrains Symbol");
                return;
            }

        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 18 || age > 100) {
            System.out.println("Your age must be between 18 ---- 100");
            return;
        }

        this.age = age;
    }

    void print() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
    }
}
