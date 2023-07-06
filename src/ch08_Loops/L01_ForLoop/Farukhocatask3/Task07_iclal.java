package ch08_Loops.L01_ForLoop.Farukhocatask3;

import java.util.Scanner;

public class Task07_iclal {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */


        Scanner input = new Scanner(System.in);
        System.out.println("boyutu giriniz");
        int boyut=input.nextInt();

        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut ; j++) {
                if (i==j){
                    System.out.print("1 ");
                }else System.out.print("0 ");
                //DİKKAT println yazınca olmuyor
                //print yazmanız gerekiyor
                //DİKKAT
            }
            System.out.println();

        }

    }
}
