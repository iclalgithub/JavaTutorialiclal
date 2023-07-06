package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task03_TekSayıAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam hele bi sayi giresen : ");
        int sayi = input.nextInt(); // 1453->145->14->1

        int tekSayiAdedi=0;// count sayac

        while (sayi>0){
            if (sayi%2 == 1) {
                System.out.print(sayi+" ");
                tekSayiAdedi++;
            }
            sayi--;
        }
        System.out.println("tekSayiAdedi = " + tekSayiAdedi);
    }

}
