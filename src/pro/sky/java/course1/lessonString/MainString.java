package pro.sky.java.course1.lessonString;

public class MainString {
    public static void main(String[] args) {
        //Задание 1

        System.out.println("Задание 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2

        System.out.println("Задание 2");

        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameForReport);

        //Задание 3

        System.out.println("Задание 3");

        String fullNameForAdmin = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForAdmin);

        //Задание 4


        //Задание 4 Вариант 1

        System.out.println("Задание 4 Вариант 1");

        fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);

        //Задание 4 Вариант 2

        System.out.println("Задание 4 Вариант 2");

        fullName = "Иванов Семён Семёнович";

        String[] fullNameArray = fullName.split(" ");
        fullName = "";
        for (int i = 0; i < fullNameArray.length; i++) {
            if (fullNameArray[i].contains("ё")) {
                fullNameArray[i] = fullNameArray[i].replace('ё', 'е');
            }
            fullName = fullName + fullNameArray[i] + " ";
        }
        fullName = fullName.trim();
        System.out.println("Данные ФИО сотрудника - " + fullName);


    }
}
