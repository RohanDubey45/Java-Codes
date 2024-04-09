import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

//        int max = 0;
//        if(a>b){
//            max = a;
//        }
//        else {
//            max = b;
//        }
//       if (c>max){
//           max = c;
//       }
//       System.out.println(max);

//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);

        System.out.print("Enter a Character: ");
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase Letters");
        }
        else {
            System.out.println("UpperCase Letters");
        }
    }
}
