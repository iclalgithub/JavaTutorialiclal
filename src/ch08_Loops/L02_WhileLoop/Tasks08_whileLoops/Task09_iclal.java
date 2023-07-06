package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task09_iclal {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istersiniz : ");
        int sayiadedi = input.nextInt();

        System.out.println("***FOR İLE ÇÖZÜM");
        int toplam=0;
        for (int i = 1; i < sayiadedi+1; i++) {
            System.out.println(i+". sayıyı giriniz");
            int sayi = input.nextInt();
            toplam+=sayi;

        }
        System.out.println("toplam = " + toplam);

        System.out.println("***WHILE İLE ÇÖZÜM");
        System.out.println("Kaç tane sayı girmek istersiniz : ");
        int sayiadedi2 = input.nextInt();
        int i=1;
        while (i <= sayiadedi2) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi2 = input.nextInt();
            toplam += sayi2;
            i++;
        }
        System.out.println("Girilen sayıların toplamı: " + toplam);
    }

}
