package Java_Challenge_Derslerim.Challange02_01062023;

public class Task01_Modulus {

    public static void main(String[] args) {//main scop
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
        // Hint: use / - bölme and % -bölümünden kalan
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int sayi = 12345;
        int birler = sayi % 10;// 5 // 10 ile bölümünden kalan birler basamağıdır

        int onlar=(sayi/10)%10;// 4 // önce 10 a böl bölüm 1234 olsun.sonra 10 ile bölümünden kalan birler basamağıdır yani 4
        int yüzler=(sayi/100)%10;//3  önce 100e böl bölüm 123 olsun.sonra 10 ile bölümünden kalan birler basamağıdır yani 3
        int binler=(sayi/1000)%10;//2  önce 1000e böl bölüm 12 olsun.sonra 10 ile bölümünden kalan birler basamağıdır yani 2
        int onbinler=(sayi/10000);//1önce 10000e böl bölüm 1 olsun.yani sonuç 1



        System.out.println("birler : " + birler+"\nonlar : "+onlar+"\nyüzler : "+yüzler+"\nbinler : " + binler+"\nonbinler : "+onbinler);


    }// main sonu
}// Class sonu
