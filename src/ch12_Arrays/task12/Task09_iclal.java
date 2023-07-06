package ch12_Arrays.task12;

import java.util.Scanner;

public class Task09_iclal {

    static int[] sayi = new int[5];
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        diziBelirle();
        terstenDizi();

    }

    private static void terstenDizi() {
        System.out.println("Tersten yazılıyor");
        System.out.println("Girilen sayılar tersten");
        for (int i = 4; i >= 0; i--) {
            System.out.println(sayi[i]);
        }

    }

    private static void diziBelirle() {
        System.out.println("Dizinin elemanları belirleniyor");
        System.out.println("5 adet sayı girin");
        for (int i = 0; i < 5; i++) {
            sayi[i] = input.nextInt();
        }
    }



}






