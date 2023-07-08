package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task02_iclal_TEKRARBAKfarklıyollarvarcozumcalisilabilir {
    public static void main(String[] args) {
         /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
       int [] arr =  { 1,2,-3,4,-5,-6 } ;
        output :-1,-2,3,-4,5,6

         */

        int[] arr = {1, 2, -3, 4, -5, -6};

        sayinunTersIsaretu(arr);
        System.out.println("****");
        isaretDegis(arr);

        System.out.println("Çözüm 2. yol");
        //zeynep hanım
        int[] arr2 = {1, 2, -3, 4, -5, -6};

        isaretDegisim(arr2);

    }

    private static void isaretDegisim(int[] arr2) {

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = -arr2[i];

        }

        //Zeynep hanım
        System.out.println(Arrays.toString(arr2));

        int[] arr = {1, 2, -3, 4, -5, -6};

        isaretDegisim2(arr);

        System.out.println("Array elemanlarinin işaretlerinin değişmiş hali: " + Arrays.toString(arr));


        //Aytekin bey
        //BU ÇÖZÜME BAKILACAK!!!!
        int length = 0, numbers = 0;
        convertingSign(length, numbers);


    }//main sonu

    private static void convertingSign(int length, int numbers) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"Arrayinizin eleman sayısnı belirtin\" ");
        length = input.nextInt();
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        System.out.println(length + " adet elemanlarınızı tek tek girin");
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + " . elemanı girin");
            numbers = input.nextInt();
            array1[i] = numbers;
            array2[i] = -1 * numbers;
        }
        System.out.println("Belirlediğiniz dizin değerleri" + Arrays.toString(array1));

        System.out.println("Girdiğiniz değerlerin işareti değiştikten sonraki hali ");

        System.out.println("Belirlediğiniz dizin değerleri" + Arrays.toString(array2));


    }

    public static void isaretDegisim2(int[] arr) {
        for (int num : arr) {
            num = -num;
        }
    }

    private static void isaretDegis(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int each : array) {
            each *= -1;
            list.add(each);
        }
        System.out.println("list = " + list);

    }

    private static void sayinunTersIsaretu(int[] array) {
        for (int w : array) {
            w *= -1;
            System.out.print(w + " ");
        }
    }


}
