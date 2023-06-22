package lesson24TaskDay;

public abstract class Employer implements Comparable<Employer> {
    public String name;

    Employer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employer other) {
        return this.name.compareTo(other.name);
    }
}
