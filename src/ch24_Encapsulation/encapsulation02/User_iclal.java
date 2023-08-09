package ch24_Encapsulation.encapsulation02;
/* TASK
User pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)

yas variable negatif değer girmeye karsı check edin

runner class'da obj ile field ları print eden code create ediniz
 */
public class User_iclal {
    private  String ad;
    private String soyad;
    private  String password;

    private int yas;

    public User_iclal(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        //this.yas = yas;
        if(yas>0){
            this.yas=yas;
        }else this.yas=yas*(-1);
    }

    public User_iclal() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public int setYas(int yas) {
       return this.yas = Math.abs(yas);
    }

    @Override
    public String toString() {
        return "User{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + yas +
                '}';
    }


}