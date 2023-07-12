package Java_Interview_Questions.Interview_03_12072023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_UniqeArray_halukhocailecozum {
    /* task->
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array print eden code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        //System.out.println("arr = " + arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        List<Integer> list =new ArrayList<>();
        //arr deki benzersiz elemanların depolanacağı boş list
        //unique değerleri saklayan array
        //temp yani geçici bir şeyde çalıştık

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                //sepette yoksa
                list.add(arr[i]);
            }
        }
        System.out.println("yeni arr = " +list);

        int benzersizArr[]=new int [list.size()];

        for (int i = 0; i < list.size(); i++) {
        benzersizArr[i]=list.get(i);
        }

        System.out.println("benzersizArr" +benzersizArr.toString());
    }
}




