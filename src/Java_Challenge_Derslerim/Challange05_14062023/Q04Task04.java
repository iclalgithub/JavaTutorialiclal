package Java_Challenge_Derslerim.Challange05_14062023;

import java.util.Scanner;

public class Q04Task04 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam bi sayı giresen hele :");

        int aganınSayısı = input.nextInt();
        int toplam = 0;// döngüdeki sayıları karelerini toplayacak boş kutu tanımlandı


        for (int i = aganınSayısı; i >= 1; i--) {
            toplam += i * i;// döngüden gelen hersayını karesi topama eklendi
        }
        System.out.println("agam girdiğin sayıları kareleri toplamı : " + toplam);

    }// main sonu
}// class sonu

