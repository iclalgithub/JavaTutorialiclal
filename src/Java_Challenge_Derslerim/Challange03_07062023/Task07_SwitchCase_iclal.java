package Java_Challenge_Derslerim.Challange03_07062023;

import java.util.Scanner;

public class Task07_SwitchCase_iclal {


    //  Task-> Girilen uc haneli bir sayının okunusunu print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üç haneli bir sayı giriniz :");
        int sayi = input.nextInt();

        if(sayi<=999 && sayi>=100){
            switch (sayi/100){ //sayının yüzler basamağı
                case 1: System.out.println("yüz "); break;
                case 2: System.out.println("iki yüz "); break;
                case 3: System.out.println("üç yüz "); break;
                case 4: System.out.println("dört yüz "); break;
                case 5: System.out.println("beş yüz "); break;
                case 6: System.out.println("altı yüz "); break;
                case 7: System.out.println("yedi yüz "); break;
                case 8: System.out.println("sekiz yüz "); break;
                case 9: System.out.println("dokuz yüz "); break;
            }
            switch ((sayi/10)%10){ //sayının onlar basamağı
                case 1: System.out.println("on "); break;
                case 2: System.out.println("yirmi "); break;
                case 3: System.out.println("otuz "); break;
                case 4: System.out.println("kırk "); break;
                case 5: System.out.println("elli "); break;
                case 6: System.out.println("altmış "); break;
                case 7: System.out.println("yetmiş "); break;
                case 8: System.out.println("seksen "); break;
                case 9: System.out.println("doksan "); break;
            }
            switch (sayi%10){ //sayının bir basamağı
                case 1: System.out.println("bir "); break;
                case 2: System.out.println("iki "); break;
                case 3: System.out.println("üç "); break;
                case 4: System.out.println("dört "); break;
                case 5: System.out.println("beş "); break;
                case 6: System.out.println("altı "); break;
                case 7: System.out.println("yedi "); break;
                case 8: System.out.println("sekiz ");  break;
                case 9: System.out.println("dokuzv"); break;
            }

        }else System.out.println("Üç haneli olmayan bir giriş yaptınız");


    }

}