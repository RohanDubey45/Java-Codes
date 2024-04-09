import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5);

        fun2(5,4,"rohan","om","akash","shubham");
    }
    static void fun2(int a,int b, String ...s){
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
