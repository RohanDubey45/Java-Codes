import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        boolean ans = isArmstrong(n);
        System.out.println(ans);

    }
    static boolean isArmstrong(int n){

        int sum = 0;
        int rem, cube;
        int original = n;

        while(n > 0){
            rem = n % 10;
            cube = rem * rem * rem;
            sum += cube;
            n = n/10;
        }
        return original == sum;
    }

}
