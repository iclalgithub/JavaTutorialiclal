package InterviewQuestions;

import java.util.Scanner;

public class Q39_UseContinue_halukhoca {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi hariç teker teker  alt alta print eden code create ediniz.
         */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("agam bişeyler giresen : ");
        String metin = input.nextLine();// emine

        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == ' ' || metin.charAt(i) == 'a') {//metin karakterlerinin ' '  veya a olma şartı
                continue;//if true ise bu döngü atlanacak diğer döngüden devam edecek
            } else System.out.println(metin.charAt(i));
        }
    }

}
