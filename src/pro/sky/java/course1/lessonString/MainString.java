package pro.sky.java.course1.lessonString;

public class MainString {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        System.out.println("Задание 2");

        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameForReport);

        //Задание 3
        System.out.println("Задание 3");

        String fullNameForAdmin = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForAdmin);

        //Задание 4 Вариант 1
        System.out.println("Задание 4 Вариант 1");

        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'е');
        }
        System.out.println("Данные ФИО сотрудника - " + fullName);

        //Задание 4 Вариант 2
        System.out.println("Задание 4 Вариант 2");

        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            String[] fullNameArray = fullName.split(" ");
            for (int i = 0; i < fullNameArray.length; i++) {
                if (fullNameArray[i].contains("ё")) {
                    fullNameArray[i] = fullNameArray[i].replace('ё', 'е');
                }
            }
            fullName = String.join("  ", fullNameArray);
        }
        System.out.println("Данные ФИО сотрудника - " + fullName);

        //Задание 5
        System.out.println("Задание 5");

        fullName = "Ivanov Ivan Ivanovich";
        int indexFirstGap = fullName.indexOf(' '); // Определяем индекс первого пробела
        int indexSecondGap = fullName.lastIndexOf(' '); // Определяем индекс второго пробела
        lastName = fullName.substring(0, indexFirstGap);
        firstName = fullName.substring(indexFirstGap + 1, indexSecondGap);
        middleName = fullName.substring(indexSecondGap + 1);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

        //Задание 6
        System.out.println("Задание 6");

        fullName = "ivanov ivan ivanovich";
        char[] fullNameArr = fullName.toCharArray();
        fullNameArr[0] = Character.toUpperCase(fullNameArr[0]);
        for (int i = 0; i < fullNameArr.length; i++) {
            if (fullNameArr[i] == ' ') {
                fullNameArr[i + 1] = Character.toUpperCase(fullNameArr[i + 1]);
            }
        }
        fullName = new String(fullNameArr);
        System.out.println("Верное написание Ф.И.О. сотрудника с заглавных букв - " + fullName);

        //Задание 7
        System.out.println("Задание 7");

        String string1 = "135";
        String string2 = "246";
        StringBuilder stringResultB = new StringBuilder(); /* Создаём сущность "stringResultB" с помощью
        которой создадим строку с результатом */
        char x; // Объявляем вспомогательную переменную, что бы заполнять сущность символами
        if (string1.length() != string2.length()) {
            System.out.println("Ошибка - длины строк string1 и string2 должны быть равны. Конец программы");
        } else {
            for (int i = 0; i < string1.length(); i++) {
                x = string1.charAt(i);
                stringResultB.append(x);
                x = string2.charAt(i);
                stringResultB.append(x);
            }
            String stringResult = stringResultB.toString(); // Создаем строку с результатом
            System.out.println("Данные строки - " + stringResult);
        }

        //Задание 8
        System.out.println("Задание 8");

        String stringOriginal = "aabccddefgghiijjkk";
        StringBuilder stringResultD = new StringBuilder();
        for (int i = 0; i < stringOriginal.length() - 1; i++) {
            if (stringOriginal.charAt(i) == stringOriginal.charAt(i + 1)) {
                stringResultD.append(stringOriginal.charAt(i));
                i++;
            }
        }
        System.out.println(stringResultD);


    }
}
