package beginnerjava;

import java.util.Scanner;

public class ArmatrongDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.println("Enter any number : ");
        num = input.nextInt();

        temp = num;
        while (temp !=0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp /10;
        }
        if (num==sum){
            System.out.println("Armatrong number");
        }
        else {
            System.out.println("Not Armatrong number");

        }
    }
}
