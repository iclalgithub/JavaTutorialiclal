package Java_Interview_Questions.Interview_05_19072023;

import java.util.Scanner;

public class Q27_AtbashCode_halukhoca {
    /*  Task->
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

      Girilen bir str'nin AtbashCode print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("agam bişeyler giresen : ");
        String metin = input.nextLine();// emine

        String alfabe = "abcdefghijklmnopqrstuvwxyz";
        String atbashAlfabe = "zyxwvutsrqponmlkjihgfedcba";

        for (int i = 0; i <metin.length() ; i++) {//metin karakterleri tekrara alındı
            for (int j = 0; j < 26; j++) {// str1 ve str2 için index ->j
                if (metin.charAt(i)==alfabe.charAt(j)) {
                    System.out.print(atbashAlfabe.charAt(j));
                }
            }
        }

    }


}