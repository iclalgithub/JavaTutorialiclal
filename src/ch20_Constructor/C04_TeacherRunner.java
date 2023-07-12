package ch20_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        //task pm li const kullanarak
        // ogretmen objesi create ediniz tum field lari kullanma opsionel

        //Rumeysa hanim dan
        //direk atama yapmış
        System.out.println("Birinci yöntem");
        C04_Teacher tch = new C04_Teacher("Ayse",
                        "Kilic","muzik");
        //default değerler gelmiş - yazılmayan kısımlara
        System.out.println(tch);

        //Zaynep hanim dan
        System.out.println("İkinci yöntem");
        C04_Teacher ogretmen = new C04_Teacher();

        ogretmen.ad= "zeynep";
        ogretmen.soyad= "Aytop";
        ogretmen.brans = "kimya";
        ogretmen.id = 123654;
        ogretmen.emekliMi= false;
        ogretmen.maas = 15000;
        ogretmen.tecrube= 15;
        ogretmen.yas=37;

        System.out.println("ogretmen = " + ogretmen);
        //C04 class'ında override edildiği için burda toString'e gerek yok

        System.out.println("Üçüncü yöntem");
        C04_Teacher ogretmenFullPmli = new C04_Teacher(1,"bayram","aslan"
        ,"fizik", 30,55,50000.5,false);

        System.out.println("ogretmenFullPmli = " + ogretmenFullPmli);
    }
}
