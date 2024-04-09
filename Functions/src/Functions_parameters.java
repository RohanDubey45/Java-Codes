import java.util.Scanner;

public class Functions_parameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        String ans = myGreet(name);
        System.out.println(ans);
    }
   static String myGreet(String name){
        String str = "Good Evening !! " + name;
        return str;
   }

}
