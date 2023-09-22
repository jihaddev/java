import java.util.Scanner;

class Geekyshows {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = obj.nextInt();
        System.out.println("Enter the number of columns:");
        int n = obj.nextInt();
        int num[][] = new int[m][n];
        System.out.println("Enter Values: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = obj.nextInt();
            }
        }
        System.out.println("You Entered: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
