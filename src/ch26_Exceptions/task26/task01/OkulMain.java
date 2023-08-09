package ch26_Exceptions.task26.task01;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul = new Okul("Örnek Okul", 3);

        Ogrenci ogrenci1 = new Ogrenci("Ali", "a", 16);
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "a", 18);
        Ogrenci ogrenci3 = new Ogrenci("Ahmet", "a", 23);

        okul.ogrenciEkle(ogrenci1);
        okul.ogrenciEkle(ogrenci2);
        okul.ogrenciEkle(ogrenci3);
    }
}