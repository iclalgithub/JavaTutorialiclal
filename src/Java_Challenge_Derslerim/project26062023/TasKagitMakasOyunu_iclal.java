package Java_Challenge_Derslerim.project26062023;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunu_iclal { //class başı
    static Random rnd = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {//main başı
        rastgeleSayi();
        kullaniciGirisi();
        oyun(kullaniciGirisi(), rastgeleSayi());
        oyunBasladi();
        /*
Taş kağıt makas oyunu....
Bilgisayardan rastle(random class kullanılarak) 1-2-3 1=TAŞ, 2=KAĞIT, 3=MAKAS arasında bir sayı alıp kullanıcının
seçimini  kullanarak 3 puan alanın kazan oldugu code create ediniz .
*/


    }//main sonu

    private static void oyunBasladi() {
    }

    private static void oyun(int kullanici, int pc) {
        switch (kullanici) {
            case 1:
                if (pc == 1) {
                    System.out.println("berabere kaldınız tekrar sayı giriniz");
                } else if (pc == 2) {
                    System.out.println();
                }else {
                    System.out.println();
                }
        }

    }

    private static int kullaniciGirisi() {
        System.out.println("Oyunumuza hoşgeldiniz \n 1=TAŞ, 2=KAĞIT, 3=MAKAS sayılarından birini giriniz");
        int secim = input.nextInt();
        return secim;
    }

    private static int rastgeleSayi() {
        int pcSayi = rnd.nextInt(3) + 1;//0 istemiyorsak +1 yazılacak
        return pcSayi;
    }


}//class sonu
