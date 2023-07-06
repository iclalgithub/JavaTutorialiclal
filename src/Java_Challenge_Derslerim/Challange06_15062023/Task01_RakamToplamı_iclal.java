package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task01_RakamToplamı_iclal {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz - Rakamların toplamı hesaplanacak");
        int sayi=input.nextInt();
        int rakamlarinToplami=0;

       //Kaç basamak girileceği belli olmadığı için
       //bir durum tekrarı olduğu için while açılır

        while(sayi>0){
            //1435 diyelim
           rakamlarinToplami+=sayi%10;//birler basamağındaki rakam toplandı. 5i verir
           sayi= sayi/=10;//sayıyı ona böl bir basamak düşür.//143 olur

       }
        System.out.println("rakamlarinToplami = " + rakamlarinToplami);

    }// main sonu
}// Class sonu


//ikinci döngüde
//145in birler basamağı 5
//sonra 14 olur
//14ün birler basamağı 4
//sonra 1 olur
