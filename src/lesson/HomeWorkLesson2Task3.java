package lesson;

import java.util.Scanner;

public class HomeWorkLesson2Task3 {
    static String str;
    static int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        str = sc.nextLine();
        System.out.println("Введите количество повторов вывода строки");
        a = sc.nextInt();
        repeater(str, a);
    }
    public static void repeater(String str, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
}
