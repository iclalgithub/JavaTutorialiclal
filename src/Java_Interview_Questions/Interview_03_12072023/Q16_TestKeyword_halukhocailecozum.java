package Java_Interview_Questions.Interview_03_12072023;

public class Q16_TestKeyword_halukhocailecozum {
    /* Task->
    ogrencilerin test sonuclarini print eden method create ediniz.
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin 7 dogru cevabi var.
    2 nolu ogrencinin 6 dogru cevabi var.
       "           "
       "           "
       "           "
    8 nolu ogrencinin 7 dogru cevabi var.
*/
    public static void main(String[] args) {
        char[][] ogrenciCevap = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},//ali katı
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},//meryem katı
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},//ahmet katı
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] cevapAnahtari = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        testPuanHesapla(ogrenciCevap, cevapAnahtari);
    }

    private static void testPuanHesapla(char[][] ogrenciCevap, char[] cevapAnahtari) {
        //int puan = 0;
        //1. öğrencinin puanı: 7 -- çıktı hatalı
        //2. öğrencinin puanı: 13
        //3. öğrencinin puanı: 18
        //4. öğrencinin puanı: 22
        //5. öğrencinin puanı: 30
        //6. öğrencinin puanı: 37
        //7. öğrencinin puanı: 44
        //8. öğrencinin puanı: 51
        for (int i = 0; i < ogrenciCevap.length; i++) {//her bir öğrenciyi tekrara alır
            int puan = 0;//her defasında öğrenciler için sıfırlanması lazım yoksa eklenir hata olur

            for (int j = 0; j < ogrenciCevap[i].length; j++) {//tekrardaki herbir öğrenci cevapları tekrara alın
                if (ogrenciCevap[i][j] == cevapAnahtari[j]) {
                    puan++;
                }
            }
            System.out.println((i+1) +". öğrencinin puanı: "+puan);
            // int puan = 0; buraya da koyabiliriz
        }
    }

}
