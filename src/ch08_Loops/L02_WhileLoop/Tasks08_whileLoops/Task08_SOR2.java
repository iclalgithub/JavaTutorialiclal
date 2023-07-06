package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task08_SOR2 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        int sum = 0;
        int count2 = 0;

        while(sum<333){
            System.out.println("Bir pozitif sayı giriniz:");
            System.out.println("İşlemi bitirmek için sıfıra basınız");
            Scanner input = new Scanner(System.in);
            int sayi = input. nextInt();


            if(sayi<0) {
                System.out.println("Negatif sayı giremezsiniz");
                continue;
            }
            else if (sayi==0){
                System.out.println("Yine bekleriz");
                break;
            }
            else{
                sum+=sayi;
                count2++;

            }
            System.out.println("Girilen sayı adedi = " + count2);
            System.out.println("Girilen sayıların toplamı = " + sum);

        }





    }
}
