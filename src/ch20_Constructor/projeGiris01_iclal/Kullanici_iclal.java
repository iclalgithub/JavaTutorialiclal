package ch20_Constructor.projeGiris01_iclal;

import java.time.LocalDateTime;

public class Kullanici_iclal {//POJO class
  /*  Pojo class create edildiğinde fieldlar yazıldıktan sonra muhakkak yapılası gerkenler
1)toString methodu
2)pm li ve pmsiz constructer
3)*/
    String name;
    LocalDateTime kayitZamani;

    public Kullanici_iclal(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    public Kullanici_iclal() {

    }

    @Override
    public String toString() {
        return "Kullanici_iclal{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
