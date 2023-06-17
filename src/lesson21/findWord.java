package lesson21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class findWord {

    public static void main(String[] args) {
        String filename = "/home/khazar/IdeaProjects/khazarmammadov/src/line";

        try {
            int wordCount = countWordsInFile(filename);
            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countWordsInFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int wordCount = 0;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+"); // Splitting the line into words using whitespace as delimiter
            wordCount += words.length;
        }

        reader.close();
        return wordCount;
    }
}
