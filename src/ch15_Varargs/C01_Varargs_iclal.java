package ch15_Varargs;

import java.util.Arrays;

public class C01_Varargs_iclal {

    public static void main(String[] args) {
        /*
        VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da
        ayni sekilde kullanilir
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır

		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :

           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

        */

        // Task 01-> verilen iki sayı toplamını print eden METHOD create ediniz

        int sayi1 = 99;
        int sayi2 = 15;
        int sayi3 = 55;
        int sayi4 = 35;

        topla(sayi1,sayi2); //birinci metot
        topla(sayi3,sayi4); //ikinci metot

        // Task 02-> verilen üç sayı toplamını print eden METHOD create ediniz
        topla(sayi3,sayi4,sayi1);

        System.out.println(" *** varargs ile çözüm ***");
        toplaVarargs(sayi1, sayi2,sayi4,33 );
        toplaVarargs(sayi1, sayi2,sayi4,33,35 );
        toplaVarargs(sayi1, sayi2, sayi4, 33 , sayi3, sayi1,22 );

        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
        // METHOD create ediniz ->>
        // parametre saysı belirli değil : varargs
        String str1 = "java";
        String str2 = "react";
        String str3 = "spring";
        String str4 = "next.js";
        String str5 = "aws";

        enFazlaKarakter(str1,str5);
        enFazlaKarakter(str1,str2,str3);
        enFazlaKarakter(str1,str5,str4,str3,str2);
        enFazlaKarakter(str1,str4,str3,str2);
    }
    private static void enFazlaKarakter(String... str) {
        String enFazlaKarakterli="" ;
        for (String w : str    ) {
            if (w.length()  > enFazlaKarakterli.length()){
                enFazlaKarakterli = w;
            }
        }
        System.out.println("enFazlaKarakterli = " + enFazlaKarakterli);
    }

    // private static void toplaVarargs(int... i, String s) { //Vararg parameter must be the last in the list
   // }

    private static void toplaVarargs(int... i) { //varargs method must be the last in the list
        //üç nokta ile varargs metodu yaptık
        //varargs sonda olmalı
        System.out.println(i);  //Implicit call to 'toString()' on array 'i'
        //burda bir array 'e dönüşüyor
        //bu array oluyor o yüzden to string ile yazdırabiliriz
        //referans değerini verir
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));

        //Varargs array olur
        int toplam = 0; //boş bir conteyner create edelim
        for (int w : i  ) { //i array dir
            toplam += w;
        }
        System.out.println("varrags ile sayilarin toplami " + toplam);
    }

    //valla run edip output alınca çok huzur verici:)
    //github da push edemeyince de çok sinir bozucu:)




    private static void topla (int s, int ss, int sss) {

        System.out.println("uc sayinin toplami " +(s + ss +sss));
    }

    private static void topla (int s, int d) {

        System.out.println("iki sayinin toplami " + ( s + d ) );
    }

}

/*iki sayinin toplami 114
iki sayinin toplami 90
uc sayinin toplami 189
 *** varargs ile ***
[I@3f99bd52
Arrays.toString(i) = [99, 15, 35, 33]
varrags ile sayilarin toplami 182
[I@4f023edb
Arrays.toString(i) = [99, 15, 35, 33, 35]
varrags ile sayilarin toplami 217
[I@3a71f4dd
Arrays.toString(i) = [99, 15, 35, 33, 55, 99, 22]
varrags ile sayilarin toplami 358
enFazlaKarakterli = java
enFazlaKarakterli = spring
enFazlaKarakterli = next.js
enFazlaKarakterli = next.js
 */
