package inputs;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println("Your age is: " +age);
//        System.out.println("Name please: ");
//        String name = sc.nextLine();
//        System.out.println(name);
//
//        float fl = sc.nextFloat();
//        System.out.println(fl);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " +sum);


    }
}
