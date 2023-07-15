package lesson32;
class Card {
    public String cardNumber;
    public double cardBalance;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public Card(String cardNumber, double cardBalance) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public void decreaseBalance(double amount) {
        synchronized (lock1) {
            cardBalance -= amount;
        }
    }

    public void increaseBalance(double amount) {
        synchronized (lock2) {
            cardBalance += amount;
        }
    }
}