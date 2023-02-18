package lesson;

import java.util.Arrays;

public class HomeWorkLesson2Task8 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                int z = 9 - x;
                arr[x][x] = 1;
                arr[x][z] = 1;
                System.out.print(arr[x][y]);
            }
            System.out.println(" ");
        }
    }
}
