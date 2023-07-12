package ch20_Constructor;


public class C04_Teacher_iclal {

    //fields
    int id;
    String ad;
    String soyad;
    String brans;
    int tecrube;
    int yas;
    double maas;
    boolean emekliMi;

    //cmd + N

    //task pm li const kullanarak
    // ogretmen objesi create ediniz tum field lari kullanma opsionel

    //POJO class create etiginize fieldlari yazdiktan sonra
    // mutlaka yapilmasi gerekenler
    //  1  toString methodu
    //  2  pm li ve pm szi constructo lar
    //  3

    //POJO Class nedir?
    //bizim constructor class'a vrdiğimiz isim
    //objelerin yalın halde tutulduğu yer
    //lakap takma ad core Java'da
    //Reelde empty Class


    //C
    public C04_Teacher_iclal() {
    }


    //cmd+N ye bas
    //Constructor create etmek için

    public C04_Teacher_iclal(String ad, String soyad, String brans) {
        //Sıralama çok önemli burda
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
    }

    public void dersSaati() {
        System.out.println("haftada 15 saat sonrasi extra olur");
    }

    //Full parametreli Constructor
    //SAğ click Generator
    //Constructor

    //Cmd + N kısayol
    //araştırdım hocam bilmiyordum
    //en istenen en aranan IT personeli:)
    //arayan bulan:)

    @Override
    public String toString() {
        return "C04_Teacher_iclal{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", yas=" + yas +
                ", maas=" + maas +
                ", emekliMi=" + emekliMi +
                '}';
    }
}
