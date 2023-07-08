package ch14_ForEachLoop;

public class C02_forEachLoop_iclal {
    public static void main(String[] args) {
        // task bir md array in elamanlarının çarpımını print eden code create ediniz...-> with for-each
        int [] [] arr = { {2,5,6,8 }  , {9,2,5,8 } , {3,5,7,9}  };

        //for-each loop ile
        int carpim = 1;
        int carpim2 = 1;

        for (int []   ictekiArrayler : arr     ) { //boş bir konteyner
            //int bir arrayin içinde dolaşacaksın
            //arary in data tipi integer
            //array in adı arr
            //burda 3 tane array var
            for (int herBirEleman :       ictekiArrayler   ) {
                //burda 2,5,6,8 gibi her bir elemanı tek tek alıyoruz
                //burada herbir elemana dokunabiliriz
                //içtekiler elemanın ta kendisi
                //[] konulmasına gerek yok o yüzden
                carpim *= herBirEleman;
                //artık her bir elemana dokunabiliriz...
            }
        }

    //ali bey -- carpim3 hata verdi kapattım kontrol etmedim
   //   int[][] arr = { {2, 5, 6, 8}, {0, 2, 5, 8}, {3, 5, 7, 9} };
   //   int carpma = 1;
   //   for (int[] carpım : arr) {
   //       for (int elemanlar : carpım) {
   //           carpim *= elemanlar;
   //       }
   //   }
   //   System.out.println("Elemanlarının çarpımı: " + carpim);


        System.out.println("Elemanlarının çarpımı: " + carpim);

        //normal loop ile yapalım

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim2 *= arr[i][j];
            }
        }

        System.out.println("carpim = " + carpim);//carpim = 326592000
        System.out.println("carpim2 = " + carpim2); //carpim2 = 326592000

    }
}
