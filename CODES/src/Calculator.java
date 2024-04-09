import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.print(" Select Operator (+, -, *, /, %) OR Select X to Quit");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '%' || ch == '*'){
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(ch == '+'){
                    ans = a + b;
                }
                else if (ch == '-'){
                    ans = a - b;
                }
                else if (ch == '*') {
                   ans = a * b;
                }
                else if (ch == '/') {
                    if(b!=0){
                        System.out.println("b cannot be zero");
                    }
                    ans = a/b;
                }

            }
            else if (ch == 'x' || ch == 'X') {
                break;
            }
            else {
                System.out.println("Not a valid operator..");
            }

            System.out.println(ans);
        }

    }
}
