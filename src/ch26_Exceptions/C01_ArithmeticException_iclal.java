package ch26_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException_iclal {
    //  ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. sayi gir");
        int sayi1 = input.nextInt();

        System.out.println("2. sayi gir");
        int sayi2 = input.nextInt();

        //RTE     int sonuc = sayi1 / sayi2 ;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //kod çalışmaz burda hata verir
        System.out.println("uygulama calismaya devam ediyor");

        try {//kodu ilk derleyen block burasidir
              /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz catch block, try
            block exception  yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch
            block tanımlanabilir.
               aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
             */

            int sonuc = sayi1 / sayi2;
            //sayi2 0 olduğunda hata verir
            //ArithmeticException
            // ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur

            System.out.println("sonuc = " + sonuc);
            System.out.println("try block icerisinden geliyor");
            //TRY CATCH NASIL EKLENİR??
            //hata olması ihtimal kodu alıyoruz
            //o satıra geliyoruz
            //ctrl+alt+t
            //cmd+alt+t
            //try catch seçilir ve blok eklenir...
            //kendiliğinden try catch eklendi...

        } catch (StringIndexOutOfBoundsException ex) {//genelde e veya ex olur
            //bir kaç tane catch eklenebilir
            //aynı catch olmaz sırayla farklı farklı hataları ekliyoruz
            System.out.println("StringIndexOutOfBoundsException sayi sifira bolunmez");
            System.out.println("ex.getMessage() = " + ex.getMessage());

        } catch (ArithmeticException e) {
            //birden fazla catch de asagiya dogru class level artarak yazilmali
            System.out.println("ArithmeticException sayi sifira baolunmez");

        } catch (Exception e) {
            //yukarıdai exception lar olmazsa burası çalışır
            //yukarıdaki hatalar olmazsa burda yakala
            //en baba class
            System.out.println("Exception eger bir exception varsa yukardakiler disinda caliscak yer burasi");

        } finally {//finally blok çok kullanılmaz
            //her zaman çalışır
            System.out.println("finally blocktan selamlar her zman calisiri");
             /*
            try - catch içinde yapılma işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
            ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hata olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
        }
        System.out.println("class in en son kodu bakalim konsolda gorcez mi?");

    }

}
