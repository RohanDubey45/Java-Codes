public class Palindrome_number {
    public static void main(String[] args) {
        int n = 11;
        int temp = n;
        int rem;
        int sum = 0;
        while (n > 0){
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("It's a palindrome");
        }
        else {
            System.out.println("It's not a palindrome");
        }

    }
}
