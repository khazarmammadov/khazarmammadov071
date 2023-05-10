package lesson5;
import java.util.Random;
public class LoginTask {



        public static void main(String[] args) {
            User1 user = new User1("Khazar", "Mammadov");
            Login login = loginGenerator(user);
            System.out.println(login.getUsername());
            System.out.println(login.getPassword());
        }

        public static Login loginGenerator(User1 user) {
            String username = user.getFirstName().toLowerCase() + user.getLastName().toLowerCase();
            String password = generateRandomPassword();
            return new Login(username, password);
        }

        public static String generateRandomPassword() {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

            int length = 10;

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                sb.append(characters.charAt(index));
            }

            return sb.toString();
        }
    }

    class User1 {
        private String firstName;
        private String lastName;

        public User1(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    class Login {
        private String username;
        private String password;

        public Login(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }


