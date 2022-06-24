package Ch1_Strings_Numbers_Math;

import java.util.*;

public class P02_FirstNonRepeatChar {

    public static void main(String[] args){
        //String str= "ANKU nRE JHWDNFSJOBWSNBIENFKNFLSDNnWLDFNLWKFNELKDFNWLKFN";
        String str = "AnkiurAkur";
        //System.out.println(findFirstNonRepeatChar(str));
        firstNonRepeatChar(str);
    }

    private static void firstNonRepeatChar(String str) {
        Map<Character,Integer> myMap = new LinkedHashMap<>();
        for (int i = 0; i<str.length();i++){
            char c1 = Character.toLowerCase(str.charAt(i));
            myMap.compute(c1,(k,v)-> (v==null) ? 1:++v);
        }
        for (char c:myMap.keySet()
             ) {
            if(myMap.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
    }

    private static char findFirstNonRepeatChar(String str1) {
        String str = str1.replaceAll("\\s","");
        List<Character> lst = new ArrayList<>();
        for (char c: str.toCharArray()
             ) {
            if(lst.contains(c)){
                return c;
            }else {
                lst.add(c);
            }
        }

        return 0;
    }
}
