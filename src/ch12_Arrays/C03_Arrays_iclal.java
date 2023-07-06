package ch12_Arrays;

import java.util.Arrays;

public class C03_Arrays_iclal {
    public static void main(String[] args) {
        //Stringi array'a çevirme...split()
        //girilan parametre değere göre String ifade parçalanır.

        String str = " tam oturması icin birkac ornek daha gerekir  ";

        //str.split(" ");

        String[] yeniArr = str.split(" ");

        System.out.println("str " + str);
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        //başta ve sonda boşluk var trim

        System.out.println("trim eklendi");
        String[] yeniArr2 = str.trim().split("");
        System.out.println("str " + str);
        System.out.println("Arrays.toString(yeniArr2) = " + Arrays.toString(yeniArr2));

        // task str objesinde karakter sayısını kullanılmıştır print ettirin
        System.out.println("str.length " + str.length()); //Karakter sayısı: 44

        // task str objesinde kaç tane harf kullanılmıştır print edin
        String bosluksuz = str.replace("\\s","");
        //tüm boşlukları hiçe çevirdi
        System.out.println("bosluksuz: "+bosluksuz);
        System.out.println("bosluksuz.split(\"\").length = " + bosluksuz.split("").length);

        // DERSİN SONUNU TEKRAR ETtim SON KODU YAZMAMIŞTIM EKLEDİM

        System.out.println("Arrays.toString(arrBosluksuz) = " + Arrays.toString(yeniArr2));
        //Arrays.toString(arrBosluksuz) = [t, a, m, o, t, u, r, m, a, s, i, i, c, i, n, b, i, r, k, a, c, o, r, n, e, k, d, a, h, a, g, e, r, e, k, i, r]

        System.out.println("arrBosluksuz.length = " + yeniArr2.length);
        //arrBosluksuz.length = 37

        System.out.println("bosluksuz.split(\"\").length = " + bosluksuz.split("").length);
        //bosluksuz.split("").length = 37


    }
}
