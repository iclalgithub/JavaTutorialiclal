package ch12_Arrays.task12;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String[] arr={"Apple", "Orange" , "Banana", "Kiwi"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
