package lesson9;

public class UserSign {
    public static void main(String[] args) throws EmailException,PasswordException {
        try {
            User user1 = new User("khazar71@gmail.com","xezerxezer");
            System.out.println("User1 created...");
        } catch (EmailException e) {
            System.out.println("Invalid email ..." + e.getMessage());
        } catch (PasswordException e) {
            System.out.println("Invalid password ..." + e.getMessage());
        }

        try {
            User user2 = new User("try21@.std.edu","ert4");
        } catch (EmailException e) {
            System.out.println("Invalid email ..." + e.getMessage());
        } catch (PasswordException e) {
            System.out.println("Invalid password ..." + e.getMessage());
        }
    }
}
