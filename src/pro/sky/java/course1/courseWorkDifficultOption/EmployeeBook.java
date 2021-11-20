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

    //Метод для определения количества сотрудников
    public int numberEmployees() {
        int numberEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberEmployees++;
            }
        }
        return numberEmployees;
    }

    //Вывода полной информации по всем сотрудникам
    public void printAllEmployee() {
        if (numberEmployees() == 0) {
            System.out.println("Список сотрудников пустой - сотрудники отсутствуют! ");
            return;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            s.append(employees[i].toString());
            s.append("\n");
        }
        s.deleteCharAt(s.length() - 1); //Удаляем последний "\n"
        System.out.println(s);
    }

    //Рассчет суммы зарплат в месяц
    public double calculationSumSalariesOfMonth() {
        double sumSalaries = 0;
        if (numberEmployees() == 0) {
            System.out.print("Список сотрудников пустой - сотрудники отсутствуют! ");
            return sumSalaries;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            sumSalaries = sumSalaries + employees[i].getSalary();
        }
        return sumSalaries;
    }

    //Поиск сотрудника с минимальной зарплатой
    public Employee searchEmployeeMinSalary() {
        int indexEmployee = 0; //Индекс сотрудника
        if (numberEmployees() == 0) {
            System.out.print("Список сотрудников пустой - сотрудники отсутствуют! ");
            return null;
        }
        double minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else if (minSalary == 0 || employees[i].getSalary() < minSalary) {
                //Если это первая не нулевая ячейка массива или зарплата меньше минимальной
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        return employees[indexEmployee];
        //Если несколько сотрудников с минимальной з/п, тогда возвращается первый по списку
    }
}
