package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task12_iclal {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        // Faruk hoca çözdü derste 17.06.2023

        //  Scanner input = new Scanner(System.in);
        //  System.out.println("bir kelime giriniz : ");
        //  String kelime = input.nextLine();
        //  int uzunluk = kelime.length();
        //  int i = 0;

        //  while (i < kelime.length()+1) {
        //      System.out.println("kelime.charAt(i) = " + kelime.charAt(i));
        //      i++;
        //  }
        //  System.out.println("i = " + i);
        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String kelime = input.nextLine().toLowerCase();
        int harfSayisi = 0;
        int rakamSayisi = 0;
        int ozelKarakterSayisi = 0;
        int index = 0;


        while (kelime.length() > index) {//başından sonuna kadar gezmesini istiyoruz
            if (Character.isDigit(kelime.charAt(index))) rakamSayisi++;
                //Character sınıfının isdigit metodunu kullanıyoruz
            else if (Character.isAlphabetic(kelime.charAt(index))) harfSayisi++;
            else ozelKarakterSayisi++;
            index++;
        }
        System.out.println("rakamSayisi = " + rakamSayisi);
        System.out.println("harfSayisi = " + harfSayisi);
        System.out.println("ozelKarakterSayisi = " + ozelKarakterSayisi);
    }
}