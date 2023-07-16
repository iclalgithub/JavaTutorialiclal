package ch12_Arrays.task12;

import java.util.Arrays;

public class _19_2d_Array_3_ezgisuhanim {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String [][] arr =  {{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","new york","ohio"} , {"ohio","new york"}};

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));

        String str = Arrays.deepToString(arr);

        str = str.replaceAll("ohio", "Florida");
        str = str.replaceAll("\\[", "");
        str = str.replaceAll("\\]", "");

        String [] arr2= str.split(",");

        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j].equals("ohio")){
                    arr[i][j]= ("florida");


                }

            }

        }
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));


    }
}

