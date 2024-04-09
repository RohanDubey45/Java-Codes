import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count < n){
            int sum = a + b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(b);
    }
}
