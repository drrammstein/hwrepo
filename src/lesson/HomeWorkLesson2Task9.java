package lesson;

import java.util.Arrays;

public class HomeWorkLesson2Task9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array(30, 2)));
    }
    public static int[] array(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    };
}
