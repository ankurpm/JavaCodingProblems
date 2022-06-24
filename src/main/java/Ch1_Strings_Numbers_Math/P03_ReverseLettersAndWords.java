package Ch1_Strings_Numbers_Math;

public class P03_ReverseLettersAndWords {

    public static void main(String[] args) {

        String str = "How are you?";
        final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. "
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.";
       // String reverse1 = reverseWords1(str.toCharArray(), new ArrayList<Character>());
        char[] reverse2 = reverseWords2(TEXT);
        System.out.println(reverse2);

    }
////dddddddd
    private static char[] reverseWords2(String str) {
        int inputLen = str.length();
        char[] reverse = new char[inputLen];
        char[] myArr = str.toCharArray();
        int j = inputLen-1;
        for(int i=0; i<inputLen;i++){
            //for(int j=inputLen-1; j>=0;j--){
                reverse[j] = myArr[i];
                j--;
            //}
        }
        //System.out.println(reverse);
        return reverse;
    }

    /**
     * AN ATTEMPT USING RECURSION
     * @param str
     * @param characters
     * @return
     */
    /*
    private static String reverseWords1(char[] str, ArrayList<Character> characters) {

        if(str.length == 1){
            characters.add()
        }
        String result = reverseWords(str)

    }
     */
}
