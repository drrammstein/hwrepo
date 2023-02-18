import java.util.Scanner;

public class HomeWorkLesson2Task2 {
    static int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        a = sc.nextInt();
        System.out.print("Результат проверки: ");
        result(a);
    }
    public static void result(int a){
        if (a > -1 ) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}
