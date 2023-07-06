package Java_Challenge_Derslerim.Challange02_01062023;

import java.util.Scanner;

public class Task04_IfStatement_iclal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***char kullanarak çözüm***");
        System.out.println("Y veya N değerini giriniz");
        char ch1 = input.next().charAt(0);
        if (ch1 == 'y' || ch1 == 'Y') {
            System.out.println("YES");
        } else if (ch1 == 'n' || ch1 == 'N') {
            System.out.println("NO");
        } else {
            System.out.println("Yanlış değer girdiniz");
        }


        System.out.println("***String kullanarak çözüm***");
        System.out.println("Y veya N değerini giriniz");
        String kelime = input.next();

         if(kelime.equals("y") || kelime.equals("Y")){
             System.out.println("YES");
         }else if (kelime.equals("n") || kelime.equals("N")){
             System.out.println("NO");
         }else System.out.println("Yanlış değer girdiniz");
       // yukarıdaki kapalı kodlar tam çalışmadı ama anlamadım tam
        // Chat GPT ye sordum cevap verdi
       // Ancak, karşılaştırma operatörü olarak == yerine equals() yöntemini kullanmanız gerekiyor.
        // //Java'da, == operatörü referansları karşılaştırırken equals() yöntemi içeriğin karşılaştırılmasını sağlar.
        // Bu nedenle, String'lerin içeriğini karşılaştırmak için equals() yöntemini kullanmalısınız.



    //  if (giris.equalsIgnoreCase("y")) {
    //      System.out.println("YES");
    //  } else if (giris.equalsIgnoreCase("n")) {
    //      System.out.println("NO");
    //  } else {
    //      System.out.println("Yanlış değer girdiniz");
    //  }




    }
}
