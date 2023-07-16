package ch12_Arrays.task12;

import java.util.Arrays;

public class _16_Advance_Array_get_sum_iclal {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2" ;
        String [] yeniArr =  str.trim().split(" ");// string array e cevrildi
        System.out.println("yeniArr = " + Arrays.toString(yeniArr));

        int toplam = 0;
        for (String each : yeniArr) {
            int number = Integer.parseInt(each.replace("$", ""));
            //Integer.parseInt metodu Stringi int e çevirir
            toplam += number;
        }

        System.out.println("Sayıların toplamı: " + toplam);


    }
}