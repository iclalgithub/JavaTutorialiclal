package ch13_ArrayList.Tasks13;


import java.util.ArrayList;
import java.util.Scanner;

public class Task02_OgrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane not girişi yapmak istersiniz");
        int adet = input.nextInt();


        ArrayList<Double> notlar = new ArrayList<>();
        double toplam = 0;
        int count = 1;
        while (count <= adet) {
            System.out.println(count + ". notu giriniz");
            double not = input.nextDouble();
            notlar.add(not);
            toplam += not;
            //array oluştu
            count++;
        }
        double ort= ortalamaHesapla(toplam, count);
        ortalamayiGecenler(notlar,ort);
        System.out.println("ort = " + ort);
        System.out.println("ortalamayiGecenler(notlar,ort) = " + ortalamayiGecenler(notlar, ort));

    }//main sonu

    private static int ortalamayiGecenler(ArrayList<Double> notlar,double ort) {
        int gecenler=0;
        for (double each:notlar) {
            if(each>ort){
                gecenler++;
            }
        }

        return gecenler; //count
    }

    private static double ortalamaHesapla(double toplam, int count) { //double x,int y
        double ortalama=toplam/count;
        return ortalama;
        //return topam/count; daha kısa
    }
}
