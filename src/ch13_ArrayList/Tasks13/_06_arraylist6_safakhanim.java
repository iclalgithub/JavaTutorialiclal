package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6_safakhanim {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        //ArrayList<Integer> number = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 3));

        //2---6dan küçük 1'den büyük

        System.out.println("hillNum(number) = " + hillNum(number));


    }//main sonu

    private static Integer hillNum(ArrayList<Integer> sayi) {

        for (int i = 1; i < sayi.size() - 1; i++) {
            if (sayi.get(i) < sayi.get(i - 1) && sayi.get(i) > sayi.get(i + 1)) {
                return sayi.get(i);
            }//bu if bloğu hiç çalışmazsa sıkıntı
        }
       return -1;//bunu yazmayınca sıkıntı oluyor
        //bu koşulu sağlayan böyle bir sayı hiç yok demek istiyoruz
    }
//çıktı hillNum(number) = 2

}//class sonu
