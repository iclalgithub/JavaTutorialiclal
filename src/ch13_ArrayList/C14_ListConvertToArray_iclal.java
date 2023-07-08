package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray_iclal {
    public static void main(String[] args) {
        //listi Array e cevirmek icin toArray() methodu kullanilir

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        //city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        //amacımız buna Array'e çevirmek

        //1. yol donen deger Object class a atanirsa
        //çok tercih edilmiyor- etmemeliyiz
        Object [] arrCity = city.toArray();
        //type casting yaparak istenilen şekilde değiştirebiliriz
        //parametre almıyor


        System.out.println("arrCity = " + arrCity);
        //arrCity = [Ljava.lang.Object;@a09ee92
        System.out.println("arrCity = " + Arrays.toString(arrCity));//arrCity = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        //arrCity = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        //2. yol toArray methodu ile
        String [] arrCity2 = city.toArray( new String[0] );
        //istenilen tipte yeni bir array new lemiş oluyoruz
        //data type farketmez..integer için de yapabiliriz aynı şeyleri

        //Chat GPT
        /*
        Object[] arrCity = city.toArray(); ifadesi,
        elemanların türünü belirtmeden Collection nesnesini Object dizisine dönüştürürken,
         String[] arrCity2 = city.toArray(new String[0]); ifadesi
         elemanların türünü String olarak belirtip,
          Collection nesnesini String dizisine dönüştürür.
          İkinci kullanım, daha spesifik bir türü belirterek tür uyumluluğunu sağlar.
         */


        //herhangi bir rakam yazsak sorun olmaz..
        System.out.println("arrCity2 = " + Arrays.toString(arrCity2));
        // aarCity2 = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]







    }
}
