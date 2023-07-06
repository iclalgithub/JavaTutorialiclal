package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task08 {

      /* task->  girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz..
   artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("agam yıl sayi giresen : ");
        int yıl = input.nextInt();

        System.out.println(artıkYılControlEt(yıl));
    }

    private static String artıkYılControlEt(int yıl) {

        return
                ( yıl%4==0 && (yıl%100!=0||yıl%400==0)) ?"girilen yıl ARTIK" :"girilen yıl ARTIK DEĞİL";
    }

}
