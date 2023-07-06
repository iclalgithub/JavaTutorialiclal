package Java_Challenge_Derslerim.Challenge08_22062023;


import java.util.Arrays;

public class Task03_iclal_SOR {

    public static void main(String[] args) {
        /* task->
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        //C03 Arrays ders notundaki gibi mi olacak???SOR???

        String [] hey={"HeySiri"};
        System.out.println("hey = " + hey);
        System.out.println("Arrays.toString(hey) = " + Arrays.toString(hey));

        //split anlamadım????SOR????
        //SOR????????
        // String [] hey2 = hey.split("");
        // SOR bu niye hata veriyor?????
        //split kullanmama izin vermiyor????

        //replace ile mi yapılır???OR???

        //Chat GPT cevabı
        String originalString = "HeySiri";
        String replacedString = originalString.replace("Hey", "Bye");
        System.out.println(replacedString); // Çıktı: "ByeSiri"



    }
}
