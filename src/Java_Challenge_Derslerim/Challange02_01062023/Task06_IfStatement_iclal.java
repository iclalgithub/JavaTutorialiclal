package Java_Challenge_Derslerim.Challange02_01062023;

import java.util.Scanner;

public class Task06_IfStatement_iclal {

    /*
   Task->
   Girilen not değeri için
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz

     Girilen saat değeri için
	 	0 ~12 ==> good morning
		12 ~ 15 ==> good afternoon
		15 ~ 23 ==> good night
		12 ==> good noon
		print eden code create ediniz.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Notunu giriniz");
        int not = input.nextInt();


            if (not >= 90 && not<100 ) {
                System.out.println("A");
            } else if (not >= 80 && not<90) {
                System.out.println("B");
            } else if (not >= 70 && not<80) {
                System.out.println("C");
            } else if (not >= 60 && not<70) {
                System.out.println("D");
            }else if (not >= 0 && not<59) {
                System.out.println("F");
            }else {
                System.out.println("geçerli not giriniz");
            }


        System.out.println("***YENİ DÖNGÜ SORUSU***");

        System.out.println("Saati giriniz");
        int saat = input.nextInt();

        if (saat >= 0 && saat<12 ) {
            System.out.println("good morning");
        } else if (saat >= 12 && saat<15) {
            System.out.println("good afternoon");
        } else if (saat >= 15 && saat<23) {
            System.out.println("good night");
        } else if (saat==12) {
            System.out.println("good noon");
        }else {
            System.out.println("geçerli saat giriniz");
        }



    }
}


