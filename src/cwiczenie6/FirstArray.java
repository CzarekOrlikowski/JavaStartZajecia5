package cwiczenie6;

import java.util.Locale;
import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args) {

        double[] array = new double[3];
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Podaj 1 liczbę zmiennoprzecinkową: ");
        array[0] = scanner.nextDouble();
        System.out.print("Podaj 2 liczbę zmiennoprzecinkową: ");
        array[1] = scanner.nextDouble();
        System.out.print("Podaj 3 liczbę zmiennoprzecinkową: ");
        array[2] = scanner.nextDouble();
        double sum = array[0] + array[1] + array[2];
        System.out.println("Suma liczb " + array[0] + " + " + array[1] + " + " + array [2] + " to " + sum);
        System.out.printf("%.2f + %.2f + %.2f = %.2f", array[0], array[1], array[2], sum);
    }
}
