package ch26_Exceptions.task26.task01;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrencileri;

 //  public Okul() {
 //  }

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }


    public void ogrenciEkle(Ogrenci ogrenci) {
        if (ogrenci.getYas() <= 15) {
            if (ogrencileri.size() < maxOgrenciSayisi) {
                ogrencileri.add(ogrenci);
                System.out.println(ogrenci.getAd() + " " + ogrenci.getSoyad() + " okula eklendi.");
            } else {
                System.out.println("Okul kapasitesi dolu. Başka öğrenci eklenemez.");
            }
        } else {
            System.out.println("Öğrenci yaşı 15'i geçemez. Başka öğrenci isteyiniz.");
        }
    }

}