package ch12_Arrays.task12;

public class _14_String_method_replace_ezgisuhanim {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String str = "Hello World";

        System.out.println("str.replaceAll(\"o\",\"K\") = " + str.replaceAll("o", "K"));


    }




}
