public class Function_overloading {
    public static void main(String[] args) {
//        introduction(20);
//        introduction("Shubham");

        int ans1 = sum(5,4);
        System.out.println(ans1);

        int ans2 = sum(5,4,3);
        System.out.println(ans2);

    }
//    static void introduction(int age){
//        System.out.println("First one");
//        System.out.println(age);
//    }
//    static void introduction(String name){
//        System.out.println("Second one");
//        System.out.println(name);
//    }
    static int sum(int a , int b){
        System.out.println("Two parameters");
        return  a + b;
    }
    static int sum(int a, int b, int c){
        System.out.println("Three parameters");
        return a + b + c;
    }


}
