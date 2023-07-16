package Java_Project_Derslerim.P03_sanslıKullanıcı;

import java.time.LocalDateTime;

//task 1. stepp
public class Kullanıcı {//kullanıcı obj uretecek kalıphane class -> main olmaz
    //POJO CLASS
    //
    //obje üreten en basit class—POJO CLASS—
    String name;//obj de değer alacak inst. var.
    LocalDateTime kayıtZamanı;//obj de değer alacak inst. var.

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//full p'li teleskopik cons.
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

    //her objenin bir referans değeri var
    //Array bir refrans değeridir
    //Heap te saklanır- Arrays.toString ile yazdırılır
    //
    @Override
    public String toString() {//bu class'dan olusturulan obj print etmek için obj datalarını string'e cevirir
        return
                "name='" + name + '\'' +
                        ", kayıtZamanı=" + kayıtZamanı;
    }
}
