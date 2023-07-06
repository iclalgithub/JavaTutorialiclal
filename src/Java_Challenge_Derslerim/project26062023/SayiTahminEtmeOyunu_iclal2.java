package Java_Challenge_Derslerim.project26062023;

import java.util.Random;
import java.util.Scanner;

/*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/
public class SayiTahminEtmeOyunu_iclal2 {
    static Scanner input = new Scanner(System.in); //system içerisinden al input a ata
    static Random rnd = new Random();
    static int pcSayi = rnd.nextInt(100);
    public static void main(String[] args) {
        //BU KODU METHODİLE YAPIYORUZ BURDA
        sayiTahminEt();

    }//main sonu

    private static void sayiTahminEt() {


        System.out.println("pcSAyi" + pcSayi);
        System.out.println("***Tahmin oyununa hoşgeldiniz*** \n 1-100 arasında bir sayı giriniz");

        int sayiTahmini = input.nextInt();
        int count=1;
        if (sayiTahmini < 100 && sayiTahmini > 0) {
            //burda if te sıkıntı var kontrol et!!!!!
            while (sayiTahmini != pcSayi) {

                if (sayiTahmini < pcSayi) {
                    count++;
                    System.out.println("daha büyük sayı giriniz");
                    sayiTahmini = input.nextInt();
                } else { //if (sayiTahmini > pcSayi) { //yanlış değil ama else if yerine else yeterli
                    count++;
                    System.out.println("daha küçük sayı giriniz");
                    sayiTahmini = input.nextInt();
                }
            }
            System.out.println("tahmin sayısı: "+count);
            System.out.println("tahmin ettiğiniz sayı: "+sayiTahmini);
        }else {
            System.out.println("1-100 arasında bir sayı giriniz :(");
            sayiTahminEt();
        }



    }


}

