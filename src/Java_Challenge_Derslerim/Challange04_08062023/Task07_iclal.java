package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task07_iclal {

    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    // SOR ????
    // bu niye her zaman false veriyor??
    // Chat GPT açıklama altta
    // Bu kod her zaman "false" sonucunu veriyor
    // çünkü girdiğiniz kelimenin büyük harfli olması gerekiyor.
    // Kodda String kelime = input.next().toUpperCase();
    // satırıyla girilen kelime büyük harflere dönüştürülüyor.
    // String kelime = input.next().toLowerCase();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
       // String kelime = input.next().toUpperCase();
        String kelime = input.next().toLowerCase();

        String kelimebul = "xyz";

        boolean iceriyorMu = kelime.contains(kelimebul);

        if (iceriyorMu==true) {
            System.out.println("true-xyz içeriyor");
        }else System.out.println("false-xyz içermiyor");

    }


}
