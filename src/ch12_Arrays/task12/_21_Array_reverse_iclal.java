package ch12_Arrays.task12;

import java.util.Scanner;

public class _21_Array_reverse_iclal {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        //aytekin beyin çözümü daha anlaşılır ezgisu hanımın çözüme bak

        Scanner input = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz");
        int sayi = input.nextInt();
        int birinciBasamak=sayi%10;
        int ikinciBasamak= sayi/10 % 10;
        int ucuncuBasamak= sayi/100 % 10;

        System.out.println("birincibasamak = " + birinciBasamak);
        System.out.println("ikincibasamak = " + ikinciBasamak);
        System.out.println("üçüncübasamak = " + ucuncuBasamak);

        System.out.println("Girdiğin sayıların rakamları: " + birinciBasamak + " " + ikinciBasamak + " " + ucuncuBasamak);

        System.out.println(sayi+ " Sayısının tersi");

        System.out.println(birinciBasamak*100+ikinciBasamak*10+ucuncuBasamak);


    }
}


