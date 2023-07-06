package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task11_iclal {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("bir tamsayı giriniz : ");
            int sayi = input.nextInt();
            if (sayi == 0) {
                System.out.println("Sıfıra bastınız çıkış yapılıyor");
                break;
            }
            sum+=sayi;
            count++;
        }
        System.out.println("Girdiğiniz sayıların toplamı = " + sum);
        System.out.println("Girilen sayı adedi = " + count);
    }


}

