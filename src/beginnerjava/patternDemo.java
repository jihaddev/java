package beginnerjava;

import java.util.Scanner;

public class patternDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter line numbers : ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *"); // Space after the asterisk
            }
            System.out.println(); // Newline after each row
        }
    }
}

