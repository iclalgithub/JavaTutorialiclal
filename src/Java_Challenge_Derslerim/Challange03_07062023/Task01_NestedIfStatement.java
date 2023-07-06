package Java_Challenge_Derslerim.Challange03_07062023;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas= input.nextInt();

        if(yas>=18){
            System.out.println("oy kullanmaya uygun");
            if (yas>=70){
                System.out.println("üç kez oy kullanılabilir");
            } else if (yas >= 50  &&  yas<70 ) {
                System.out.println("iki kez oy kullanılabilir");
            }else {
                System.out.println("bir kez oy kullanılabilir");
            }


        }else if (yas<18){
            System.out.println("oy kullanmaya uygun değil");
        }




    }

}