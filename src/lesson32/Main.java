package lesson32;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("123456", 100.0);
        double amount = 50.0;
        double amount2 = 15.0;

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                card.decreaseBalance(amount);
            }
        });
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(card.cardBalance);

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                card.decreaseBalance(amount2);
            }
        });
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(card.cardBalance);

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                card.increaseBalance(amount);
            }
        });
        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(card.cardBalance);
    }
}