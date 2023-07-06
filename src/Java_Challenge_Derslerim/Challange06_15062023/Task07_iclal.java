package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task07_iclal {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");

        String metin = input.nextLine();

        for (int i = 0; i < metin.length() - 1; i++) {
            if (metin.charAt(i) == 'a' || metin.charAt(i) == ' ') { // metin.contains(" ") kullanınca olmadı
                //metinin sıfırıncı karakterini getir - eğer a ise döngüde birşey yapma devam et
                // contains neden olmadı???
                // mesela adana kelimesi için her defasında a içerir mi dersek doğru olur
                //ve her defasında continue olduğu için birşey yazdırmaz.
                //harf harf kontrol etmemiz gerekiyor.
                continue; //döngü çalışmasın geç devam et
            }
            System.out.print(metin.charAt(i));

        }


    }
}



