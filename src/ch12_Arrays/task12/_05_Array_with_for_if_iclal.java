package ch12_Arrays.task12;

public class _05_Array_with_for_if_iclal {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

        int toplam=0;
        int [] arr={5,6,8,12,14,19};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                toplam+=arr[i];
            }else {
                toplam-=arr[i];
            }

        }
        System.out.println("dizi toplamı = " + toplam);


    }
}
