package cwiczenie5;

import java.util.Scanner;

public class DaysTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer dnia tygodnia (1-7): ");
        int day = scanner.nextInt();
        scanner.close();

        Days days = new Days();

        if (day < 1 || day > 7) {
            System.out.println(days.dayName(day));
        } else {
            System.out.println("Wybrałeś: " + days.dayName(day) + "/" + days.dayType(day));
        }
    }
}

