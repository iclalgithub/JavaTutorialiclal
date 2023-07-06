package ch12_Arrays;

import java.util.Arrays;

public class C07_MDArrays_iclal {
    public static void main(String[] args) {
        //task aprMD tüm elemanlarını toplayan code create ediniz

        int[][] aprMD = {{1, 2, 3}, {10, 23}, {103}};
        String st = Arrays.toString(aprMD);

        int toplam = 0;

        for (int i = 0; i < aprMD.length; i++) { //i-kat
            for (int j = 0; j < aprMD[i].length; j++) { //j-daire
                toplam += aprMD[i][j];


            }

        }
        System.out.println("toplam = " + toplam);

    }
}
