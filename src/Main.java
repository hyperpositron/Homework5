public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        //Задача 1
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
    }
}