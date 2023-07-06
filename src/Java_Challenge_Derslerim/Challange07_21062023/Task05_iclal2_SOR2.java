package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task05_iclal2_SOR2 {
    static Scanner sc = new Scanner(System.in);
    // task->
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz
    static Scanner input = new Scanner(System.in);
    static int sayi;

    public static void main(String[] args) {

        //task 4 teki gibi görünmüyor sout içindeki SOR????????
        System.out.println("Kaç sayı toplamak istiyorsunuz!");
        sayi= input.nextInt();

        toplama();
    }

    private static void toplama() {
        switch (sayi) {
            case 1:
                System.out.println("cok sayi girdiniz, ben toplayamam");
                break;
            case 2:
                System.out.println("Sayıları giriniz");
                System.out.println("Birinci sayıyı giriniz");
                int sayi1 = input.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sayi2 = input.nextInt();
                int toplam = sayi1 + sayi2;
                System.out.println("toplam = " + toplam);
                break;
            case 3:
                System.out.println("Sayıları giriniz");
                System.out.println("Birinci sayıyı giriniz");
                int sayi3 = input.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sayi4 = input.nextInt();
                System.out.println("Üçüncü sayıyı giriniz");
                int sayi5 = input.nextInt();
                int toplam2 = sayi3 + sayi4 + sayi5;
                System.out.println("toplam = " + toplam2);
                break;
            case 4:
                System.out.println("Sayıları giriniz");
                System.out.println("Birinci sayıyı giriniz");
                int sayi6 = input.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sayi7 = input.nextInt();
                System.out.println("Üçüncü sayıyı giriniz");
                int sayi8 = input.nextInt();
                System.out.println("Dördüncü sayıyı giriniz");
                int sayi9 = input.nextInt();
                int toplam3 = sayi6 + sayi7 + sayi8 + sayi9;
                System.out.println("toplam = " + toplam3);
                break;
            default:
                System.out.println("cok sayi girdiniz, ben toplayamam");
                break;

        }
    }

}



