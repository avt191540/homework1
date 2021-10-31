package pro.sky.java.course1.lessonMethods;

import java.time.LocalDate;

public class MainMethods {

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
//        task4();
//        task5();
//        task6();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year = 2011;
        checkIsLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2021;
        getVersionApp(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 10;
        int timeDelivery = calculateTimeDelivery(deliveryDistance);
        System.out.println(timeDelivery);
    }

    // Метод для определения высокосного года
    public static void checkIsLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    // Метод для выбора приложения
    public static void getVersionApp(int clientOS, int clientDeviceYear) {
        //clientOS may be: "0" — iOS or "1" — Android
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear) {
            System.out.println("Год превышает текущий, уточните год.");
            return;
        }
        if ((clientOS > 1 || clientOS < 0)) {
            System.out.println("Ошибка при указании ОС устройства");
            return;
        }
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // Метод для расчета времени доставки
    public static int calculateTimeDelivery(int deliveryDistance) {
        int timeDelivery = deliveryDistance / 2;
        return timeDelivery;

    }

}
