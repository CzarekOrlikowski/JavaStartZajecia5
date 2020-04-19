package zadanie2;

public class EmployeeManager {
    public static void main(String[] args) {

        System.out.println("Dodawanie nowych pracowników");
        System.out.println();
        Company newCompany = new Company(4);
        newCompany.addEmployees(2);
        System.out.println("Aktualna ilość pracowników w bazie: " + newCompany.currentNumberEmployees);
        newCompany.addNewEmployee(new Employee ("c", "c", 3.0));
        System.out.println("Aktualna ilość pracowników w bazie: " + newCompany.currentNumberEmployees);
        newCompany.addNewEmployee(new Employee ("d", "d", 4.0));
        System.out.println("Aktualna ilość pracowników w bazie: " + newCompany.currentNumberEmployees);
        newCompany.getEmployee(2);

//        double totalSalary = newCompany.getEmployees()[0].getSalary() + newCompany.getEmployees()[1].getSalary();
//        System.out.println("Suma wynagrodzeń to: " + totalSalary);
        System.out.println();
        System.out.println(newCompany);

    }

}
