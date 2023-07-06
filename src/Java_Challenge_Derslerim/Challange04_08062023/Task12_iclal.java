package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task12_iclal {
    // Task-> Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Task-> Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        //String kelime = input.next().toUpperCase();
        //burda nextline kullanmayınca hata veriyor
        //......
        //Chat GPT açıklaması altta
        //next() metodu, kullanıcının girdiğini boşluklara göre ayırır
        // ve sadece ilk kelimeyi alır.
        // Bu nedenle, ikinci bir kelime girildiğinde dahi contains() metodu doğru sonucu vermez.
        //Bu hatayı düzeltmek için nextLine() metodunu kullanarak tüm satırı okuyabilir
        // ve ardından contains() metoduyla boşluk kontrolü yapabilirsiniz.

        String kelime = input.nextLine().toUpperCase();

        if(kelime.length()==0){
            System.out.println("boş kelime girdiniz");
        }else {
            System.out.println("kelimenin boşluk içerip içermediği kontrol edilecek");
            if ( kelime.contains(" ")){
                System.out.println("kelime boşluk içerir");
            }else System.out.println("kelime boşluk içermez");
        }

    }
}