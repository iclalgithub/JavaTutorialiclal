package ch12_Arrays;

public class C08_Arrays_iclal {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        //indisleri veriyor değer vermesi lazım
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if((arr[i]+arr[j])==9){
                    System.out.println("İstenen toplam bulundu"+"arr"+i+j);
                }
            }
        }

    }
}
