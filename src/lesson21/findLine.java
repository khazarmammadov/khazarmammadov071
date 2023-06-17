package lesson21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class findLine {
    public static void main(String[] args) {
        int cnt = 0;
        try {
            FileReader fr = new FileReader("/home/khazar/IdeaProjects/khazarmammadov/src/line");
            BufferedReader bufferReader = new BufferedReader(fr);

            while (bufferReader.ready()) {
                bufferReader.readLine();
                cnt++;
            }

            bufferReader.close();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        System.out.println(cnt);
    }
}
