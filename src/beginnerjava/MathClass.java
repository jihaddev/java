package beginnerjava;

import java.sql.SQLOutput;

public class MathClass {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int max = Math.max(x, y);
        System.out.println("Maximum = " + max);
        int mim = Math.min(x, y);
        System.out.println("Minimum = " + mim);
        int absolute = Math.abs(y);
        System.out.println("Absoulte of y=" + absolute);
        double power = Math.pow(x, y);
        System.out.println("x to the power y=" + power);
        int round = Math.round(8.4f);
        System.out.println("Round of 8.4=" + round);
        double pi = Math.PI;
        System.out.println("pi=" + pi);
    }
}


