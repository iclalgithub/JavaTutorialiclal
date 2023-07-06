package Java_Challenge_Derslerim.Challange02_01062023;

import java.util.Scanner;

public class Task05_IfStatement_iclal {
    /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    code create ediniz...
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iş unvanınızı giriniz");
        String jobTitle = input.next().toUpperCase();

        //????SOR????//
        //KOD ÇIKTI VERMİYOR?????????????
        // çünkü == yerine equals kullanmam gerekiyor
        //çözdüm bu sorunu

        if (jobTitle.equalsIgnoreCase("qa")) {
            System.out.println("is unvaniniz Quality Analyst.");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("is unvaniniz Developer.");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("is unvaniniz Business Analyst.");
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("is unvaniniz Project Manager.");
        }else System.out.println("Geçerli bir unvan giriniz!");
        // yukarıdaki kapalı kodlar tam çalışmadı ama anlamadım tam
        // Chat GPT ye sordum cevap verdi
        // Ancak, karşılaştırma operatörü olarak == yerine equals() yöntemini kullanmanız gerekiyor.
        // //Java'da, == operatörü referansları karşılaştırırken equals() yöntemi içeriğin karşılaştırılmasını sağlar.
        // Bu nedenle, String'lerin içeriğini karşılaştırmak için equals() yöntemini kullanmalısınız.
        // ignorecase kullanalım


    }

}