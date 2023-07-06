package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task04_Nested_iclal {
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
        System.out.println("bir sayi giriniz - birim matri oluşturulacaktır");
        int sayi = input.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi; j++) {
                if(i==j){
                    System.out.print("1 ");
                }else System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
