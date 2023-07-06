package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task04_iclal_SOR1 {


    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */


    static Scanner input = new Scanner(System.in);
   static int sayi;

   public static void main(String[] args) {
       System.out.println("Bir sayı giriniz!");
        sayi = input.nextInt();
       // sout görünmüyor nedenini anlamadım SORRRRR?????
       //dikkat burda sayi tanımlamıyoruz class main arasında tanımlanıyor
        negatifMi();
        tekMi();
        basamakDurumu(sayi);
    }

    private static void basamakDurumu(int sayi) {
        if (sayi>99){
            //bu şartı yazılacak
            //düşün????
        }
    }

    private static void tekMi() {

        if (sayi % 2 == 0) {
            System.out.println("sayi çifttir");
        } else System.out.println("sayı tektir");
    }

    private static void negatifMi() {
        if (sayi < 0) {
            System.out.println("sayı negatiftir");
        } else System.out.println("sayı pozitiftir");

    }
}