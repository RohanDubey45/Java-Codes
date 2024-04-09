import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // Lec 9 done
        Scanner sc = new Scanner(System.in);

        //To check largest of 3 numbers
//        System.out.print("Enter 3 numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
////        int max = a;
////        if(b>max){
////            max = b;
////        }
////        if (c>max){
////            max = c;
////        }
////        System.out.println(max);
//        int max = Math.max(a,Math.max(b,c));
//        System.out.println(max);

        //To check the letters case upper or lower
//        System.out.print("Enter a character: ");
//        char ch = sc.next().trim().charAt(0);
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("Lower-case alphabets");
//        }
//        else{
//            System.out.println("Upper-case alphabets");
//        }

//        fib series with printing using for loop
//        int a = 0;
//        int b = 1;
//        int n = 7;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        for (int i = 2; i <= n ; i++) {
//            int sum = a + b;
//            a = b;
//            b = sum;
//            System.out.print(b+" ");
//        }

        //Counting occurrences of a number
//        int n = 6266356;
//        int num = 6;
//        int count = 0;
//
//        while (n > 0){
//            int rem = n % 10;
//            if (rem == num){
//                count++;
//            }
//            n /= 10;
//        }
//        System.out.println(count);

        // Reversing a number
//        int n = 123456;
//        System.out.println(n);
//        int ans = 0;
//        while (n > 0){
//            int rem = n % 10;
//            ans = ans * 10 + rem;
//            n /= 10;
//        }
//        System.out.println(ans);

//        Calculator
//       while (true){
//           int ans = 0;
//           System.out.print("Enter a operator or x to quit: ");
//           char op = sc.next().trim().charAt(0);
//
//           if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//
//               System.out.print("Enter two numbers: ");
//               int a = sc.nextInt();
//               int b = sc.nextInt();
//
//               if(op == '+'){
//                   ans = a + b;
//               }
//               if(op == '-'){
//                   ans = a - b;
//               }
//               if(op == '*'){
//                   ans = a * b;
//               }
//               if(op == '/'){
//                   ans = a / b;
//               }
//               if(op == '%'){
//                   ans = a % b;
//               }
//
//           } else if (op == 'x' || op == 'X') {
//               break;
//           }
//           else {
//               System.out.println("Please enter a valid operator");
//           }
//           System.out.println(ans);
//       }

        //prime number bruteforce
//        int n = 6;
//        int count = 1;
//        for (int i = 2; i <= n; i++) {
//            if(n % i == 0){
//                count++;
//            }
//        }
//        if (count == 2){
//            System.out.println("prime-number");
//        }
//        else {
//            System.out.println("not a prime-number");
//        }

        //Prime Number optimize solution
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int i;
//        for (i = 2; i*i <= n ; i++) {
//            if(n % i == 0){
//                System.out.println("Non-prime number");
//            }
//        }
//        if (i*i>n){
//            System.out.println("Prime-number");
//        }

//      Reverse String
//        String og = "rohan";
//        System.out.println(og.length());
//          String rev = "";
//
//        for (int i = og.length()-1; i >= 0; i--) {
//            rev = rev + og.charAt(i);
//        }
//        System.out.println(rev);

        //Printing factors of all the numbers
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if(n % i == 0){
//                System.out.print(i+" ");
//            }
//        }
          //print sum of all the numbers user enters until user hits 0
//        int sum = 0;
//        while (true){
//            System.out.print("Enter a number: ");
//            int n = sc.nextInt();
//            if(n == 0){
//                break;
//            }
//            sum = sum + n;
//        }
//        System.out.println(sum);

        //print largest of all the numbers user enters till user hits 0
//        int max = 0;
//        while (true){
//            System.out.print("Enter a number: ");
//            int n = sc.nextInt();
//              if(n < 0){
//                  System.out.println("please enter a valid  number");
//              }
//            if (n == 0){
//                break;
//            }
//            if(n > max){
//                max = n;
//            }
//        }
//        System.out.println("Maximum is: " +max);

//        int n = 7;
//        int product = 1;
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            product = product * i;
//            sum = sum + i;
//        }
//        System.out.println(product);
//        System.out.println(sum);
//
//        int result = product - sum;
//        System.out.println(result);

        //To check if a number is palindrome or not
//        System.out.println("enter a number: ");
//        int n = sc.nextInt();
//        int n = 1212;
//        int temp = n;
//        int ans = 0;
//        while (n > 0){
//            int rem = n % 10;
//            ans = ans * 10 + rem;
//            n /= 10;
//        }
//        if (temp == ans){
//            System.out.println("Palindrome-number");
//        }
//        else {
//            System.out.println("Not a palindrome number");
//        }

        //To check if the string is palindrome or not
//        String str = "aa";
//        String rev = "";
//        for (int i = str.length()-1; i >= 0 ; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (rev.equals(str)){
//            System.out.println("palindrome string");
//        }
//        else{
//            System.out.println("not a palindrome string");
//        }

        //Check if it's an armstrong number or not
//        int n = 370;
//        int num_len = Integer.toString(n).length(); //converted number into string to find it's length
//        int temp = n;
//        int ans = 0;
//        while (n > 0){
//            int rem = n % 10;
//            int power = (int)(Math.pow(rem,num_len));
//            ans = ans + power;
//            n /= 10;
//        }
//        if (temp == ans){
//            System.out.println("Armstrong number");
//        }
//        else {
//            System.out.println("Not an armstrong number");
//        }

        //prime number bruteforce and optimize
        //reverse string and number
        //palindrome string and number
        //armstrong number
        //fibonacci series
        //counting occurrences of a given number in a number
        //checking the case of alphabets (upper || lower)
        //calculator
        //factorial (product) & sum of numbers

    }
}
