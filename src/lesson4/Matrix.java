package lesson4;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int n = scanner.nextInt();
                int[][] array = new int[n][n];


                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i + j >= n) {
                            array[i][j] = 1;
                        }
                    }
                }


                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


