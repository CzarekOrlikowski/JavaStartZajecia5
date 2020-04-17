package cwiczenie3;

public class Calculations {

    public int maximum (int a, int b, int c){
        if (a > b && a > c){
            return  a;
        } else if (b > c){
            return b;
        } else return c;
    }

    public int minimum (int a, int b, int c){
        if (a < b && a < c){
            return  a;
        } else if (b < c){
            return b;
        } else return c;
    }

    public double average (int a, int b, int c){
        return (a + b + c)/3;
    }
}
