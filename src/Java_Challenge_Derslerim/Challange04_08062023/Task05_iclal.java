package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task05_iclal {

    /* Task->
     * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****4 tane kelime girilecek ve bu kelimelerle cümle kurulacak******");
        System.out.println("birinci kelimeyi giriniz");
        String kelime1 = input.next().toUpperCase();
        System.out.println("kelime1 = " + kelime1);
        System.out.println("ikinci kelimeyi giriniz");
        String kelime2 = input.next().toUpperCase();
        System.out.println("kelime2 = " + kelime2);
        System.out.println("üçüncü kelimeyi giriniz");
        String kelime3 = input.next().toUpperCase();
        System.out.println("dördüncü kelimeyi giriniz");
        System.out.println("kelime3 = " + kelime3);
        String kelime4= input.next().toUpperCase();
        System.out.println("kelime4 = " + kelime4);

        String cümle= kelime1 +" "+kelime2 +" " +kelime3+" " +kelime4;
        System.out.println("cümle = " + cümle+".");


    }

}
