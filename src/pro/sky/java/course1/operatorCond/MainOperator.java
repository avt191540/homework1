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

        clientOS = 1;   //clientOS may be: "0" — iOS or "1" — Android
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

        //Решение задания 2 другим способом

        System.out.println("Задача 2 вариант 2");

        clientOS = 1;   //clientOS may be: "0" — iOS or "1" — Android
        clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3

        System.out.println("Задача 3");

        int year = 2021;

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задача 4

        System.out.println("Задача 4");

        // int deliveryDistance = 95;
        // int timeDelivery = ((deliveryDistance + 19) / 40) + 1;
        // System.out.println("Потребуется дней: " + timeDelivery);

        int deliveryDistance = 95;
        int deliveryDistanceMax = 100;
        int timeDelivery = 1;
        int timeFound = 0; //Флаг нахождения времени доставки: "0"- найдено и "1" - не найдено


        if ((deliveryDistance <= 20) && (timeFound == 0)) {
            System.out.println("Потребуется дней: " + timeDelivery);
            timeFound = 1;
        }
        timeDelivery = timeDelivery + 1;

        if (((deliveryDistance > 20) && (deliveryDistance <= 60)) && (timeFound == 0)) {
            System.out.println("Потребуется дней: " + timeDelivery);
            timeFound = 1;
        }
        timeDelivery = timeDelivery + 1;

        if (((deliveryDistance > 60) && (deliveryDistance <= 100)) && (timeFound == 0)) {
            System.out.println("Потребуется дней: " + timeDelivery);
            timeFound = 1;
        }
        timeDelivery = timeDelivery + 1;

        if (((deliveryDistance > 100) && (deliveryDistance <= 100)) && (timeFound == 0)) {
            System.out.println("Потребуется дней: " + timeDelivery);
            timeFound = 1;
        }
        timeDelivery = timeDelivery + 1;

        if (deliveryDistance > deliveryDistanceMax) {
            System.out.println("К сожалению по данному адресу доставка не осуществляется");
        }

        //Решение задания 4 другим способом

        System.out.println("Задача 4 вариант 2");

        deliveryDistance = 95;
        timeDelivery = 1;

        if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            timeDelivery++;
        }
        if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
            timeDelivery = timeDelivery + 2;
        }
        if (deliveryDistance > 100) {
            System.out.println("К сожалению по данному адресу доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + timeDelivery);
        }


        //Задача 5

        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Месяца под номером " + monthNumber + " не существует");
        }

        //Задача 6

        System.out.println("Задача 6");

        int age = 19;
        int salary = 58000;

        if ((salary < 50000) && (age < 23)) {
            System.out.println
                    ("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
        }
        if ((salary < 50000) && (age >= 23)) {
            System.out.println
                    ("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
        }
        if (((salary >= 50000) && (salary < 80000)) && (age < 23)) {
            System.out.println
                    ("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.2) + " рублей");
        }
        if (((salary >= 50000) && (salary < 80000)) && (age >= 23)) {
            System.out.println
                    ("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.2) + " рублей");
        }
        if ((salary >= 80000) && (age < 23)) {
            System.out.println
                    ("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.5) + " рублей");
        }
        if ((salary >= 80000) && (age >= 23)) {
            System.out.println
                    ("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.5) + " рублей");
        }

        //Задача 7

        System.out.println("Задача 7");

        int age1 = 25;
        int salary1 = 60000;
        int wantedSum = 330000;
        float paymentLoanBasic = (float) (wantedSum + wantedSum * 0.1) / 12;

        if ((age1 < 23) && (salary1 <= 80000)) {
            if ((paymentLoanBasic + wantedSum * 0.01 / 12) < (salary1 / 2)) {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * 0.01 / 12) + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * 0.01 / 12) + " рублей. Отказано");
            }
        }
        if (((age1 >= 23) && (age1 < 30)) && (salary1 <= 80000)) {
            if ((paymentLoanBasic + wantedSum * 0.005 / 12) < (salary1 / 2)) {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * 0.005 / 12) + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * 0.005 / 12) + " рублей. Отказано");
            }
        }
        if ((age1 >= 30) && (salary1 <= 80000)) {
            if (paymentLoanBasic < (salary1 / 2)) {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        paymentLoanBasic + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        paymentLoanBasic + " рублей. Отказано");
            }
        }
        if ((age1 < 23) && (salary1 > 80000)) {
            if ((paymentLoanBasic + wantedSum * (0.01 / 12 - 0.07 / 12)) < (salary1 / 2)) {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * (0.01 / 12 - 0.07 / 12)) + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * (0.01 / 12 - 0.07 / 12)) + " рублей. Отказано");
            }
        }
        if (((age1 >= 23) && (age1 < 30)) && (salary1 > 80000)) {
            if ((paymentLoanBasic + wantedSum * (0.005 / 12 - 0.007 / 12)) < (salary1 / 2)) {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * (0.005 / 12 - 0.007 / 12)) + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic + wantedSum * (0.005 / 12 - 0.007 / 12)) + " рублей. Отказано");
            }
        }
        if ((age1 >= 30) && (salary1 > 80000)) {
            if ((paymentLoanBasic - wantedSum * 0.007 / 12) < (salary1 / 2)) {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic - wantedSum * 0.007 / 12) + " рублей. Одобрено");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary1 +
                        " равен " + (salary1 / 2) + " рублей. Платеж по кредиту " +
                        (paymentLoanBasic - wantedSum * 0.007 / 12) + " рублей. Отказано");
            }
        }

    }
}
