
package beginnerjava;

import java.util.Scanner;

public class classtest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Sequence:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        input.close(); // Don't forget to close the Scanner.
    }
}
