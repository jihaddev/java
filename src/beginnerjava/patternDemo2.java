package beginnerjava;

import java.util.Scanner;

public class patternDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter line number: ");
        int n = input.nextInt();

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " "); // Print the column numbers on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

