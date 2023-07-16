package ch20_Constructor;

public class C06_OgrenciRunner_iclal {
    public static void main(String[] args) {
        //C06_Ogrenci_iclal C06_Ogrenci_iclal = new C06_Ogrenci_iclal();
        //parametresiz içinde kod yok diye
        C06_Ogrenci_iclal C06_Ogrenci_iclal =
                new C06_Ogrenci_iclal(" Furkan bey", 35);
        System.out.println("***********");
        System.out.println("C06_Ogrenci_iclal.isim = " + C06_Ogrenci_iclal.isim);
        System.out.println("C06_Ogrenci_iclal.yas = " + C06_Ogrenci_iclal.yas);
        System.out.println("C06_Ogrenci_iclal.age = " + C06_Ogrenci_iclal.age);
        System.out.println("C06_Ogrenci_iclal.name = " + C06_Ogrenci_iclal.name);

        //Local isim instance isime atamak için this.isim kullandık

       // name = isim demiştk soutta neden ilk zeynep ckti hocam


    }
}
