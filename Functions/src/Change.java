import java.lang.reflect.Array;
import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int arr[]){
        arr[0] = 99;
    }

}