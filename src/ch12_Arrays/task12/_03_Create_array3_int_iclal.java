package ch12_Arrays.task12;

public class _03_Create_array3_int_iclal {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
        int toplam=0;
        int [] arr={25,30,30,35,100};
        for (int i = 0; i < arr.length; i++) {
           toplam+=arr[i];
        }
        System.out.println("dizi toplamı = " + toplam);
    }
}