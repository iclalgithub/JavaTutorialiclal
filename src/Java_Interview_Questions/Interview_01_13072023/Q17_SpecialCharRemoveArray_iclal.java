package Java_Interview_Questions.Interview_01_13072023;

import java.util.ArrayList;
import java.util.Arrays;

public class Q17_SpecialCharRemoveArray_iclal {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {
        // ArrayList<String> money = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        ArrayList<String> money = new ArrayList<>(Arrays.asList("$11", "$-45", "$2"));
        System.out.println(getSum(money));// 48


    }//main sonu

    private static int getSum(ArrayList<String> para) {
        int toplam = 0;
        for (String avuc : para) {
            toplam += Integer.parseInt(avuc.replace("$", ""));
        }

        if (toplam < 0) return -1;
        else return toplam;
    }


}//Class sonu