public class Counting_Occurences {
    public static void main(String[] args) {

        int n = 133543323;
        int num = 3;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == num){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
