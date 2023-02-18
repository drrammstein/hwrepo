package lesson;

public class HomeWorkLesson1AllTasks {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void checkSumSign() {
        int a = 40;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
            }
    }

    public static void printColor() {
        int value = 62;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}
