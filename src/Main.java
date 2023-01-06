public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task2_2();
        task2_3();
        //task3();
        //task4();
        //task5();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
    }

    public static void task2() {
        //Задача 2 - с вложенным if (двухэтажный)
        System.out.println("Задача №2 - с вложенным if (двухэтажный)");// 1 - android, 0 - iOS
        int clientDeviceYear = 2014;
        int clientOS = 1;

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015)
                if (clientOS == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
        }
    }

    public static void task2_2() {
        //Задача 2_2 По условию задачи
        System.out.println("Задача №2_2 По условию задачи");// 1 - android, 0 - iOS
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task2_3() {
        //Задача 2_3 с применением Тернарного оператора
        System.out.println("Задача №2_3 с применением Тернарного оператора"); // 1 - android, 0 - iOS
        int clientOS = 0;
        int clientDeviceYear = 2015;
        String osString = clientOS == 1 ? "Android" : "iOS";
        String version = clientDeviceYear >= 2015 ? "" : "облегченную";
        System.out.println("Установите " + version + " версию приложения для " + osString + " по ссылке");
    }
}