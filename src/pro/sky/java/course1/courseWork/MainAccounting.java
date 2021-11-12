package pro.sky.java.course1.courseWork;

public class MainAccounting {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 2, 60000);
        Employee employee2 = new Employee("Петров Сергей Анатольевич", 1, 70000);
        Employee employee3 = new Employee("Сидоров Александр Степанович", 3, 50000);
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        System.out.println(employee1);
        System.out.println(employees[2]);
        printAllEmployee();

    }


    //Метод для вывода полной информации по всем сотрудникам
    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i]);
        }
    }

    public static int calculationSumSalariesOfMonth() {
        int sum = 0;
        return sum;
    }

    public static Employee searchEmployeeMinimumSalary() {
        return employees[0];
    }

    public static Employee searchEmployeeMaxSalary() {
        return employees[0];
    }

    public static double calculateAverageSalary() {
        double averageSalary = 55210.28;
        return averageSalary;
    }

    public static void printFullNameAllEmployees() {

    }


}
