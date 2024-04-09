public class Armstrong_Number {
    public static void main(String[] args) {

        boolean ans = isArmstrong(153);
        System.out.println(ans);

    }
    static boolean isArmstrong(int n){
        int temp = n;
        int rem, cube;
        int sum = 0;
        while (n > 0){
            rem = n % 10;
            cube = rem * rem * rem;
            sum = sum + cube;
            n = n /10;
        }
        return temp == sum;
    }
}
