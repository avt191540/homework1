package pro.sky.java.course1.lessonMethods;

import java.time.LocalDate;
import java.util.Arrays;

public class MainMethods {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
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
        int deliveryDistance = 95;
        int timeDelivery = calculateTimeDelivery(deliveryDistance);
        if (timeDelivery == 0) {
            System.out.println("Ошибка! Дистанция должна быть больше 0 и не более 100 км.");
        } else {
            System.out.println("Потребуется дней: " + timeDelivery);
        }

    }

    public static void task4() {
        System.out.println("Задание 4");
        String stringChecked = "aabccddefgghiijjkk";
        checkStringForDouble(stringChecked);
    }

    public static void task5() {
        System.out.println("Задание 5");
        int[] arr = {3, 2, 1, 6, 5};
        System.out.println("Массив до выполнения реверса: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Массив после реверса: " + Arrays.toString(arr));
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
        int timeDelivery = 0;
        if (deliveryDistance <= 0 || deliveryDistance > 100) {
            return timeDelivery;
        }
        timeDelivery++;
        if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            timeDelivery++;
        }
        if (deliveryDistance > 60) {
            timeDelivery = timeDelivery + 2;
        }
        return timeDelivery;
    }

    // Метод для проверки строки на наличие дублей
    public static void checkStringForDouble(String stringChecked) {
        for (int i = 0; i < stringChecked.length() - 1; i++) {
            if (stringChecked.charAt(i) == stringChecked.charAt(i + 1)) {
                System.out.println("Задублирован символ: " + stringChecked.charAt(i));
                return;
            }
        }
        System.out.println("Задублированных символов в строке не обнаружено");
    }

    //Метод для реверса элементов массива (переставляет элементы массива в обратном порядке)
    public static void reverseArray(int[] arr) {
        int temporary = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temporary = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temporary;
        }
    }

}
