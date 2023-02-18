package lesson;

import java.util.Scanner;

public class HomeWorkLesson2Task5 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1,0,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }
}
