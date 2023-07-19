package ch12_Arrays.task12;

import java.util.Arrays;

public class _19_2d_Array_3_aytekinbey {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        //elle indisler tek tek girilmiş
        //bu şekilde yapmadan diğer çözüme bak

        String[][] array2D = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};


        System.out.println("Arrays.deepToString(array2D) = " + Arrays.deepToString(array2D));


        array2D[0][2] = "Florida";
        array2D[1][1] = "Florida";
        array2D[1][3] = "Florida";
        array2D[2][0] = "Florida";


        System.out.println("Arrays.deepToString(array2D) = " + Arrays.deepToString(array2D));


    }
}

