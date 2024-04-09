public class palindrome_number {
    public static void main(String[] args) {

        boolean ans = isPalindromeNumber(12321);
        System.out.println(ans);

    }
    static boolean isPalindromeNumber(int n){

        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return original == sum;
    }
}
