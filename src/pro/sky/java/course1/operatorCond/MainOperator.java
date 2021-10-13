package pro.sky.java.course1.operatorCond;

public class MainOperator {

    public static void main(String[] args) {

        //Задача 1

        int clientOS = 1;   //clientOS may be: "0" — iOS or "1" — Android

        System.out.println("Задача 1");

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2

        clientOS = 0;   //clientOS may be: "0" — iOS or "1" — Android
        int clientDeviceYear = 2015;

        System.out.println("Задача 2");

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3

        System.out.println("Задача 3");

        int year = 2021;

        if (year % 4 == 0) {
            if (((year % 100) != 0) || ((year % 400) == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задача 4

        System.out.println("Задача 4");


    }
}
