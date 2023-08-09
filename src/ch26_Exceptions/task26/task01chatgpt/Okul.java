package ch26_Exceptions.task26.task01chatgpt;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciler;

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciler = new ArrayList<>();
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

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public void ogrenciEkle(Ogrenci ogrenci) throws Exception {
        if (ogrenci.getYas() > 15) {
            throw new Exception("Öğrenci yaşı 15'i geçemez!");
        }

        if (ogrenciler.size() >= maxOgrenciSayisi) {
            throw new Exception("Maksimum öğrenci sayısına ulaşıldı. Yeni öğrenci eklenemez.");
        }

        ogrenciler.add(ogrenci);
        System.out.println("Öğrenci eklendi: " + ogrenci.getAd() + " " + ogrenci.getSoyad());
    }
}