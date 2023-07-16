package Java_Project_Derslerim.P03_sanslıKullanıcı;

import java.time.LocalDateTime;

public class Kullanici_iclal {
    //Step 1 - kullanıcı obje üretecek main olmayan
    //POJO class

    //fields'lar String tipinde name

    String name;
    LocalDateTime kayitZamani;

    public Kullanici_iclal(String name, LocalDateTime kayitZamani) {
        //obje üretecek full parametreli
        //teleskopik constructor
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {
        //obje field 'larını string'e çeviren method
        return "Kullanici_iclal{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }

    public Kullanici_iclal() {
        //parametresiz constructor
    }
}
