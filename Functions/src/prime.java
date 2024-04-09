public class prime {
    public static void main(String[] args) {
        Check(23);
    }
    static void Check(int n){
        int count = 1;
        for(int i = 2; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Non - Prime Number");
        }
    }

}
