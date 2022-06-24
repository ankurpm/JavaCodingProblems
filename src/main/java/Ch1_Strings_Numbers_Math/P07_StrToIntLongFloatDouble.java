package Ch1_Strings_Numbers_Math;

public class P07_StrToIntLongFloatDouble {

    public static void main(String[] args) {
        String TO_INT = "453";
        String TO_LONG = "452365478965";
        String TO_FLOAT = "45.823F";
        String TO_DOUBLE = "13.83423D";

        int Int_Value = Integer.parseInt(TO_INT);
        System.out.println("String Integer Value : "+TO_INT);
        System.out.println("Integer Value : "+Int_Value);

        long Long_Value = Long.parseLong(TO_LONG);
        System.out.println("String Long Value : "+TO_LONG);
        System.out.println("Long Value : "+Long_Value);

        float Float_Value = Float.parseFloat(TO_FLOAT);
        System.out.println("String Float Value : "+TO_FLOAT);
        System.out.println("Float Value : "+Float_Value);

        double Double_Value = Double.parseDouble(TO_DOUBLE);
        System.out.println("String Double Value : "+TO_DOUBLE);
        System.out.println("Double Value : "+Double_Value);
    }
}
