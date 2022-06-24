package Ch1_Strings_Numbers_Math;

/**
 * Input a character and find its occurrence in a given string
 */

public class P06_CharacterOccurrence {
    public static void main(String[] args) {

        String str = "asdshfjdksjeie";
        //Scanner scanner = new Scanner(System.in);
        //char c = (char)scanner.nextLine();
        char chr = 's';

        /** Using JAVA 8 streams **/
        long count1 = findCharCount1(chr,str);
        System.out.println("Total count of "+chr+" is "+count1);

        /** Using str.replace **/
        int len1 = str.length();
        String str2 = str.replaceAll(String.valueOf(chr),"");
        int len2 = str2.length();
        int count2 = len1-len2;
        System.out.println("Total count of "+chr+" is "+count2);
    }

    private static long findCharCount1(char chr,String str) {
        return str.chars().filter(c-> c==chr).count();
    }
}
