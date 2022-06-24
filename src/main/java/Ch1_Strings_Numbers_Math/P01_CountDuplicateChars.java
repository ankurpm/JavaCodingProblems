package Ch1_Strings_Numbers_Math;

import java.util.HashMap;
import java.util.Map;

/**
 *Write a program that counts duplicate characters from a given string.
 */
public class P01_CountDuplicateChars {
    public static void main(String[] args) {

        String str = "Ankura";
        Map<Character,Integer> myMap = new HashMap<>();
        for (int i = 0; i<str.length();i++){
            char c1 = Character.toLowerCase(str.charAt(i));
            myMap.compute(c1,(k,v)-> (v==null) ? 1:++v);
        }
        System.out.println(myMap);


    }
}
