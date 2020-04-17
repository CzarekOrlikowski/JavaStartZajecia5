package cwiczenie4;

public class MathQuizTest {
    public static void main(String[] args) {

        System.out.println("Zapraszamy do matematycznego quizu");
        System.out.println();

        MathQuiz mathQuiz1 = new MathQuiz();
        boolean result1 = mathQuiz1.question1();
        boolean result2 = mathQuiz1.question2();
        boolean result3 = mathQuiz1.question3();

        System.out.println();
        System.out.println("Odpowiedź 1: " + result1);
        System.out.println("Odpowiedź 2: " + result2);
        System.out.println("Odpowiedź 3: " + result3);
        System.out.println();

        System.out.println("Lącznie: " + mathQuiz1.overall + "/3 dobrych odpowiedzi");

    }
}
