package pro.sky.java.course1.lessonCycles;

public class MainCycles {

    public static void main(String[] args) {

        //Задание 1

        System.out.println("Задание 1");

        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println("\n");
        n--;
        for (; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        //Задание 2

        System.out.println("Задание 2");

        int dateFirstFriday = 1;
        for (; dateFirstFriday <= 31; dateFirstFriday = dateFirstFriday + 7) {
            System.out.println("Сегодня пятница, " + dateFirstFriday + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3

        System.out.println("Задание 3");

        int yearCurrent = 2021;
        int yearLessBy200 = yearCurrent - 200;
        int yearMoreBy100 = yearCurrent + 100;
        for (int i = yearMoreBy100; i >= yearLessBy200; i = i - 1) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        //Задание 4

        System.out.println("Задание 4");

        for (int i = 1; i <= 30; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + ": ping pong");
            }
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println(i + ": ping");
            }
            if ((i % 3 != 0) && (i % 5 == 0)) {
                System.out.println(i + ": pong");
            }
            if ((i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i + ":");
            }
        }

        //Задание 5

        System.out.println("Задание 5");

        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= 8; i++) {
            System.out.print((a + b) + " ");
            b = a + b;
            a = b - a;
        }


    }
}
