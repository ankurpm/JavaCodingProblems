package Ch1_Strings_Numbers_Math;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P12_RemoveDuplicateChars {

    public static void main(String[] args) {
        String str = "AAnnkkuurr";

        /** My solution **/
        String withoutDuplicates1 = removeDuplicates1(str);
        System.out.println("String without duplicates : "+withoutDuplicates1);
        /** Book solution (better) **/
        String withoutDuplicates2 = removeDuplicates2(str);
        System.out.println("String without duplicates : "+withoutDuplicates2);
    }

    private static String removeDuplicates2(String str) {
        Set<Character> mySet = new LinkedHashSet<>();
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char c= str.charAt(i);
            if(mySet.add(c)){
                newStr += c;
            }
        }
        return newStr;
    }

    private static String removeDuplicates1(String str) {
        Set<Character> mySet = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++){
            mySet.add(str.charAt(i));
        }
        String newStr = "";
        for (char c:mySet
             ) {
            newStr += c;
        }
        return newStr;
    }
}
