package zadanie2;

public class EmployeeManager {
    public static void main(String[] args) {

        System.out.println("Dodawanie nowych pracowników");
        System.out.println();
        Company newCompany = new Company();
        newCompany.list = newCompany.add();

        double totalSalary = newCompany.list[0].getSalary() + newCompany.list[1].getSalary();
        System.out.println("Suma wynagrodzeń to: " + totalSalary);
        System.out.println();
        System.out.println(newCompany);

    }

}
