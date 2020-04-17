package cwiczenie3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = scan.nextInt();
        System.out.print("Podaj b: ");
        int b = scan.nextInt();
        System.out.print("Podaj c: ");
        int c = scan.nextInt();
        scan.close();

        Calculations calculations1 = new Calculations();

        System.out.println("Podałeś liczby: " + a + " " + b + " " + c);
        System.out.println("Największa: " + calculations1.maximum(a, b, c));
        System.out.println("Najmniejsza: " + calculations1.minimum(a, b, c));
        System.out.println("Srednia: " + calculations1.average(a, b, c));
    }
}

