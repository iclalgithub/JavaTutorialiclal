package Java_Interview_Questions.Interview_01_05072023;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";

        int girisHakki = 3;

        while (true) {
            System.out.print("Agam pinini giresen : ");
            String agaPini=input.nextLine();
            if (agaPini.equals(pin)) {
                System.out.println("bingooo agam pinin ok :)");
               break;
            }else {
                System.out.println("agam mortingenŞitrause ...");
                girisHakki--;
                System.out.println("Agam kalan giris hakkın : "+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Agam tum haklarını yedin. sim card block :(");
                break;
            }
        }

    }

}
