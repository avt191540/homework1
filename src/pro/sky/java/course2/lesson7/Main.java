package pro.sky.java.course2.lesson7;

public class Main {
    public static void main(String[] args) {

        //Код для проверки написанных методов
        EmployeeMap employeeMap1 = new EmployeeMap();
        employeeMap1.addOrEditEmployee("Иванов Иван Иванович", 2, 60000);
        employeeMap1.addOrEditEmployee("Семенов Константин Григорьевич", 2, 80000);
        employeeMap1.addOrEditEmployee("Петров Сергей Анатольевич", 1, 77000);
        employeeMap1.addOrEditEmployee("Мишустин Михаил Владимирович", 1, 70000);
        employeeMap1.addOrEditEmployee("Сидоров Александр Степанович", 3, 50000);
        employeeMap1.addOrEditEmployee("Медведев Степан Александрович", 3, 40000);

        employeeMap1.printAllEmployee();

        employeeMap1.removeEmployee("Иванов Иван Иванович");

        employeeMap1.printAllEmployee();


//        //System.out.println(Arrays.toString(employeeBook1.getEmployees()));
//
//        employeeBook1.printAllEmployee();
//        System.out.println(employeeBook1.calculationSumSalariesOfMonth());
//        System.out.println(employeeBook1.searchEmployeeMinSalary());
//        employeeBook1.deleteEmployeeFromBook("Семенов Константин Григорьевич", 2);
//        employeeBook1.printAllEmployee();
//        employeeBook1.addEmployeeBook("Семенов Константин Григорьевич", 2, 80000);

    }
}
