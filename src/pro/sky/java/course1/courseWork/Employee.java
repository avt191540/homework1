package pro.sky.java.course1.courseWork;

import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final String fullName;
    private final int id;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return fullName + " from department " + department + ", salary " + salary +
                ", id " + id;
    }
}
