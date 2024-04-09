public class Palindrome_String {
    public static void main(String[] args) {

        String str = "aba";
        boolean ans = isPalindromeString(str);
        System.out.println(ans);
    }
    static boolean isPalindromeString(String str){

        String original = str;
        String emp = "";

        for(int i = str.length()-1; i>=0; i--){
            emp = emp + str.charAt(i);
        }
        return original.equals(emp);
    }


}
