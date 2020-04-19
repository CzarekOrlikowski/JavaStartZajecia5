package zadanie2;

import java.util.Arrays;
import java.util.Scanner;

public class Company {
    private Employee[] employees;
    private int numberOfEmployees;
    public int currentNumberEmployees;

    public Company(int numberOfEmployees) {
        this.employees = new Employee[numberOfEmployees];
        this.numberOfEmployees = numberOfEmployees;
        this.currentNumberEmployees = 0;

    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;

    }

    public void addEmployees(int numberOfEmployees) {
        if (numberOfEmployees > this.numberOfEmployees) {
            System.out.println("Nie można wprowadzić nowego pracownika");
        } else {
            Employee[] employees = new Employee[numberOfEmployees];
            for (int i = 0; i <= numberOfEmployees - 1; i++) {
                this.employees[i] = employeeCreator();
                this.currentNumberEmployees++;
            }
        }
    }

    public void addNewEmployee(Employee employee) {
        if (currentNumberEmployees < employees.length) {
            this.employees[currentNumberEmployees] = employee;
            this.currentNumberEmployees++;
        } else {
            System.out.println("Nie można wprowadzić nowego pracownika");
        }
    }

    public void getEmployee(int index) {
        if (index <= employees.length) {
            System.out.println(this.employees[index]);
        } else {
            System.out.println("Podana wartość spoza zakresu");
        }
    }

    public Employee employeeCreator() {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Podaj imię pracownika: ");
        String firstName = scan.nextLine();
        System.out.print("Podaj nazwisko pracownika: ");
        String lastName = scan.nextLine();
        System.out.print("Podaj wynagrodzenie: ");
        Double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSalary(salary);
        return employee;
    }

    public String toString() {
        return "Company{" +
                "list=" + Arrays.toString(employees) +
                '}';
    }

}