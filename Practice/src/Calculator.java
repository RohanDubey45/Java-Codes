import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true){
            int ans = 0;
            System.out.print("Select a operator from (+,-,*,/,%) or x to exit : ");
            char ch = sc.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '/' || ch == '%' || ch == '*'){
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(ch == '+'){
                    ans = a + b;
                }
                if(ch == '-'){
                    ans = a - b;
                }
                if(ch == '/'){
                    ans = a / b;
                }
                if(ch == '*'){
                    ans = a * b;
                }
                if(ch == '%'){
                    ans = a % b;
                }
            }
            else if (ch == 'x' || ch == 'X'){
                break;
            }
            else {
                System.out.println("Please enter a valid operator");
            }
            System.out.println(ans);
        }

    }
}
