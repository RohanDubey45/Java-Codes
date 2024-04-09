import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        //implicit typecasting
//        float f = 45.123f;
//        double d = f;
//        System.out.println(d);

//        explicit typecasting
//      long i = 99978967897893453L;
//      int a = (int)(i);
//        System.out.println(a);

//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
//        int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = (byte)(b * 2);
//        System.out.println(b);
//
//        int number = 'A';
//        System.out.println("你好");
//
//        System.out.println(3 * 6);

//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f * b) + (i / c) - (d * s);
//        // float + int - double = double
//        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
//        System.out.println(result);

        float f = 2;
        float celcius = (f - 32) * 5/9;
        System.out.println(celcius);


    }
}
