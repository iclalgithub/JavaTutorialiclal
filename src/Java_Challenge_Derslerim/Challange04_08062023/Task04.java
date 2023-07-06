package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task04 {

    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.next();

        int uzunluk = kelime.length();

        if(uzunluk>=3){
            String sonikiharf = kelime.substring(kelime.length()-2);

            System.out.println("sonikiharf = " + sonikiharf+sonikiharf+sonikiharf);
        }else System.out.println("Girdiğiniz kelime 3 harften azdır: " + kelime);



    }
}
