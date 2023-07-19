package Java_Interview_Questions.Interview_05_19072023;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q33_CollectionsMethodsTask_iclal {
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
        ArrayList<Integer> sayiListe = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.printf(i + ". sayıyı giriniz");
            sayiListe.add(input.nextInt());
        }
        //listeyi tek sırada sırala ve yazdır
        System.out.println("sayiListe ilk hali= " + sayiListe);
        System.out.println();
        Collections.sort(sayiListe, Collections.reverseOrder());
        System.out.println("sayiListe sıraladıktan sonra ters sıra hali= " + sayiListe);

        Collections.reverse(sayiListe);
        System.out.println();
        System.out.println("sayiListe giriş sırasına göre ters sıra hali= " + sayiListe);

        //listeyi karıştır ve yazdır

        Collections.shuffle(sayiListe); //elemanları rastele olarak karıştır
        //çorba gibi karıştırır
        System.out.println();
        System.out.println("sayiListe karıştırıldı= " + sayiListe);

        //3 birim kaydır ve yazdır
        Collections.rotate(sayiListe, 3);
        System.out.println("sayiListe 3 brim kaydırılmış hali" +
                "= " + sayiListe);

        //max ve min sayısını bulup yazdırın
        System.out.println("Collections.max(sayiListe) = " + Collections.max(sayiListe));
        System.out.println("Collections.min(sayiListe) = " + Collections.min(sayiListe));
        //tüm max sayıları min ile değiştirip ekrana yazdırın
        Collections.replaceAll(sayiListe,Collections.max(sayiListe),Collections.min(sayiListe));
        System.out.println("sayiListe = " + sayiListe);
    }
}
