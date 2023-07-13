package lesson31;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Card {
    private String holderName;
    private String cardNumber;
    private double balance;
    private String expDate;

    public Card(String holderName, String cardNumber, double balance, String expDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expDate = expDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("kamil", "1234", 1000.0, "12/2023"));
        cards.add(new Card("nizami", "5678", 1500.0, "10/2024"));

        Map<String, Double> balances = new HashMap<>();
        for (Card card : cards) {
            balances.put(card.getHolderName(), card.getBalance());
        }

        Thread thread1 = new Thread(() -> {
            double newBalance = balances.get("kamil") + 1000.0;
            balances.put("kamil", newBalance);
        });

        Thread thread2 = new Thread(() -> {
            double newBalance = balances.get("nizami") + 1000.0;
            balances.put("nizami", newBalance);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        for (String holderName : balances.keySet()) {
            System.out.println(holderName + " " + balances.get(holderName));
        }
    }
}
