package ch24_Encapsulation.task24.task03;

import java.util.Scanner;

public class Main_kullanicigirisiisteyerek {

/* TODO
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */
    static String bookName;
    static String authorName;


    public static void main(String[] args) {

        kullaniciGirisi();
        Book object = new Book(bookName,authorName);

        System.out.println(object);
    }//main sonu

    private static void kullaniciGirisi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir kitap adı giriniz");
        bookName = input.nextLine();

        System.out.println("Kitabın yazarını giriniz");
        authorName = input.nextLine();
    }


}//class sonu
