public class Reverse_Number {
    public static void main(String[] args) {
        rev_num(654321);
    }
    static void rev_num(int n){
        int reverse = 0;
        while (n > 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
