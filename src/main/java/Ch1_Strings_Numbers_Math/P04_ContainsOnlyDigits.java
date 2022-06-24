package Ch1_Strings_Numbers_Math;

public class P04_ContainsOnlyDigits {
    public static void main(String[] args) {
        //String str = "How are you?";
        //String str = "8376014520";
        String str = null;
        for (char c:str.toCharArray()
             ) {
            if(!Character.isDigit(c)){
                System.out.println("Not only digits in the string");
                return;
            }
        }
        System.out.println("The given string contains only digits");
    }
}
