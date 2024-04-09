import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

//       CheckPrime(98); bruteforce

        boolean ans = isPrime(1); //effective soln
        System.out.println(ans);

    }
    //bruteforce
//    static void CheckPrime(int n){
//        if(n<=1){
//            System.out.println("Neither prime nor composite");
//        }
//        int count = 1;
//        for(int i = 2; i <= n; i++){
//            if(n % i == 0){
//                count++;
//            }
//        }
//        if(count==2){
//            System.out.println("It's a prime number");
//        }
//        else {
//            System.out.println("Non-prime number");
//        }
//    }

//    effective soln
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int i = 2;
        while (i * i <= n){
            if(n % i == 0){
                return  false;
            }
            i++;
        }
        return i * i > n;
    }

}
