package beginnerjava;

import java.util.Scanner;

public class packageAssignment17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("দয়া করে লাইন সংখ্যা দিন: ");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col % 2); // সংখ্যা গুলি প্রিন্ট করুন (0 অথবা 1)
            }
            System.out.println(); // প্রতি লাইনের শেষে একটি নতুন লাইনে যান
        }
    }
}
