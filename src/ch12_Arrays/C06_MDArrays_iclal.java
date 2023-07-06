package ch12_Arrays;

import java.util.Arrays;

public class C06_MDArrays_iclal {

    public static void main(String[] args) {
          /*
		Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

		 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
		 *  icerdeki  array'lere  inner->Daire array denir
		 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
		 *  Array'i ancak tum elemenlari atanarak declare edilmeli
		 * 3- Multi dimensional array'de bir elemanin indexi icin
		 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */

        //MD array tanimla
        int[] arr = new int[3];

        int[][] arr1 = new int[3][5];//3 satir ve her satirda 5er sutun olcak
        //3 katli bina ve her katinda 5er  daire olcak

        System.out.println("Arrays.toString(arr1) = " +
                Arrays.toString(arr1));//Arrays.toString(arr1) = [[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]
        //Arrays muti dimensional olunca deep olmalı - referans değeri verir toString olmasına rağmen

        System.out.println("Arrays.deepToString(arr1) = " +
                Arrays.deepToString(arr1));//Arrays.deepToString(arr1) = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]


        //üç boyutlu array tanımlayalım
        int[][][] arr2 = new int[2][3][5];
        //site de apr daire ornegi olabilir 5 er tane daire 3 katli herbiri 2 tane bina
        System.out.println("Arrays.deepToString(arr2) = " +
                Arrays.deepToString(arr2));
        //   Arrays.deepToString(arr2) =
        //   [[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]],
        //   [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]
        // 2 tane apartman var
        // 3er katlı
        // 5er daire var
        //site de apr daire ornegi olabilir 5 er tane daire 3 katli herbiri 2 tane bina
        //graflar veya deep learning için kullanılır ama genellikle iki boyut kullanılır.

        //task 24 kişilk 3 sınıf ve 21 kişilk 5 sınıfı olan okul nasıl array olarak tanımlanir

        int sinif1[][] = new int[3][24];
        int sinif2[][] = new int[5][21];


        System.out.println("MD array e eleman ekleme");
        //MD array e eleman ekleme
        //int [][] arr1 = new int[3][5];//3 satir ve her satirda 5 sutun olcak
        arr1[0][3] = 35;
        //0. elemanının 3. indisli elemanına 35 ata
        //Arrays.deepToString(arr1) = [[0, 0, 0, 35, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
        System.out.println("arr1 = " + arr1);
        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));

        //5 desek error verir çğnkğ 5 daire vardı 4. indese kadar devam eder.
        //arr1[2][5]=34;
        //burası hata verir!!!!

        //task atadiginiz 35 degerini print ediniz
        System.out.println("arr1[0][3] = " + arr1[0][3]);


        System.out.println("manuel olarak MD array olusturma");
        //manuel olarak MD array olusturma
        int[][] mdArr = {//outer array
                {1, 2, 3}, //0. kat       //inner arrays    //0. katta 3 tane daire var
                {10, 20}, //1. kat      //inner array       //1. katta 2 tane daire var
                {103}     //2. kat     //inner array        //2. katta 1 tane daire var

        };//outer array


        System.out.println("mdArr.length = " + mdArr.length);//mdArr.length = 3

        System.out.println("outer arrayindeki son arrayin son elemanini print edin");
        //outer arrayindeki son arrayin son elemanini print edin
        //BURASI ZOR GELDİ HOCA DERSTE İKİ KERE ANLATTI!!

          System.out.println("mdArr[mdArr.length-1][mdArr.length-1] = " + mdArr[mdArr.length - 1][0]);
        // burda sıfırıncı indis olduğunu biliyorduk direk yazdık ama dinamik olarak versin istiyoruz..
        //normalde [2][0] yazsak son elemanına ulaşmış oluruz

        System.out.println("mdArr[mdArr.length-1][mdArr.length-1] = " +
                mdArr[mdArr.length - 1][mdArr[mdArr.length - 1].length - 1]);

        //debug ile bakılabilir buna da herşeye de..


        //mdArr[mdArr.length - 1]
        //[mdArr.length - 1] ilk kısımdaki bu ifadede içiçe array lerin son array ini almış olduk..
        //içerdeki array e geldik onun en son elemanına gitmek istiyoruz.
        //[mdArr[mdArr.length - 1].length - 1]) burası da ikinici kısım
        //mdrr[2].length-1 alınca son elemana ulaşmış oluruz


        //mdArr[mdArr.length-1][mdArr.length-1] = 103


        System.out.println("mdArr[1] = " + mdArr[1]);//mdArr[1] = [I@26ba2a48
        //dairelere girdik.sadece bir array'i aldığımız için deep to stringe gerek kalmadı.
        //mdArr[1] tek bir dizi demek


        System.out.println("Arrays.toString(  mdArr[1] ) = " +
                Arrays.toString(mdArr[1]));//Arrays.toString(  mdArr[1] ) = [10, 20]


    }
}
