package Java_Challenge_Derslerim.Challange03_07062023;

import java.util.Scanner;

public class Task04_SwitchCase_iclal {
    /* ÖNEMLİİİİİİ interview da sorulabilir long float double kullanılmaz
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("haftanın bir gününü giriniz");
        String gun = input.next().toUpperCase();

        switch (gun) {

            case "PAZARTESİ":
            case "SALI":
                System.out.println("Java dersi gunleri");
                break;
            case "PERŞEMBE":
            case "CUMA":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "ÇARŞAMBA":
            case "CUMARTESİ":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu - off day");
                //burda break 'e gerek yok
                //default switch blok'un herhangi bir yerinde olabilir
        }


    }

}
