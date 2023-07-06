package Java_Challenge_Derslerim.Challenge08_22062023;

public class Task07_iclal {
    public static void main(String[] args) {
        /* task->
         * verilen  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini için
         *  2D arrayinden min number print den code create ediniz.
         */

        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, -1}};


        int minSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]<minSayi){
                    minSayi=arr[i][j];
                }
            }
        }

        System.out.println("İki boyutlu dizideki en küçük değer:"+ minSayi);
    }


}
