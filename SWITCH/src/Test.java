import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        System.out.println("hello duniya");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your friend name: ");
        String friends = sc.next();

        switch (friends) {
            case "akash" -> System.out.println("A good boy");
            case "om" -> System.out.println("A spiritual boy");
            case "shubham" -> System.out.println("A noisy boy");
            case "rohan" -> System.out.println("A Brilliant boy");
            default -> System.out.println("Not a valid name");
        }
        }
    }

