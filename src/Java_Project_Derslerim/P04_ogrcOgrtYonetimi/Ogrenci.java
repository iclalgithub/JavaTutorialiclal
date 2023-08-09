package Java_Project_Derslerim.P04_ogrcOgrtYonetimi;

public class Ogrenci extends Kisi{// ogrenci obj uretecek child pojo class
    // fields

 private    String  numara;
 private    String sınıf;
    public Ogrenci(String ad_soyad, String kimlikNo, int yas, String numara, String sınıf) {//full p'li telescopic const.
        super(ad_soyad, kimlikNo, yas);
        this.numara = numara;
        this.sınıf = sınıf;

    }
    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }



    @Override
    public String toString() {
        return super.toString() + '\''+
                "numara='" + numara + '\'' +
                ", sınıf='" + sınıf + '\'' ;
    }
}
