package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task07_Nested_iclal {

    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input   : selam javaCAN'lar
        output : a sayısı : 4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = input.nextLine();

        System.out.println("hangi karakterin sayısını istiyorsunuz");
        char karakter=input.next().charAt(0);

        int uzunluk=cumle.length();
        System.out.println("cümlenin uzunluğu = " + uzunluk);

        int count=0;

        for (int i = 0; i < uzunluk-1; i++) {
            if (cumle.charAt(i)==karakter){
                count++;
            }

        }
        System.out.println("istenilen karakter sayısı = " + count);

    }
}