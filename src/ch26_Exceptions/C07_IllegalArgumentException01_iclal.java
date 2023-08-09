package ch26_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException01_iclal {
    public static void main(String[] args) throws IllegalAccessException {

/*

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */

// IllegalArgumentException -> kullanılmasını istenmeyen değerlerde program hata vermemesi isteniyorsa bu excp
// fırlatılıer
// ornek : yas datası için negatif değer girilidğinde program kırılmadan run olması ama girilen değer için excp
// fırlatması için kullanılır..

        Scanner input=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas=input.nextInt();

   //     if(yas<18){
   //         System.out.println("yaşınız "+yas+" giriş yapamazsın");
   //         throw new IllegalAccessException();
   //     }else System.out.println("mekanın sahibi geldi");
//
        try {

            if (yas < 18) {
                System.out.println("yaşınız " + yas + " giriş yapamazsın");
                throw new IllegalAccessException();
                //hata new leyerek, cathc blogunu da çalıştırmış olduk  zeynep hanım
                //hatayı new leyerek catch e gitti şafak hanım
                //throw bizi catche kanalize etti  ahmet bey
                //IllegalAccessException class'ından illegal objesi create ettik  iclal
            } else System.out.println("mekanın sahibi geldi");
        }catch (IllegalAccessException illegal){
            System.out.println("yaşın yetmiyor giriş için " + illegal.getMessage());
        }

        System.out.println("kod devam  kee");

        // try catch metodu kullanarak kodun devam etmesini sağladık


    }
}
