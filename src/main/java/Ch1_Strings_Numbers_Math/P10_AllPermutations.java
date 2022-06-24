package Ch1_Strings_Numbers_Math;



public class P10_AllPermutations {
    public static int x = 0;

    public static void main(String[] args) {
        String str ="ABCD";

         /** This attempt uses Recursion **/
        allPermutations(str);
    }

    private static void allPermutations(String str) {
        permuteAndPrint("",str);
        }

    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();

        if(n==0){
            x++;
            System.out.println(x+"."+prefix+" ");
    }else{
            for(int i=0; i<n; i++){
                permuteAndPrint(prefix+str.charAt(i),str.substring(i+1,n)+str.substring(0,i));
            }
        }
    }
}
