package lesson7;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class YearCounter {
    public static int Year(int year,int month,int day) {
        LocalDate birthday1 = LocalDate.of(year,month,day);
        LocalDate localDate = LocalDate.now();
        Period age = Period.between(birthday1,localDate);

        return age.getYears();
    }

    public static void main(String[] args) {
        System.out.println(Year(2004,6,5));
    }
}
