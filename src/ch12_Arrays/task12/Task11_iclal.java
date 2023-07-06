package ch12_Arrays.task12;

import java.util.Arrays;

public class Task11_iclal {
    static int dollarTotal = 0;
    static int poundTotal = 0;
    static String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        icerirMi();
        toplamGoruntule();
    }//main sonu

    private static void toplamGoruntule() {
        System.out.println("Toplam dolar: $" + dollarTotal);
        System.out.println("Toplam pound: £" + poundTotal);
    }

    private static void icerirMi() {
        //önce split metodu ile hiçlik yardımı ile ayır
        //yani karakter karakter böl
        String[] str2 = str.split(" ");
        System.out.println("Boşluklara göre ayrılmış str2 dizisi: " + Arrays.toString(str2));
        for (int i = 0; i < str2.length; i++){
            //$ ve £ dahil etmeden toplanacak miktarı belirlemek lazım
            if(str2[i].startsWith("$")){ //burda contains yerine startsWith kullanmak daha mantıklı
                // dollarTotal=str2[i];
                String numberString = str2[i].substring(1); // "$" işaretini çıkar
                int number = Integer.parseInt((numberString));
                //String inte e dönüştürülmeli
                // parseInt kullanılması lazım inet'e dönüştürmek için
                dollarTotal+=number;
            }else if(str2[i].startsWith("£")) {
                String numberString = str2[i].substring(1); // "$" işaretini çıkar
                int number = Integer.parseInt((numberString));
                //Chat GPT
                //parseInt() metodu kullanılarak numberString dizesi
                // 123 tamsayısına dönüştürülür ve number değişkenine atanır.
                //
                //   int number2=Integer.valueOf(numberString);// Integer
                //alueOf() metodu kullanılarak numberString dizesi Integer
                // türünde bir nesneye dönüştürülür ve number2 değişkenine atanır.
                poundTotal+=number;
            }
        }


    }

}//class sonu
