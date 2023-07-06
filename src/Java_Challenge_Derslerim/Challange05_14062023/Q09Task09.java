package Java_Challenge_Derslerim.Challange05_14062023;

public class Q09Task09 {
    /*
       Task-> 11'den 120'ye kadar 4 ve 6 ya tam bölünebilen sayı adedini ve toplamlarını print eden code create ediniz.
        */
    public static void main(String[] args) {
        int toplam = 0;
        int onikiyeBolunenSayıAdedi = 0;
        for (int i = 11; i <= 120; i++) {
            if (i % 12 == 0) {
                onikiyeBolunenSayıAdedi++;// if sart sağlandığı-> 12 ye tam bölünen sayı varsa sayı adedi 1 artırılır
                toplam += i;
            }
        }
        System.out.println(onikiyeBolunenSayıAdedi);
        System.out.println(toplam);
    }

}
