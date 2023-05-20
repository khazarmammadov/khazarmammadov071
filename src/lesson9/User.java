package lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String email;
    private String password;

    public User(String email,String password) throws EmailException,PasswordException {
        setEmail(email);
        setPassword(password);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        String regex ="^[a-z0-9]+(?:\\.[a-z0-9]+)*@gmail\\.com$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            this.email = email;
        } else {
            throw new EmailException("Incorrect email format.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            throw new PasswordException("Password must be at least 8 characters.");
        }
    }
}
