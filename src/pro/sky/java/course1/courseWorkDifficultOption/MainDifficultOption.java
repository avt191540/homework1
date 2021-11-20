package pro.sky.java.course1.courseWorkDifficultOption;

public class MainDifficultOption {

    public static void main(String[] args) {

        //Код для проверки написанных методов

        EmployeeBook employeeBook1 = new EmployeeBook(10);
        employeeBook1.addEmployeeBook("Иванов Иван Иванович", 2, 60000);
        employeeBook1.addEmployeeBook("Семенов Константин Григорьевич", 2, 80000);
        employeeBook1.addEmployeeBook("Петров Сергей Анатольевич", 1, 77000);
        employeeBook1.addEmployeeBook("Мишустин Михаил Владимирович", 1, 70000);
        employeeBook1.addEmployeeBook("Сидоров Александр Степанович", 3, 50000);
        employeeBook1.addEmployeeBook("Медведев Степан Александрович", 3, 40000);

        //System.out.println(Arrays.toString(employeeBook1.getEmployees()));
        employeeBook1.printAllEmployee();
        System.out.println(employeeBook1.calculationSumSalariesOfMonth());
        System.out.println(employeeBook1.searchEmployeeMinSalary());

    }


}
