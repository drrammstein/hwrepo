package lesson;

import java.util.Scanner;

public class HomeWorkLesson2Task3 {
    static int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        a = sc.nextInt();
        System.out.print("Результат проверки: " + result(a));
    }
    public static boolean result(int a){
        if (a > -1 ) {
            return false;
        } else {
            return true;
        }
    }
}
