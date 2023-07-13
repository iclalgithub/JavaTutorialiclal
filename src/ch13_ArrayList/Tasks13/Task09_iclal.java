package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09_iclal {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2,3,4,5));
        System.out.println("karesiniAl(arr) = " + karesiniAl(arr));


    }//main sonu

    private static int karesiniAl(ArrayList<Integer> arr) {
        //SOR burda arr olmasa da çalışır????
        //bu çok önemli denildi neden???

        int toplam = 0;
        for (int i = 0; i <= arr.size()-1; i++) {
            toplam+=arr.get(i)*arr.get(i);
        }

        return toplam;
    }

}//class sonu

