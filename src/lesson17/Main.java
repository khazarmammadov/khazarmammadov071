package lesson17;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getters and setters
}

class Card {
    private User user;
    private String cardNumber;
    private String expiredDate;

    public Card(User user, String cardNumber, String expiredDate) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.expiredDate = expiredDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }


}

public class Main {
    private static List<Card> cards = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User("Khazar", "Mammadov");
        Card card1 = new Card(user1, "1234567890123456", "12/2025");
        cards.add(card1);

        User user2 = new User("Khayal", "Rajabli");
        Card card2 = new Card(user2, "9876543210987654", "08/2024");
        cards.add(card2);

        try {
            transferAmount(card1, card2, sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void transferAmount(Card senderCard, Card receiverCard, double amount) throws Exception {
        validateUser(senderCard.getUser());
        validateCardNumber(senderCard.getCardNumber());
        validateExpiredDate(senderCard.getExpiredDate());
        validateAmount(senderCard, amount);

        System.out.println("Transfer successful: " + amount + " units transferred from " +
                senderCard.getCardNumber() + " to " + receiverCard.getCardNumber());
    }

    private static void validateUser(User user) throws Exception {
        if (user == null) {
            throw new Exception("User does not exist.");
        }
    }

    private static void validateCardNumber(String cardNumber) throws Exception {
        if (cardNumber.length() != 16) {
            throw new Exception("Invalid card number. Card number must be 16 digits.");
        }
    }

    private static void validateExpiredDate(String expiredDate) throws Exception {
        String[] parts = expiredDate.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        int currentMonth = java.time.LocalDate.now().getMonthValue();
        int currentYear = java.time.LocalDate.now().getYear();

        if (year < currentYear || (year == currentYear && month < currentMonth)) {
            throw new Exception("Card has expired.");
        }
    }

    private static void validateAmount(Card senderCard, double amount) throws Exception {
        double balance = 500.0;

        if (amount > balance) {
            throw new Exception("Insufficient funds in the sender's account.");
        }
    }
}
