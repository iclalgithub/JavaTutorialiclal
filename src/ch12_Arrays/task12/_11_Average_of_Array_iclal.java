package ch12_Arrays.task12;

public class _11_Average_of_Array_iclal {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        int ortalama=0;
        int toplam=0;
        int [] arr={12, 14 , 21 ,23 , 10 ,4};
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println("dizi toplamı = " + toplam);
        System.out.println("(ortalama=toplam/ arr.length) = " + (ortalama = toplam / arr.length));


    }
}