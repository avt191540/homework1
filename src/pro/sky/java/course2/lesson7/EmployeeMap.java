package pro.sky.java.course2.lesson7;

import pro.sky.java.course1.courseWork.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private final Map<String, Employee> employeeMap;

    public EmployeeMap() {
        this.employeeMap = new HashMap<String, Employee>();
    }

    //Добавление сотрудника в книгу или редактирование
    public void addOrEditEmployee(String fullName, int department, double salary) {
        Employee employee = new Employee(fullName, department, salary);
        employeeMap.put(fullName, employee);
    }

    //Вывод всех записей в книге сотрудников
    public void printAllEmployee() {
        if (employeeMap.isEmpty()) {
            System.out.println("В книге сотрудников нет записей.");
            return;
        }
        for (Employee employee : employeeMap.values()) {
            System.out.println(employee);
        }

    }

    // Удаление записи из книги сотрудников
    public void removeEmployee(String fullName) {
        if (employeeMap.isEmpty()) {
            System.out.println("В книге сотрудников нет записей.");
            return;
        }
        if (employeeMap.remove(fullName) == null) {
            System.out.println("В книге нет записи о сотруднике: " + fullName);
        } else {
            System.out.println("В книге удалена запись о сотруднике: " + fullName);
        }
//        for (String name: employeeMap.keySet()) {
//            if (name.equals(fullName)) {
//
//            }
//            System.out.println(employee);
    }
}
