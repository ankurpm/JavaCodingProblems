package Ch1_Strings_Numbers_Math;

public class P11_StringPalindrome {
    public static void main(String[] arg){
        String str = "AnkuruknA";


        int n = str.length();
        for(int i =0; i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Is a palindrome");

    }

}
