package lesson37.weather;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class HavaStansiyasi implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public HavaStansiyasi() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setHavaDurumu(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

class HavaMushahidəçisi implements Observer {
    private String ad;

    public HavaMushahidəçisi(String ad) {
        this.ad = ad;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(ad + " hava durumu: Temperatur: " + temperature + " °C, Nem: " + humidity + ", Təzyiq: " + pressure + " hPa");
    }
}

public class Main {
    public static void main(String[] args) {
        HavaStansiyasi havaStansiyasi = new HavaStansiyasi();

        HavaMushahidəçisi observer1 = new HavaMushahidəçisi("Müşahidəçi 1");
        HavaMushahidəçisi observer2 = new HavaMushahidəçisi("Müşahidəçi 2");

        havaStansiyasi.registerObserver(observer1);
        havaStansiyasi.registerObserver(observer2);

        havaStansiyasi.setHavaDurumu(25.5f, 60.0f, 1012.3f);
        havaStansiyasi.setHavaDurumu(28.0f, 55.0f, 1010.0f);

        havaStansiyasi.removeObserver(observer1);

        havaStansiyasi.setHavaDurumu(30.2f, 50.5f, 1008.5f);
    }
}
