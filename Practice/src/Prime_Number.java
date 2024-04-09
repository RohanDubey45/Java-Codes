import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        //Prime Number Bruteforce
//        int n = 4;
//        int factor = 1;
//        for (int i = 2; i <= n; i++) {
//            if(n % i == 0){
//                factor++;
//            }
//        }
//        if(factor == 2){
//            System.out.println("Prime Number");
//        }
//        else {
//            System.out.println("Non - Prime Number");
//        }

        //Prime Number Optimized
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Neither prime nor composite");
            return;
        }
        int i = 2;
        while (i*i <= n) {
            if(n % i == 0){
                System.out.println("Not Prime");
                return;
            }
            i++;
        }
        if (i*i>n){
            System.out.println("Prime-Number");
        }

    }
}
