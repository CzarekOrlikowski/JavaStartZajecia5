package zadanie1;

import java.util.Scanner;

public class EmployeeCreator {

    Scanner scan = new Scanner(System.in);

    public Employee employeeCreator() {
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
}
