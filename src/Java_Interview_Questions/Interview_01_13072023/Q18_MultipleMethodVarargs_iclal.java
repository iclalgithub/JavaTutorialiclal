package Java_Interview_Questions.Interview_01_13072023;

public class Q18_MultipleMethodVarargs_iclal {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
 */
    public static void main(String[] args) {
        notHesapla("zeynep hanım",77,81,90,66,83);
        notHesapla("sefil  haluk",77,81,90,66,83);
        notHesapla("aytekin bey",77,81,90,66,83);
        notHesapla("meryem hanım",77,81,90,66,83);

    }//main sonu

    public static void notHesapla(String name, int... notes) {

        int toplam = 0;
        for (int w : notes) {
            toplam = 0;
            toplam += w;
        }
        System.out.println(name + " not ortalaması: " + Math.round(toplam / notes.length));
    }


}//class sonu
