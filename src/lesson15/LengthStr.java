package lesson15;

public class LengthStr {
    public static void main(String[] args) {
        LengthOfString length = (String str) -> System.out.println(str.length());

        length.length("Salam");
    }
}
interface LengthOfString {
    void length(String str);
}
