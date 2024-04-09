package com.rohan;

public class Even_Digits {
    public static void main(String[] args) {
        int[] arr = {11, 1, 13, 5452, 10};

        // To find even no. of digits in array
        int ans = even_digits(arr);
        System.out.println(ans);

//        simplest way to find the number of digits in a number
//        System.out.println( (int)(Math.log10(123456)+1) );

//      To find number of digits in a number
//        int digits = find_digits(123456);
//        System.out.println(digits);

    }
    static int even_digits(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even_num_digits(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even_num_digits(int num){
//        int count = 0;
//        while (num > 0){
//            count++;
//            num = num/10;
//        }
//        return count % 2 == 0;
        int digits = find_digits(num);
        return digits % 2 == 0;
    }

    //To find the Number of digits in a number
    static int find_digits(int num){
        if(num < 0){
            num = num * -1;
        }

//        int count = 0;
//        while (num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;

        return (int)(Math.log10(num) + 1);
    }


}
