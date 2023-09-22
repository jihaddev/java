package beginnerjava;

public class forl0ps {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 10; i = i + 1) {
            System.out.println("The value of i is : " + i);
            sum = sum + i;
        }
        System.out.println("The summation value of i is : " + sum);
    }
}
