package ch12_Arrays.task12;

import java.util.Arrays;

public class _06_Array_contains_alibey {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String[] elemanlar = {"Apple ", "Orange", "Banana ", "Pineapple"};
        boolean aitmi = false;

        for (String eleman : elemanlar) {
            if (eleman.equals( "Apple")) {
                aitmi = true;
                break;
            }
        }
        System.out.println("Aitmi : " + aitmi );
    }
}
