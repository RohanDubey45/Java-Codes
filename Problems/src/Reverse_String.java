public class Reverse_String {
    public static void main(String[] args) {

        rev("abcdefghijklmnopqrstuvwxyz");

    }
    static void rev(String s){

        String reverse = "";

        for(int i = s.length()-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }

        System.out.println(reverse);

    }

}
