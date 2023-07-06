package ch12_Arrays.task12;

import java.util.Arrays;

public class Task03_iclal {
    static int[] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
        // arraydeki her bir elemani index degeri kadar artiralim
        konumDegistirme();

    }


    private static void konumDegistirme() {
        //öncelikle array'in son elemanını ayrıca yazdır
        //geri kalanını arr[i]=arr[i-1] şeklinde bir sağa kaydır
        System.out.println("kaydırılmadan önceki arr dizisi= " + Arrays.toString(arr));
        int soneleman = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1]; //sağa kaydırma
        }
        arr[0] = soneleman;
        System.out.println("kaydırılmış arr dizisi = " + Arrays.toString(arr));
    }

}
