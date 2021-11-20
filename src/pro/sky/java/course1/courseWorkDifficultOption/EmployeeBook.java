package pro.sky.java.course1.courseWorkDifficultOption;

import pro.sky.java.course1.courseWork.Employee;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    //Добавление книги в Library
    public void addEmployeeBook(String fullName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(fullName, department, salary);
                employees[i] = employee;
                return;
            }
        }
        System.out.println("Книга сотрудников заполнена полностью. Добавление сотрудника не возможно.");
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
