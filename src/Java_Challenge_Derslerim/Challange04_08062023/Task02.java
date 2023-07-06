package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci kelimeyi giriniz");
        String kelime = input.next().toUpperCase();
        System.out.println("ikinci kelimeyi giriniz");
        String kelime2 = input.next().toUpperCase();
        //birinci birleştirme
        String birlestirme= kelime+ " "+ kelime2;
        System.out.println("birinci birlestirme yöntemi= " + birlestirme);
        //ikinci birleştirme
        String birlestirme2= kelime.substring(0)+ " "+ kelime2.substring(0);
        System.out.println("ikinci birlestirme yöntemi= " + birlestirme2);
        //üçüncü birleştirme
        String birlestirme3= kelime.concat( " "+ kelime2);
        System.out.println("üçüncü birlestirme yöntemi= " + birlestirme3);


    }

}
