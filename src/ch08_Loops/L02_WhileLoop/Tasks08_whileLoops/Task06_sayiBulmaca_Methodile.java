package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task06_sayiBulmaca_Methodile {
   static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //cozumMetot1();
        cozumMetot2(); //tahmin sayısını sınırlıyoruz

    }
    //Faruk Hoca Çözümü
    //en iyisi 64-32-16 şeklinde başlamaktır..
    private static void cozumMetot2() {
        int randomSayi = (int) (Math.random() * 100 + 1);  // 1 den 100 e kadar sayı üretilir
        int tahmin = 0;
        int sayac = 0;
        while (randomSayi != tahmin && sayac<10) {
            sayac++;
            System.out.print("Lütfen " + sayac + ". tahmininizi giriniz : ");
            tahmin = scanner.nextInt();
            if (tahmin>randomSayi) System.out.println("Daha küçük bir sayı tahmin ediniz");
            else if (tahmin<randomSayi) System.out.println("Daha büyük bir sayı tahmin ediniz");
        }
        if (sayac>=10) System.out.println("Tahmin hakkınız bitti, malesef bilemediniz");
        else System.out.println("Tebrikler Tututuğum sayıyı "+ sayac+" tahminde bildinzi");
    }

    private static void cozumMetot1() {
        int randomSayi=(int)(Math.random()*100+1);
        int tahmin=0;
        int sayac=0;
        while(randomSayi!=tahmin){
            sayac++;
            System.out.println("Lütfen " + sayac+ ". tahmininizi giriniz");
            tahmin =scanner.nextInt();
            if(tahmin>randomSayi){
                System.out.println("Daha küçük bir sayı tahmin ediniz");
            }
            else if(tahmin<randomSayi) System.out.println("Daha büyük bir sayı tahmin ediniz");
        }
        System.out.println("Tuttuğun sayıyı "+ sayac +" tahminde bildin");

    }
}
