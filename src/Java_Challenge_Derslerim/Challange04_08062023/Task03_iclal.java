package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task03_iclal {

    // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    //? substring ile aldım
    //hoca farklı çözmüş dosyadan bak--diğer Taks03 te


// Chat GPT arama sonucu
//    "\d": Bu ifade, herhangi bir rakam (0-9) karakterini temsil eder.
//    Yani, "\d" ifadesi, metin içindeki herhangi bir rakamı eşleştirir.
//    Örneğin, "123" veya "5" gibi rakamlar "\d" ile eşleşirken, harf veya özel karakterler eşleşmez.
//          "\D": Bu ifade, rakam olmayan herhangi bir karakteri temsil eder.
//          Yani, "\D" ifadesi, metin içindeki herhangi bir harf, özel karakter veya boşluk gibi rakam olmayan karakterleri eşleştirir.
//          Örneğin, "abc", "XYZ" veya "!@#" gibi karakterler "\D" ile eşleşirken, rakamlar eşleşmez.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci fiyatı giriniz");
        String fiyat1 = input.next();
        String newfiyat1 = fiyat1.substring(1);
        System.out.println("ikinci fiyatı giriniz");
        String fiyat2 = input.next();
        String newfiyat2 = fiyat2.substring(1);


        double sayi1 = Double.parseDouble(newfiyat1);
        double sayi2 = Double.parseDouble(newfiyat2);

        double toplam = sayi1 + sayi2;
        System.out.println("toplam = " + toplam);

        // task03' te \\d veya \\D kullanın demiş düzenledim

        String str3 = "$13.99"; //"$13.99"
        String str4 = "$10.55"; //"$10.55"
        System.out.println("str3 = " + str3);
        str3 = str3.replaceAll("\\D", "");
        System.out.println("str3 son durum= " + str3);
        System.out.println("str4 = " + str4);
        str4 = str4.replaceAll("\\D", "");
        System.out.println("str4 son durum= " + str4);
        double str3ündobleHali = Double.parseDouble(str3) / 100;// string olan str3 double olarak atandı
        double str4ündobleHali = Double.parseDouble(str4) / 100;// string olan str4 double olarak atandı
        System.out.println("str3ün double Hali=" + " " + str3ündobleHali);
        System.out.println("str4ün double Hali=" + " " + str4ündobleHali);
        double toplam2 = str3ündobleHali + str4ündobleHali;
        System.out.println("str3 ve str4 toplamı= " + " " + toplam2);//24.54

        //İkinci Yol ReplaceAll yerine ReplaceFirst yapalım
        String str5 = "$13.99"; //"13.99"
        String str6 = "$10.55";
        System.out.println("str1'in ilk hali= " + str5);// $13.99
        str5 = str5.replaceFirst("\\D", "");
        System.out.println("str5'in $ silinmiş hali= " + str5);// 13.99

        str6 = str6.replaceFirst("\\D", "");
        System.out.println("str6'nın $ silinmiş hali= " + str6); //10.55

        System.out.println("str5 ve str6'nın toplamı= "+str5 + str6);
        double str5indobleHali = Double.parseDouble(str5);// string olan str1 double olarak atandı
        double str6nındobleHali = Double.parseDouble(str6);// string olan str2 double olarak atandı
        System.out.println(str5indobleHali);
        System.out.println(str6nındobleHali);
        System.out.println("str5 ve str6'nın toplamı= "+str5indobleHali + str6nındobleHali);//24.54

    }

}
