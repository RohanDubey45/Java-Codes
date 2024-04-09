package excersice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       while (true){
//           System.out.print("Enter a number: ");
//           int num = sc.nextInt();
//           if(num % 2 == 0){
//               System.out.println("Number is even ");
//           }
//           else{
//               System.out.println("Number is Odd");
//           }
//       }

//        Greeting name
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Good Morning! " +name);

//        To calculate the simple interest
//        System.out.print("Enter Principal rate: ");
//        double principal = sc.nextDouble();
//
//        System.out.print("Enter Rate: ");
//        double Rate = sc.nextDouble();
//
//        System.out.print("Enter Time in (Years): ");
//        double Time = sc.nextDouble();
//
//        double SimpleInterest = (principal * Rate * Time) / 100;
//        System.out.println(SimpleInterest);


//      Taking 2 nums and operator and calculating it accordingly
//      while (true){
//          System.out.print("Enter first num: ");
//          int num1 = sc.nextInt();
//
//          System.out.print("Enter second num: ");
//          int num2 = sc.nextInt();
//
//          System.out.print("Choose an operator ( *, +, -, %, / ): ");
//          String operator= sc.next();
//
//          if (operator.equals("+")){
//              System.out.println(num1 + num2);
//          }
//          else if (operator.equals("-")) {
//              System.out.println(num1 - num2);
//          }
//          else if(operator.equals("/")){
//              System.out.println(num1 / num2);
//          }
//          else if(operator.equals("*")){
//              System.out.println(num1 * num2);
//          }
//          else {
//              System.out.println("Select a Valid Operator please....");
//              break;
//          }
//      }

//        max of two numbers
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        if(num1 > num2){
//            System.out.println(num1 + " is greater than " +num2);
//        }
//        else{
//            System.out.println(num2+ " is greater than " +num1);
//        }

        System.out.println("Enter currency in rupees: ");
        int CurRs = sc.nextInt();
        double CurUsd = CurRs * 0.0120639;
        System.out.println("Currency in dollars is : "+CurUsd +  "$");








    }
}
