import java.util.Scanner;

public class HomeWorkLesson2 {
    static int a;
    static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = sc.nextInt();
        System.out.println("Введите второе число");
        b = sc.nextInt();
        System.out.print("Результат проверки: ");
        result(a,b);

    }
    public static void result(int a, int b){
        if (a + b > 9 && a + b < 21) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
