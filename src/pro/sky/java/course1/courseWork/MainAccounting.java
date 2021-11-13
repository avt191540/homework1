package pro.sky.java.course1.courseWork;

public class MainAccounting {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        //Код для проверки написанных методов
        Employee employee1 = new Employee("Иванов Иван Иванович", 2, 60000);
        Employee employee2 = new Employee("Петров Сергей Анатольевич", 1, 77000);
        Employee employee3 = new Employee("Сидоров Александр Степанович", 3, 50000);
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        System.out.println("Список всех сотрудников:");
        printAllEmployee();
        System.out.println("============");
        System.out.println("Количество сотрудников с списке: " + numberEmployees());
        System.out.println("Сотрудник с минимальной з/п: " + searchEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной з/п: " + searchEmployeeMaxSalary());
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculationSumSalariesOfMonth() + " руб.");
        System.out.println("Средняя месячная зарплата составляет " + calculateAverageSalary() + " руб.");
        System.out.println("============");
        printFullNameAllEmployees();
    }

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
    public static int calculationSumSalariesOfMonth() {
        int sumSalaries = 0;
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
            return employees[indexEmployee];
            /*Если массив не заполнен сотрудниками, тогда на консоль выводится сообщение и
        возвращается первяя ячейка массива, и в ней будет null */
        }
        int minSalary = 0;
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
            return employees[indexEmployee];
            /*Если массив не заполнен сотрудниками, тогда на консоль выводится сообщение и
        возвращается первяя ячейка массива, и в ней будет null */
        }
        int maxSalary = 0;
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
            averageSalary = (double) calculationSumSalariesOfMonth() / numberEmployees();
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
}
