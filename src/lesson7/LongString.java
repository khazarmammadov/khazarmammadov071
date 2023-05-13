package lesson7;

public class LongString {
    public static void main(String[] args) {
        int begin = 0, end = 0, begin2 = 0, cnt = 0, max = 0;
        String sentence0 = "The in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the and nanoseconds from the date-time:";
        String sentence = sentence0 + " ";

        char[] arr = sentence.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (cnt == 0) {
                begin = i;
            }

            if (arr[i] == ' ') {
                if (max < cnt) {
                    max = cnt;
                    begin2 = begin;
                    end = i;
                }
                cnt = 0;

            } else {
                cnt++;
            }

        }


        for (int i = begin2; i < end; i++) {
            System.out.print(arr[i]);
        }

    }

}
