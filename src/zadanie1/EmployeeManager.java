package zadanie1;

public class EmployeeManager {
    public static void main(String[] args) {

        System.out.println("Dodawanie nowych pracowników");
        System.out.println();
        Employee[] list = new Employee[2];
        EmployeeCreator creator = new EmployeeCreator();
        list[0] = creator.employeeCreator();
        list[1] = creator.employeeCreator();
        double totalSalary = list[0].getSalary() + list[1].getSalary();

        System.out.println("Suma wynagrodzeń to: " + totalSalary);

    }

}
