package Ch1_Strings_Numbers_Math;

public class P13_RemoveGivenChar {
    public static void main(String[] args) {
        String str = "ankura";
        char c = 'a';

        /** Attempt using iteration **/
        String newStr1 = removeGivenChar(str, c);
        System.out.println(newStr1);
    }

    private static String removeGivenChar(String str, char c) {
        char[] arr2 = new char[str.length()];
        int j=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != c){
                arr2[j] = str.charAt(i);
                j++;
            }
        }
        return String.valueOf(arr2).substring(0,j);
    }
}
