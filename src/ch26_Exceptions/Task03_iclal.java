package ch26_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task03_iclal {
//'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
//int v = vize
//int f = final

//Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
//Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.

//Diğer durumlarda ise,
//vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)

    //Programın çalışmasını sağlayın. (handle edin)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vizeNot = input.nextInt();
        System.out.println("final notunuzu giriniz");
        int finalNot = input.nextInt();

        System.out.println("ortalama(vizeNot,finalNot) = " + ortalama(vizeNot, finalNot));

    }//main sonu

    //kod bitmesin not almaya devam etsin diye loop aliyoruz
    //hoca loop içine aldı DİKKAT!!!!

    private static double ortalama(int vizeNot, int finalNot) {
        if (vizeNot > 100 || finalNot > 100 || vizeNot < 0 || finalNot < 0) {
            throw new ArithmeticException("DİKKAT !Notlar 0-100 arasında olmalı");
        } else {
            return (vizeNot * 0.4) + (finalNot * 0.6);
        }


    }


}//class sonu

