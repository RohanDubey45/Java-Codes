package com.rohan;

public class Even_Digits {
    public static void main(String[] args) {

        int[] arr = {10, 11, 1, 15, 1524, 112233};

        int ans = even_digits_of_array(arr);
        System.out.println(ans);

    }

    static int even_digits_of_array(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even_digits(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even_digits(int num){
        int digits = count_Digits(num);
        return digits % 2 == 0;
    }
    static int count_Digits(int num){

//        bruteforce soln

//        int count = 0;
//        while (num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;


//        optimized soln

        return (int)(Math.log10(num) + 1);

    }

}
