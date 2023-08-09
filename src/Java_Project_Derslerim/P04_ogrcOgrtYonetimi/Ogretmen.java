package Java_Project_Derslerim.P04_ogrcOgrtYonetimi;

public class Ogretmen extends Kisi{// ogretmen obj uretecek child pojo class
    // fields

   private String  bolum;

    private String sicilNo;

    public Ogretmen(String ad_soyad, String kimlikNo, int yas, String bolum, String sicilNo) {//full p'li telescopic const.
        super(ad_soyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' ;
    }
}
