package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q33_ListCollectionsMethodsTask_halukhoca {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 br saga kaydir ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sayıList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("agam " + (i + 1) + ". sayıyı  giresen : ");
            sayıList.add(input.nextInt());
        }
        System.out.println("sayıList ilk giris sıra hali  = " + sayıList);
        // listeyi ters sırada sırala ve yazdır

        Collections.reverse(sayıList);

        System.out.println("sayıList ters giris sıra hali  = " + sayıList);

        // listeyi karıştır ve yazdır

        Collections.shuffle(sayıList);//list elemanları randon sıralandı

        System.out.println("sayıList karısık hali  = " + sayıList);

        // 3 br saga kaydir ve yazdır
        Collections.rotate(sayıList, 3);
        System.out.println("sayıList 3 birim kaymış hali  = " + sayıList);

        //  maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        int maxEleman = Collections.max(sayıList);
        int minEleman = Collections.min(sayıList);
        // System.out.println("list max eleman : "+Collections.max(sayıList));
        System.out.println("list max eleman : " + maxEleman);
        //   System.out.println("list min eleman : "+Collections.min(sayıList));
        System.out.println("list min eleman : " + minEleman);
        // tüm maksimum sayıları minimum sayı ile değiştir
        //  Collections.replaceAll(sayıList,Collections.max(sayıList),Collections.min(sayıList));
        Collections.replaceAll(sayıList, maxEleman, minEleman);

        System.out.println("max meim değiştikten sonra list : " + sayıList);
    }
}
