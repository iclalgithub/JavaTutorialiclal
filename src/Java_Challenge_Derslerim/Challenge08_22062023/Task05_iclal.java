package Java_Challenge_Derslerim.Challenge08_22062023;

import java.util.Scanner;

public class Task05_iclal {
    public static void main(String[] args) {
       /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner input = new Scanner(System.in);
        System.out.println("8 elemanlı dizi oluşturacaktır ");
        System.out.println("Birinci elemanı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci elemanı giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("Üçüncü elemanı giriniz : ");
        int sayi3 = input.nextInt();
        System.out.println("Dördüncü elemanı giriniz : ");
        int sayi4 = input.nextInt();
        System.out.println("Beşinci elemanı giriniz : ");
        int sayi5 = input.nextInt();
        System.out.println("Altıncı elemanı giriniz : ");
        int sayi6 = input.nextInt();
        System.out.println("Yedinci elemanı giriniz : ");
        int sayi7 = input.nextInt();
        System.out.println("Sekizinci elemanı giriniz : ");
        int sayi8 = input.nextInt();

        int [] sayidizisi= {sayi1,sayi2,sayi3,sayi4,sayi5,sayi6,sayi7,sayi8};
        int count=0;

        for (int i = 0; i < sayidizisi.length; i++) {
            if(sayidizisi[i]%3==0) {
                count++;
            }
        }
        System.out.println("3'e bölünebilen eleman sayısı = " + count);


    }
}
