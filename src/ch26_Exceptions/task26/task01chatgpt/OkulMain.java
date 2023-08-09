package ch26_Exceptions.task26.task01chatgpt;

public class OkulMain {
    public static void main(String[] args) {
        try {
            Okul okul = new Okul("Örnek Okul", 5);

            okul.ogrenciEkle(new Ogrenci("Ali", "Yılmaz", 14));
            okul.ogrenciEkle(new Ogrenci("Ayşe", "Demir", 15));
            okul.ogrenciEkle(new Ogrenci("Mehmet", "Kara", 16)); // Yaşı 15'i geçtiği için hata verir
            okul.ogrenciEkle(new Ogrenci("Zeynep", "Koç", 14));
            okul.ogrenciEkle(new Ogrenci("Ahmet", "Can", 13)); // Yaşı 15'i geçtiği için hata verir
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
        System.out.println("kod devam ediyor");
    }
}