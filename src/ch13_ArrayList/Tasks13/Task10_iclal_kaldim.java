package ch13_ArrayList.Tasks13;


import java.util.ArrayList;
import java.util.Arrays;

public class Task10_iclal_kaldim {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        tekrarEdenElemaniAlma(arr);
        ArrayList<Integer> yeniarr = tekrarEdenElemaniAlma(arr);

        System.out.println("yeniarr = " + yeniarr);

    }

    private static ArrayList<Integer> tekrarEdenElemaniAlma(ArrayList<Integer> arr) {
        ArrayList<Integer> yeniarr = new ArrayList<>();
        boolean tekrarVarMi = false;
        for (int i = 0; i < arr.size()-1; i++) {
            tekrarVarMi = false;
            if (arr.get(i) == arr.get(i + 1)) {
                tekrarVarMi = true;
                break;
            }
            if (!tekrarVarMi) {
                if (!yeniarr.contains(arr.get(i))) {
                    yeniarr.add(arr.get(i));
                }
            }
        }
        return yeniarr;
    }

}
