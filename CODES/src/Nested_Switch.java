import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empId : ");
        int empId = sc.nextInt();
        System.out.print("Enter department : ");
        String department = sc.next();

        switch (empId) {
            case 1 -> System.out.println("Akash Mishra");
            case 2 -> System.out.println("Om Nagpure");
            case 3 -> System.out.println("Shubham Gupta");
            case 4 -> {
                System.out.println("empId = 4 ");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Finance" -> System.out.println("Finance Department");
                    default -> System.out.println("Enter a valid department..");
                }
            }
        }


    }
}
