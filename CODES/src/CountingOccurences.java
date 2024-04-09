import java.math.BigInteger;

public class CountingOccurences {
    public static void main(String[] args) {

        int num  = 6266356;
        int rec = 6;
        int count = 0;

        while (num > 0){
            int lastDigit = num % 10;
            if (rec == lastDigit){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
