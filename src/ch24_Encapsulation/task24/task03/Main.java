package ch24_Encapsulation.task24.task03;

public class Main {

/* TODO
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */

    public static void main(String[] args) {

        Book object = new Book("BOOKNAME","AUTHORNAME");

        System.out.println(object);
        System.out.println(object.toString());//ikisinin de çıktısı aynı
        //sadece object sout etmek ile tostring metodu call ederek sout etmek aynı şey

        //object.getBookName();
        //15-16-17.satırdaki getter metodu sayesinde call edildi
    }






}
