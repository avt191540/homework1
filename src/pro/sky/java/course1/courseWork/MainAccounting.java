package pro.sky.java.course1.courseWork;

public class MainAccounting {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        //Код для проверки написанных методов

        Employee employee1 = new Employee("Иванов Иван Иванович", 2, 60000);
        Employee employee2 = new Employee("Семенов Константин Григорьевич", 2, 80000);
        Employee employee3 = new Employee("Петров Сергей Анатольевич", 1, 77000);
        Employee employee4 = new Employee("Мишустин Михаил Владимирович", 1, 70000);
        Employee employee5 = new Employee("Сидоров Александр Степанович", 3, 50000);
        Employee employee6 = new Employee("Медведев Степан Александрович", 3, 40000);
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;

        //*********** Базовая сложность *****************

        System.out.println();
        System.out.println("********** Базовая сложность ************");
        System.out.println();
        System.out.println("Список всех сотрудников:");
        printAllEmployee();
        System.out.println("============");
        System.out.println("Сотрудник с минимальной з/п: " + searchEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной з/п: " + searchEmployeeMaxSalary());
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculationSumSalariesOfMonth() + " руб.");
        System.out.println("Средняя месячная зарплата составляет " + calculateAverageSalary() + " руб.");
        System.out.println("============");
        printFullNameAllEmployees();
        System.out.println("============");
        System.out.println();

        //************ Повышенная сложность ***************

        System.out.println("******** Повышенная сложность **********");
        System.out.println();
        indexingSalary(10);
        System.out.println("Информация по сотрудникам после индексации з/п на 10%:");
        printAllEmployee();
        System.out.println("============");
        System.out.println("Сотрудник с минимальной з/п в отделе 1: " + searchEmployeeDepartmentMinSalary(1));
        System.out.println("Сотрудник с максимальной з/п в отделе 2: " + searchEmployeeDepartmentMaxSalary(2));
        System.out.println("Сумма затрат на зарплаты в месяц по отделу 3: " + calculationSumSalariesDepartment(3) + " руб.");
        System.out.println("Средняя месячная зарплата по отделу 1 составляет " + calculateAverageSalaryDepartment(1) + " руб.");
        indexingSalaryDepartment(30, 3);
        System.out.println("============");
        System.out.println("Информация по сотрудникам после индексации з/п в отделе 3 на 30%:");
        printAllEmployee();
        System.out.println("============");
        printAllEmployeesDepartment(1);
        System.out.println("============");
        printEmployeesWithSalaryLess(70000);
        System.out.println("============");
        printEmployeesWithSalaryMoreOrEqual(71500);
    }

    //********** БАЗОВАЯ СЛОЖНОСТЬ **************************

    //Метод для определения количества сотрудников
    public static int numberEmployees() {
        int numberEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberEmployees++;
            }
        }
        return numberEmployees;
    }

    //Вывода полной информации по всем сотрудникам
    public static void printAllEmployee() {
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
    public static double calculationSumSalariesOfMonth() {
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

    //Поиск сотрудника с мини мальной зарплатой
    public static Employee searchEmployeeMinSalary() {
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

    //Поиск сотрудника с максимальной зарплатой
    public static Employee searchEmployeeMaxSalary() {
        int indexEmployee = 0; //Индекс сотрудника
        if (numberEmployees() == 0) {
            System.out.print("Список сотрудников пустой - сотрудники отсутствуют! ");
            return null;
        }
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else if (maxSalary == 0 || employees[i].getSalary() > maxSalary) {
                //Если это первая не нулевая ячейка массива или зарплата больше максимальной
                maxSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        return employees[indexEmployee];
        //Если несколько сотрудников с максимальной з/п, тогда возвращается первый по списку
    }

    //Рассчет средней месячной зарплаты
    public static double calculateAverageSalary() {
        double averageSalary = 0;
        if (numberEmployees() != 0) {
            averageSalary = calculationSumSalariesOfMonth() / numberEmployees();
        }
        return averageSalary;
    }

    //Ввод на консоль ФИО всех сотрудников
    public static void printFullNameAllEmployees() {
        System.out.println("Ф.И.О. всех сотрудников:");
        if (numberEmployees() == 0) {
            System.out.println("Список сотрудников пустой - сотрудники отсутствуют! ");
            return;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            s.append(employees[i].getFullName());
            s.append("\n");
        }
        s.deleteCharAt(s.length() - 1); //Удаляем последний "\n"
        System.out.println(s);
    }

    //****************** ПОВЫШЕННАЯ СЛОЖНОСТЬ ************************

    //Индексация зарплаты
    public static void indexingSalary(int indexSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * (double) indexSalary / 100);
            }
        }
    }

    //Метод для определения количества сотрудников в указанном отделе
    public static int numberEmployeesDepartment(int department) {
        int numberEmployeesDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                numberEmployeesDepartment++;
            }
        }
        return numberEmployeesDepartment;
    }

    //Поиск сотрудника с минимальной зарплатой в указанном отделе
    public static Employee searchEmployeeDepartmentMinSalary(int department) {
        int indexEmployee = 0; //Индекс сотрудника
        if (numberEmployeesDepartment(department) == 0) {
            System.out.print("Такого отдела нет! ");
            return null;
        }
        double minSalaryDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else if ((minSalaryDepartment == 0 || employees[i].getSalary() < minSalaryDepartment) && employees[i].getDepartment() == department) {
                //Если для этого отдела первая не нулевая ячейка массива или зарплата меньше минимальной
                minSalaryDepartment = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        return employees[indexEmployee];
        //Если несколько сотрудников с минимальной з/п, тогда возвращается первый по списку
    }

    //Поиск сотрудника с максимальной зарплатой в указанном отделе
    public static Employee searchEmployeeDepartmentMaxSalary(int department) {
        int indexEmployee = 0; //Индекс сотрудника
        if (numberEmployeesDepartment(department) == 0) {
            System.out.print("Такого отдела нет! ");
            return null;
        }
        double maxSalaryDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else if ((maxSalaryDepartment == 0 || employees[i].getSalary() > maxSalaryDepartment) && employees[i].getDepartment() == department) {
                //Если для этого отдела первая не нулевая ячейка массива или зарплата больше максимальной
                maxSalaryDepartment = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        return employees[indexEmployee];
        //Если несколько сотрудников с максимальной з/п, тогда возвращается первый по списку
    }

    //Рассчет суммы зарплат в месяц по отделу
    public static double calculationSumSalariesDepartment(int department) {
        double sumSalariesDepartment = 0;
        if (numberEmployeesDepartment(department) == 0) {
            System.out.print("Такого отдела нет! ");
            return sumSalariesDepartment;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null || employees[i].getDepartment() != department) {
                continue;
            }
            sumSalariesDepartment = sumSalariesDepartment + employees[i].getSalary();
        }
        return sumSalariesDepartment;
    }

    //Рассчет средней месячной зарплаты по отделу
    public static double calculateAverageSalaryDepartment(int department) {
        double averageSalaryDepartment = 0;
        if (numberEmployeesDepartment(department) != 0) {
            averageSalaryDepartment = calculationSumSalariesDepartment(department) / numberEmployeesDepartment(department);
        }
        return averageSalaryDepartment;
    }

    //Индексация зарплаты по отделу
    public static void indexingSalaryDepartment(int indexSalary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * (double) indexSalary / 100);
            }
        }
    }

    //Ввод на консоль информации о всех сотрудников указанного отдела
    public static void printAllEmployeesDepartment(int department) {
        System.out.println("Список сотрудников отдела " + department + ":");
        if (numberEmployeesDepartment(department) == 0) {
            System.out.print("Такого отдела нет! ");
            return;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null || employees[i].getDepartment() != department) {
                continue;
            }
            s.append(employees[i].getFullName() + ", salary " + employees[i].getSalary() + ", id " + employees[i].getId());
            s.append("\n");
        }
        s.deleteCharAt(s.length() - 1); //Удаляем последний "\n"
        System.out.println(s);
    }

    //Печать списка сотрудников с зарплатой меньше указанной
    public static void printEmployeesWithSalaryLess(double salary) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null || employees[i].getSalary() >= salary) {
                continue;
            }
            s.append(employees[i].getFullName() + ", salary " + employees[i].getSalary() + ", id " + employees[i].getId());
            s.append("\n");
        }
        if (s.length() == 0) {
            System.out.println("Сотрудников с з/п меньше " + salary + " нет");
            return;
        }
        s.deleteCharAt(s.length() - 1); //Удаляем последний "\n"
        System.out.println("Список сотрудников с зарплатой меньше " + salary + " руб.:");
        System.out.println(s);
    }

    //Печать списка сотрудников с зарплатой больше или равной указанной
    public static void printEmployeesWithSalaryMoreOrEqual(double salary) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null || employees[i].getSalary() < salary) {
                continue;
            }
            s.append(employees[i].getFullName() + ", salary " + employees[i].getSalary() + ", id " + employees[i].getId());
            s.append("\n");
        }
        if (s.length() == 0) {
            System.out.println("Сотрудников с з/п больше или равной " + salary + " нет");
            return;
        }
        s.deleteCharAt(s.length() - 1); //Удаляем последний "\n"
        System.out.println("Список сотрудников с зарплатой больше или равной " + salary + " руб.:");
        System.out.println(s);
    }
}
