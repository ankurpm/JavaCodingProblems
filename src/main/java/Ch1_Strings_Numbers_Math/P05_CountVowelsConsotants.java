package Ch1_Strings_Numbers_Math;

import java.util.Arrays;
import java.util.List;

public class P05_CountVowelsConsotants {
    public static void main(String[] args) {
        String str = "How are you?";
        String newStr = str.replaceAll("\\s","").toLowerCase();
        List<Character> vowels= Arrays.asList('a','e','i','o','u');
        int vowelCount1 = 0;
        int consonantCount1 = 0;

        /**
         * Without Java8 stream functions
         */
        for (char c:newStr.toCharArray()
             ) {
            if(vowels.contains(c)){
                vowelCount1++;
            } else if (c>='a' && c<='z') {
                consonantCount1++;
            }
        }

        System.out.println("vowelCount1 : "+vowelCount1);
        System.out.println("consonantCount1 : "+consonantCount1);

        /**
         * Using Java 8 streams
         */
        long vowelCount2 = newStr.chars().filter(c -> vowels.contains((char)c)).count();
        System.out.println("vowelCount2 : "+vowelCount2);
    }
}
