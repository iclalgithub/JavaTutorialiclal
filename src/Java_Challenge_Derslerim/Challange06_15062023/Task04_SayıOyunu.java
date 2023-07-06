package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task04_SayıOyunu {

    /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam hele bi sayi giresen : ");


        int sayıToplamı = 0;
        int girilenSayıAdedi = 0;
        for (int i = 1; i < 100; i++) {
            System.out.print(i + ". sayi giriniz : ");

            int sayi = input.nextInt();
            sayıToplamı += sayi;
            girilenSayıAdedi++;

            if (sayıToplamı>100 ) {

                System.out.println(girilenSayıAdedi+" kere sayi girdin. Bu kadar sayi yeter");
                System.out.println( "girilen sayıların toplamı : "+sayıToplamı);
                break;


            }


        }

    }

}
