package Java_Challenge_Derslerim.project26062023;

import java.util.Random;
import java.util.Scanner;

/*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/
public class SayiTahminEtmeOyunu_iclal {
    public static void main(String[] args) {
       //BU KODU METHODİLE YAPIYORUZ V2 DE
        Scanner input =new Scanner(System.in); //system içerisinden al input a ata
        Random rnd=new Random();
        int pcSayi=rnd.nextInt(100)+1;//[0+1,100) arasında
        System.out.println("pcSAyi"+pcSayi);
        System.out.println("***Tahmin oyununa hoşgeldiniz*** \n 1-100 arasında bir sayı giriniz");

        int sayiTahmini=input.nextInt();

        if (sayiTahmini<100&&sayiTahmini>0){

            while(sayiTahmini!=pcSayi){//bu şart sağlandığı sürece
                if(sayiTahmini<pcSayi){
                    System.out.println("daha büyük sayı giriniz");
                    sayiTahmini =input.nextInt();
                }else if (sayiTahmini>pcSayi){
                    System.out.println("daha küçük sayı giriniz");
                    sayiTahmini =input.nextInt();
                }
            } System.out.println("istenilen sayıyı girdiniz");
        }else System.out.println("1-100 arasında bir sayı giriniz :(");






    }


}

