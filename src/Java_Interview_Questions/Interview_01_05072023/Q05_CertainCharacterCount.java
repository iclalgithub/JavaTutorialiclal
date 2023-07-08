package Java_Interview_Questions.Interview_01_05072023;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam bişeyler ciziktiresen : ");
        String bişeyler = input.nextLine().toLowerCase();
        System.out.println("Agam aradığın harfi giresen : ");
        char harf = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < bişeyler.length(); i++) {
            if (bişeyler.charAt(i) == harf) {
                count++;
            }
        }
        System.out.println("Agam "+ bişeyler+" içinde aradıgın harf "+harf+ count+" tane var");

    }
}
