package lesson24TaskDay;

import java.util.ArrayList;
import java.util.Collections;

public class MainWorker {
    public static void main(String[] args) {
        ArrayList<Employer> list = new ArrayList<>();
        list.add(new Developer("Khazar"));
        list.add(new Developer("Khayal"));
        list.add(new Tester("Ali"));
        list.add(new Manager("Cemsid"));

        Collections.sort(list);

        for (Employer emp:list) {
            System.out.println(emp.name);
        }

    }
}
