package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task08_AsalKontrol_iclal {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz - asal olup olmadığı kontrol edilecektir");
        int sayi=input.nextInt();
        // 1 ve kendisinden başka böleni olmayan sayıya asal sayı denir.
        if(sayi==2){
            System.out.println("2 sayısı asaldır");
        }
        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                System.out.println("Sayı asal değildir");
                break;
            }else System.out.println("Sayı asaldır");
            break;
        }


    }


}
