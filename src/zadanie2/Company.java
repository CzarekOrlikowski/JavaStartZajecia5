package zadanie2;

import java.util.Arrays;
import java.util.Scanner;

public class Company {
    public Employee[] list;

   public Company() {

   }

   Scanner scan = new Scanner(System.in);

   public Employee[] add (){
       Employee[] table = new Employee[2];
       table[0] = employeeCreator();
       table[1] = employeeCreator();
       return table;
   }

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

     public String toString() {
        return "Company{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
