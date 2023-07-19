package ch12_Arrays.task12;

import java.util.Arrays;

public class _19_2d_Array_3_SOR {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
//örnek iki boyutlu array

        /* int [] [] aprMD = {{1,2,3}, //0.kat
                {10,23 }, //1. kat
                {103 }   //2. kat
        };
        */

        String  [] [] aprMD = {{"new jersey","atlanta","ohio"}, //0.kat
                {"Pittsburgh" ,"ohio","new york","ohio"} , //1. kat
                {"ohio","new york"}  //2. kat
        };
        System.out.println("ilk aprMD = " + Arrays.deepToString(aprMD));
        //DÖNGÜ HATALI SONUÇ VERİYOR
        //NEDEN???

        //Chat GPT
        //Verilen kodda, iç içe geçmiş döngülerin sınırlarını
        // belirlerken hata yapılmış.
        // İç döngülerin sınırlarını aprMD.length-1 yerine aprMD[i].length-1 olarak
        // değiştirmeniz gerekiyor. Ayrıca, dış döngü için
        // i < aprMD.length-1 yerine i < aprMD.length kullanmanız gerekiyor.

        //SOR????burda split metodunu kullanmış ezgisu hanım kullanmamıza gerek var mı neden???SOR???

        for (int i = 0; i <= aprMD.length-1; i++) {
            for (int j = 0; j <= aprMD[i].length-1 ; j++) { //SOR???içteki döngüde indisleri alıyoruz
                //düzelttim ama kod düzelmedi ????
                if(aprMD[i][j].equals("ohio")){
                    aprMD[i][j]="Florida";
                }
            }
        }
        System.out.println("son aprMD = " + Arrays.deepToString(aprMD));

    }
}

