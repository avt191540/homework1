package pro.sky.java.course1.variabls;

public class Main {
    public static void main(String[] args) {

        //Задача 1

        int x = 1000;
        byte y = 100;
        short z = 600;
        long n = 3000L;
        float f = 36.96f;
        double m = 52.6985;
        char t = 'j';

        //Задача 2

        float weightBox1 = 78.2f;
        float weightBox2 = 82.7f;
        System.out.println("Задача 2");
        System.out.println("Общий вес боксеров = " + (weightBox1 + weightBox2) + " кг.");
        System.out.println("Разница в весе боксеров = " + (weightBox2 - weightBox1) + " кг.");

        //Задача 3

        int numberBananas = 5;
        int millilitersMilk = 200;
        int briquetteIceCream = 2;
        int numberEgg = 4;
        int weightOneBananaasGram = 80;
        int weight100mlMilkGram = 105;
        int weightBriquetteIceCreamGram = 100;
        int weightOneEggGram = 70;
        float sportsBreakfastGram;
        sportsBreakfastGram = numberBananas * weightOneBananaasGram +
                (millilitersMilk / 100) * weight100mlMilkGram +
                briquetteIceCream * weightBriquetteIceCreamGram +
                numberEgg * weightOneEggGram;
        float sportsBreakfastKilogram;
        sportsBreakfastKilogram = sportsBreakfastGram / 1000;
        System.out.println("Задача 3");
        System.out.println("Общий вес спорт-завтрака " + sportsBreakfastKilogram + " кг.");

        // Задача 4

        int weightLoseKg = 7;
        int weightLoseDayMinGram = 250;
        int weightLoseDayMaxGram = 500;
        int dayLoseMin = weightLoseKg * 1000 / weightLoseDayMaxGram;
        System.out.println("Задача 4");
        System.out.println("Минимальное количество дней на похудение = " + dayLoseMin);
        int dayLoseMax = weightLoseKg * 1000 / weightLoseDayMinGram;
        System.out.println("Максимальное количество дней на похудение = " + dayLoseMax);
        int dayLoseMiddle = (dayLoseMin + dayLoseMax) / 2;
        System.out.println("Количество дней на похудение в среднем = " + dayLoseMiddle);

        // Задача 5

        int salaryMashaToDayRub = 67760;
        int salaryDenisToDayRub = 83690;
        int salaryKristinaToDayRub = 76230;
        int growthSalaryPercent = 10;
        int salaryMashaNewRub = salaryMashaToDayRub + (salaryMashaToDayRub / 100) * growthSalaryPercent;
        int salaryDenisNewRub = salaryDenisToDayRub + (salaryDenisToDayRub / 100) * growthSalaryPercent;
        int salaryKristinaNewRub = salaryKristinaToDayRub + (salaryKristinaToDayRub / 100) * growthSalaryPercent;
        System.out.println("Задача 5");
        System.out.println("Маша теперь получает " + salaryMashaNewRub + " рублей. " +
                "Годовой доход вырос на " + (salaryMashaNewRub - salaryMashaToDayRub) * 12 + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisNewRub + " рублей. " +
                "Годовой доход вырос на " + (salaryDenisNewRub - salaryDenisToDayRub) * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaNewRub + " рублей. " +
                "Годовой доход вырос на " + (salaryKristinaNewRub - salaryKristinaToDayRub) * 12 + " рублей.");

        // Задача 6

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("Задача 6");
        System.out.println("Инвертированный результат выражения: a*(b+(c-d*e)) равен " + (result * -1));

        // Задача 7

        int w = 5;
        int v = 7;
        System.out.println("Задача 7");
        System.out.println("W = " + w + " и V = " + v);
        w = w * v;
        v = w / v;
        w = w / v;
        System.out.println("W = " + w + " и V = " + v);

    }
}
