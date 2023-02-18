package main.java;

public class HomeWorkLesson3Task1 {

    public static void main(String[] args) {

        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Petya Petrov", "Director", "as1@as.com", 1990990102, 12000, 18);
        arr[1] = new Employee("Dima Dmitriev", "Manager", "as2@as.com", 1990990103, 13000, 28);
        arr[2] = new Employee("Yasha Yakovlev", "Cleaner", "as3@as.com", 1990990140, 14000, 68);
        arr[3] = new Employee("Arkadi Arkadiev", "Singer", "as4@as.com", 1990990150, 15000, 58);
        arr[4] = new Employee("Anton Antonov", "Driver", "as5@as.com", 1990990106, 16000, 48);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                System.out.println(arr[i]);
            }
        }
    }
}
