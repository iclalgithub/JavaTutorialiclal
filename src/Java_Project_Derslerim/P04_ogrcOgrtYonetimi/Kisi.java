package Java_Project_Derslerim.P04_ogrcOgrtYonetimi;

public class Kisi {//parent pojo parent class
  private String  ad_soyad;
  private String  kimlikNo;
  private int yas;

    public Kisi(String ad_soyad, String kimlikNo, int yas) {
        this.ad_soyad = ad_soyad;
        this.kimlikNo = kimlikNo;
       // this.yas = Math.abs(yas);//p - gelen tas değeri mutlak değeri ile obj gönderilri
        setYas(yas);
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas =Math.abs(yas);//p gelen yas değeri mutlak değeri ile obj gönderirlir
    }



    @Override
   public String toString() {
       return
               "ad_soyad='" + ad_soyad + '\'' +
               ", kimlikNo='" + kimlikNo + '\'' +
               ", yas=" + yas;
   }
}
