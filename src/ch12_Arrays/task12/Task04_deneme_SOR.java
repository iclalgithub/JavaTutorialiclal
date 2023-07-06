package ch12_Arrays.task12;

import java.util.Scanner;

public class Task04_deneme_SOR {
    static  Scanner sc = new Scanner(System.in);
   static  int arr [] = {1,2,3,4,5,6,7};
   static int toplam;
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        arrayTanimla2();
        ortalama2();
        ortalamadanBuyuk2();
    }//main sonu
//SORRRRR SONUÇ HATALI??TASK+ ten metoda çevirmeye çalıştım sadece

    private static void ortalamadanBuyuk2() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>toplam/ arr.length) {//döngüdeki her bir arr elemanı ortalamadan buyuk olma sartı

                System.out.print(arr[i]+" ");// 5 6 7
            }
        }
    }

    private static void ortalama2() {
        int toplam=0;// arr elemanları toplanımatanacak boş kutu tanımlandı
        for (int i = 0; i < arr.length; i++) {//arr elemanlarının tekrara alıan loop tanımlandı
            toplam+= arr[i];// döngüdeki her bir arr elemanı toplama eklendi
        }
        System.out.println("toplam = " + toplam); // 28
        System.out.println("ortalama : " + (toplam / arr.length)); // 4

    }

    private static void arrayTanimla2() {
        System.out.println("dizi tanımlandı");
    }


}







