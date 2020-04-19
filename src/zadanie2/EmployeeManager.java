package zadanie2;

public class EmployeeManager {
    public static void main(String[] args) {

        System.out.println("Dodawanie nowych pracowników");
        System.out.println();
        Company newCompany = new Company(3);
        newCompany.addEmployees();
//        double totalSalary = newCompany.getEmployees()[0].getSalary() + newCompany.getEmployees()[1].getSalary();
//        System.out.println("Suma wynagrodzeń to: " + totalSalary);
        System.out.println();
        System.out.println(newCompany);

    }

}
