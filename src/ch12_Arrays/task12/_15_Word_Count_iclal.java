package ch12_Arrays.task12;

public class _15_Word_Count_iclal {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String str = "Removes white space from both ends of a string" ;
        String [] yeniArr =  str.trim().split("");// string array e cevrildi
        System.out.println("yeniArr.length = (harf sayısı): " + yeniArr.length);
        System.out.println();
        String [] yeniArr2 =  str.trim().split(" ");// string array e cevrildi
        System.out.println("yeniArr.length = (kelime sayısı): " + yeniArr2.length);
    }
}