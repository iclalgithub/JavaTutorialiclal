package ch12_Arrays.task12;

import java.util.Arrays;

public class _10_reverse_String_aytekinbey {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        //1. yol
        String str = "Hello World";
        String[] helloWorld = str.split("");
        System.out.println(Arrays.toString(helloWorld));
        String newWord = " ";
        for (int i = 1; i < helloWorld.length + 1; i++) {
            System.out.print(helloWorld[helloWorld.length - i]);

        }

    }
}