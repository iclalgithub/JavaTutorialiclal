package ch12_Arrays.task12;

import java.util.Arrays;

public class _10_reverse_String_ezgisuhanim {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str = "Hello World";
        //1. yol
        System.out.println("***1. yol - string'i tersten yazdırma***");
        for (int i = str.length()-1; i >= 0; i--) {

            System.out.print(str.charAt(i));

        }
        System.out.println(); //dummy
        System.out.println("*** String'i array'e çevirme***");
        String str1 = "Hello World";
        String[] hW = str.split("");
        System.out.println(Arrays.toString(hW));


        System.out.println("***1. yol - string'i array'e çevirerek tersten yazdırma -1.yol***");
        String newWord = " ";
        for (int i = 1; i < hW.length + 1; i++) {
            System.out.print(hW[hW.length - i]); //açıklaması????SOR

        }

        System.out.println();
        System.out.println("***2. yol - string'i array'e çevirerek tersten yazdırma -2.yol***");

        for (int i = hW.length-1; i >= 0; i--) {
            System.out.print(hW[i]);

        }

    }
}