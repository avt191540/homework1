package pro.sky.java.course1.lessonArray;
import java.util.Arrays;

public class MainArray {
    int[] arr = generateRandomArray();

    public static void main(String[] args) {

        //Создаем бухгалтерскую книгу трат за месяц и выводим её на консоль для контроля результатов

        int[] spendForMonth = generateRandomArray();

        System.out.println("Бухгалтерская книга трат за месяц по дням:");

        int y = 1; //Чтоб вывести траты на консоль двумя строками
        for (int i : spendForMonth) {
            System.out.print(i + " ");
            y++;
            if (y == 16) {
                System.out.println();
            }
        }
        System.out.println();

        //Задание 1

        System.out.println("Задание 1");

        int sumSpendForMonth = 0;

        for (int i : spendForMonth) {
            sumSpendForMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumSpendForMonth + " рублей");

        //Задание 2

        System.out.println("Задание 2");

        int minSpendForDay = 200000;
        int maxSpendForDay = 0;

        for (int i : spendForMonth) {
            if (i > maxSpendForDay) {
                maxSpendForDay = i;
            }
            if (i < minSpendForDay) {
                minSpendForDay = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendForDay + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSpendForDay + " рублей");

        //Задание 3 Вариант-1

        System.out.println("Задание 3 Вариант-1");

        //double sumSpendMiddlForMonth1 = (double) sumSpendForMonth/spendForMonth.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", (double) sumSpendForMonth / spendForMonth.length);
        System.out.println();

        //Задание 3 Вариант-2

        System.out.println("Задание 3 Вариант-2");

        double averageSpendForMonth = 0;
        for (int i : spendForMonth) {
            averageSpendForMonth += (double) i / spendForMonth.length;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageSpendForMonth);
        System.out.println();

        //Задание 4

        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //Задание 5

        System.out.println("Задание 5");

        int[][] matrix = new int[3][3];
        int x = 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = x;
            matrix[2 - i][i] = x;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6

        System.out.println("Задание 6");

        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));

        //Задание 7

        System.out.println("Задание 7");

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr2));
        int temporary = 0;
        for (int i = 0; i < arr2.length / 2; i++) {
            temporary = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temporary;
        }
        System.out.println(Arrays.toString(arr2));

        //Задание 9

        System.out.println("Задание 9");

        int[] arr4 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr4);
        for (int i = 0; i < arr4.length - 1; i++) {
            for (int j = i + 1; j < arr4.length; j++) {
                if (arr4[i] + arr4[j] == -2) {
                    System.out.print("Числа: " + arr4[i] + " и " + arr4[j] + "; ");
                }
            }
        }
        System.out.println();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
