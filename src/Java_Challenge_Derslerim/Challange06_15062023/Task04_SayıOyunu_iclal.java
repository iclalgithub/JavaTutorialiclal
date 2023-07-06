package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task04_SayıOyunu_iclal {

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


        while (true) {
            int count = 0;
            int toplam = 0;
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();
            count++;
            toplam += sayi;

            if (toplam > 100) {
                System.out.println("Toplam 100'ü aştı");
                System.out.println("toplam = " + toplam);
                System.out.println("count = " + count);
                break;
            }

        }


    }

}
