package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop_iclal {
    public static void main(String[] args) {


        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();

        int bolen=1;
        int bolenSayisi=0;

        while (bolen<=sayi){
            if(sayi %bolen ==0){
                bolenSayisi++;
            }
          bolen++;

        }

        System.out.println("bolenSayisi = " + bolenSayisi);

    }
}
