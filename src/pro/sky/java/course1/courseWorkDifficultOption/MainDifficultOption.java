package pro.sky.java.course1.courseWorkDifficultOption;

import java.util.Arrays;

public class MainDifficultOption {

    public static void main(String[] args) {
        //Код для проверки написанных методов

//        Employee employee1 = new Employee("Иванов Иван Иванович", 2, 60000);
//        System.out.println(employee1);

        EmployeeBook employeeBook1 = new EmployeeBook(10);
        employeeBook1.addEmployeeBook("Иванов Иван Иванович", 2, 60000);
        System.out.println(Arrays.toString(employeeBook1.getEmployees()));
    }


}
