package cwiczenie2;

import java.util.Scanner;

public class UserCreator {

    User create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imię: ");
        String firstName = scanner.nextLine();
        System.out.print("Nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pesel: ");
        int pesel = scanner.nextInt();
        User user = new User(firstName, lastName, age, pesel);
        return user;
    }
}