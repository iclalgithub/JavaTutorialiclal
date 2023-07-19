package ch12_Arrays.task12;

public class _12_Array_no14_SOR {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here

        //boolean kullanmadan direk yapabilirim diye düşündüm??
        //ezgisuhanımın çözümünde boolean kullanılmış
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {2, 3, 4};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == (1)&& arr1[i + 1] == (4)) {
                System.out.println("false-1 \" ve\" 4 elemanlarına aynı anda sahip ");
            } else {
                System.out.println("true-1 \" ve\" 4 elemanlarına aynı anda sahip değil");
            }
        }


    }
}