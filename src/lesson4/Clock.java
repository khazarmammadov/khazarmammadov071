package lesson4;

public class Clock {
    public static void main(String[] args) {
        int hour = 13;
        int min = 25;

        double DegreeMin = min * 6;
        double HourWay = (double) min / 12;
        double HourDegree = (HourWay+(double)((hour%12)*5)) * 6 ;
        double Degree = DegreeMin - HourDegree;

        System.out.println(HourWay);

        System.out.println(Degree);

    }
}
