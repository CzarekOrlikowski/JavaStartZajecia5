package cwiczenie4;

import java.util.Scanner;

public class MathQuiz {

    Scanner scan = new Scanner(System.in);
    int overall = 0;

    public boolean question1() {
        System.out.print("1. Podaj wynik mnożenia 3 * 5 : ");
        int result = scan.nextInt();
        if (result == 15) {
            overall = 1;
            return true;
        } else return false;
    }

    public boolean question2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("2. Podaj pole kwadratu o boku 12 : ");
        int result = scan.nextInt();
        if (result == 144) {
            overall = 2;
            return true;
        } else return false;
    }

    public boolean question3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("3. Podaj pierwiastek kwadratowy z liczby 9 : ");
        int result = scan.nextInt();
        if (result == 3) {
            overall = 3;
            return true;
        } else return false;
    }
}
