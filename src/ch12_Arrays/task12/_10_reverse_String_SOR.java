package ch12_Arrays.task12;

import java.util.Arrays;

public class _10_reverse_String_SOR {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        //ezgisuhanimin çözümü incelenebilir
        //SOR!!!!!
        //1. yol
        //String
        String[] arr={"Hello World"};
        System.out.println("arr = " + Arrays.toString(arr) );
        String[] yeniarr=new String[arr.length];
        for (int i = arr[0].length() - 1; i >= 0; i--) {
            yeniarr[arr[0].length() - 1 - i] = String.valueOf(arr[0].charAt(i));
        }

        //Chat GPT
       //arr değişkeni bir dizi olarak tanımlanmışken,
        // .length metodu yerine .length() metodu kullanılmış.
        // .length dizinin uzunluğunu alırken, .length() bir dizenin
        // uzunluğunu alır. Bu nedenle, arr.length yerine arr[0].length()
        // kullanmanız gerekiyor.


   //   for (int i = arr.length-1; i >=0; i--) {
   //       yeniarr[i]=arr[i];
   //   }
        System.out.println("yeniarr = " +  Arrays.toString(yeniarr));
        //2.yol

    }
}