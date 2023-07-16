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

        for (int i = str.length()-1; i >= 0; i--) {

            System.out.print(str.charAt(i));

        }

        String str1 = "Hello World";
        String[] helloWorld = str.split("");
        System.out.println(Arrays.toString(helloWorld));

        String newWord = " ";
        for (int i = 1; i < helloWorld.length + 1; i++) {
            System.out.print(helloWorld[helloWorld.length - i]);

        }

        System.out.println();

        for (int i = helloWorld.length-1; i >= 0; i--) {
            System.out.print(helloWorld[i]);

        }

    }
}