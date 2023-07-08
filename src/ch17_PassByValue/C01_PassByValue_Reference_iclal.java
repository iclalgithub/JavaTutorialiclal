package ch17_PassByValue;

public class C01_PassByValue_Reference_iclal {
    public static void main(String[] args) {
         /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bşr methoda call edildiğinde
        variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

        Pass by value örneği: Diyelim ki bir fincanımız var ve bu fincanda kahve
        içeceğiz. Yanımızda bir arkadaşımız da var ve o da kahve içmek istiyor.
        Ancak fincanımızın yalnızca bir kulbu var ve sadece bir kişi fincanı
        tutabilir.
        Bu durumda, fincanı arkadaşımıza vermek yerine fincanın bir kopyasını
        alıp arkadaşımıza veriyoruz. Bu kopya fincan, orijinal fincanla aynı
        görünebilir ve benzer şekilde kahve alabilir, ancak üzerinde
        yapacağımız değişiklikler orijinal fincanı etkilemez.

        Pass by reference örneği: Diyelim ki bir fincanımız var ve bu fincanda
        kahve içeceğiz. Yanımızda bir arkadaşımız da var ve o da kahve içmek
        istiyor. Ancak fincanımızın iki kulbu var ve her iki kişi de fincanı
        tutabilir. Bu durumda, fincanı arkadaşımıza veriyoruz ve her ikisi de
        fincanı tutuyor. Eğer fincan üzerinde herhangi bir değişiklik yaparsak,
        bu değişiklikler her ikisini de etkiler, çünkü her iki kişi de aynı
        fincanı paylaşıyor.


        "DİKKAT"Java gibi bazı programlama dillerinde, primitive veri tipleri
        (int, float, boolean vb.) pass by value olarak ele alınırken,
        nesne tipleri (String, List, Object vb.) pass by reference olarak
        ele alınır.

        Pass by value, bir kopya anahtar teslim etmek gibidir.
        Diyelim ki, bir kapıyı kilitlemek için bir anahtarınız var.
        Anahtarı bir kopya olarak bir başkasına verirsiniz.
        Eğer o kişi anahtarın üzerinde herhangi bir değişiklik yaparsa,
        sizin anahtarınızın üzerinde bir değişiklik olmaz.
        Anahtarınızın kopyası verilmiştir ve bu kopyanın üzerinde
        yapılan değişiklikler orijinal anahtarınızı etkilemez.


        //Asiye hanim
        //anahtari paspasin altina koyarsak pass by reference olur

        Pass by reference ise, bir adresi anahtar teslim etmek gibidir.
        Diyelim ki, bir ev sahibi olarak bir adresiniz var. Bu adresi bir
        başkasına verirsiniz. O kişi bu adrese gider ve evin duvarlarında
        veya mobilyalarında değişiklik yapar. Bu değişiklikler doğrudan
        evinize yapılır, çünkü verdiğiniz şey adrestir. Adres, evinizin
        tam konumunu gösterir ve üzerinde yapılan değişiklikler doğrudan
        evinize etki eder.

           */

        int x = 10;
        String s = "hello";

        //değer tipi değiken değiştirme
        incrementInt(x);
        System.out.println("method call sonrası x değer" + x);//10
        //değer tipi değişken değiştirme
        
        changeStrings(s);
        System.out.println("method call sonrası "+s);

        // task -> verilen fiyat için %24 artırılmış fiyatı print eden method
        // create ediniz.
        double fiyat = 100;
        System.out.println("method call öncesi fiyat = " + fiyat);
        fiyatArttir(fiyat);
        System.out.println("method call sonrası fiyat = " + fiyat);

        /*method call öncesi fiyat = 100.0
method içinde fiyat124.0
method call sonrası fiyat = 100.0
         */

    }//main sonu

    private static void fiyatArttir(double fiyat) {
        fiyat*=1.24;
        System.out.println("method içinde fiyat"+fiyat);
    }
    //ahmet bey
    //    private static double ArtırılmısDeger(double x) {
    //        x+=x*0.25;
    //        return x;
    //    }

    private static void changeStrings(String s) {
        s="world";
        System.out.println("method içinde s="+s);
    }

    private static void incrementInt(int x) {
        x*=10;
        System.out.println("IncrementInt metodu içinden x değeri"+x);
    }

    //Chat GPT --Pass by Value
    //public static void changeValue(int value) {
    //    value = 10; // Değer değiştirildi
    //}
    //
    //public static void main(String[] args) {
    //    int number = 5;
    //    changeValue(number);
    //    System.out.println(number); // Çıktı: 5 (Değer değişmedi)
    //}

   //CHAT GPT--Pass by Reference
   //class Person {
    //    String name;
    //
    //    Person(String name) {
    //        this.name = name;
    //    }
    //}
    //
    //public static void changeName(Person person) {
    //    person.name = "Alice"; // Değer değiştirildi
    //}
    //
    //public static void main(String[] args) {
    //    Person p = new Person("John");
    //    changeName(p);
    //    System.out.println(p.name); // Çıktı: Alice (Değer değişti)
    //}

    //Chat GPT --
    //Java'da pass by reference (referans aktarımı) doğrudan olarak kullanılamaz.
    // Java, değer aktarımı (pass by value) üzerine kurulu bir dil olarak tasarlanmıştır.
    // Ancak, bir class nesnesi üzerinde çalışırken, bu nesnenin referansını kopyalar
    // ve bu referans üzerinden nesneye erişir.
    // Bu durum, referansın kendisi kopyalanmazken,
    // referansın işaret ettiği nesnenin değiştirilebilmesini sağlar.

    //Chat GPT--
    //Yani, Java'da class nesneleri pass by reference gibi davranır
    // gibi görünebilir, çünkü referanslar üzerinden nesneye
    // erişilebilir ve nesnenin durumu değiştirilebilir.
    // Ancak, aslında referanslar pass by value (değer aktarımı)
    // olarak çalışır. Yani, referanslar kopyalanır ve methoda
    // kopyalanan referanslar üzerinden orijinal nesneye erişilir.
    // Bu nedenle, referansın kendisi değiştirilemez, ancak
    // referansın işaret ettiği nesnenin durumu değiştirilebilir.

}//class sonu
