import java.util.Scanner;
import java.util.stream.Stream;

public class fib {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        int sum;
        while (count <= n){
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(b);


    }
}
