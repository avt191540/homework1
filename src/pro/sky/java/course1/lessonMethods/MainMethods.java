package pro.sky.java.course1.lessonMethods;

import java.time.LocalDate;
import java.util.Arrays;

public class MainMethods {

    public static void main(String[] args) {
//        task1();
//        task2V1();
        task2V2();
//        task3();
//        task4();
//        task5();
//        task6();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year = 2011;
        checkIsLeapYear(year);
    }

    public static void task2V1() {
        System.out.println("Задание 2 Вариант-1");
        int clientOS = 0;
        int clientDeviceYear = 2021;
        getVersionApp1(clientOS, clientDeviceYear);
    }

    public static void task2V2() {
        System.out.println("Задание 2 Вариант-2");
        int clientOS = 0;
        int clientDeviceYear = 2021;
        getVersionApp2(clientOS, clientDeviceYear);
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

    public static void task6() {
        System.out.println("Задание 6");
        //Создаем бухгалтерскую книгу трат за месяц и выводим её на консоль для контроля результатов
        int[] spendForMonth = generateRandomArray();
        System.out.println("Бухгалтерская книга трат за месяц по дням:");
        printArrayByLines(spendForMonth);
        //Вычисляем среднюю дневную сумму трат за месяц
        double averageSpendForDay = calculateAverageOfArray(spendForMonth);
        System.out.printf("Средняя дневная сумма трат в течении месяца составила %.2f рублей", averageSpendForDay);
    }

    //Вычисление среднего значения элементов массива
    public static double calculateAverageOfArray(int[] arr) {
        int sumOfArray = calculateSumOfArray(arr);
        double averageValueOfArray = (double) sumOfArray / arr.length;
        return averageValueOfArray;
    }

    // Метод для вычисления суммы элементов массива
    public static int calculateSumOfArray(int[] arr) {
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        return sumOfArray;
    }

    // Метод для печати элементов массива на консоль построчно
    public static void printArrayByLines(int[] arr) {
        int y = 0; //Чтоб выводить элементы массива на консоль построчно (15 элементов в стоке)
        for (int i : arr) {
            System.out.print(i + " ");
            y++;
            if (y % 15 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //Метод для генерации массива из 30 значений от 100 до 200 тысяч
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Метод для определения высокосного года
    public static void checkIsLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    // Метод для выбора приложения - Вариант-1
    public static void getVersionApp1(int clientOS, int clientDeviceYear) {
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

    // Метод для выбора приложения - Вариант-2
    public static void getVersionApp2(int clientOS, int clientDeviceYear) {
        //clientOS may be: "0" — iOS or "1" — Android
        //int currentYear = LocalDate.now().getYear();
        if (checkingYearOccurred(clientDeviceYear) > 0) {
            System.out.println("Год превышает текущий, уточните год.");
            return;
        }
        if ((clientOS > 1 || clientOS < 0)) {
            System.out.println("Ошибка при указании ОС устройства");
            return;
        }
        if (clientOS == 0) {
            if (checkingYearOccurred(clientDeviceYear) < 0) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (checkingYearOccurred(clientDeviceYear) < 0) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    /*Метод для проверки года по отношению к текущему. Возвращает 0 если текущий год,
    -1 если год меньше текущего и 1 если год больше текущего*/
    public static int checkingYearOccurred(int year) {
        int checkYear = 0;
        if (year < LocalDate.now().getYear()) {
            checkYear = -1;
        } else if (year > LocalDate.now().getYear()) {
            checkYear = 1;
        }
        return checkYear;
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
