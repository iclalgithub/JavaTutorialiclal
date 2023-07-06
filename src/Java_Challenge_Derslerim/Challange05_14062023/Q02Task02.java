package Java_Challenge_Derslerim.Challange05_14062023;

public class Q02Task02 {
    //Interview Question
    // Task->0-255 e kadar olan sayıların karakter değerini print eden code create ediniz...

    public static void main(String[] args) {

        System.out.println("   ***   for   ***   ");
        for (int i = 0; i <= 255; i++) {
            char karakter = (char) i;// döngüden gelen herbir i tamsayıın ascii değeri karaktere atandı
            System.out.println(i + " 'nin karakter değeri ->" + karakter);
        }
        int a = 0;
        System.out.println("   ***   while   ***   ");

        while (a <= 255) {// a değeri 255'e eşit olana kadar döngü tanımlandı

            char c = (char) a;
            System.out.println(a + " 'nin karakter değeri ->" + c);

            a++;
        }
        System.out.println("   ***   do while   ***   ");

        do {
            char d = (char) a;
            System.out.println(a + " 'nin karakter değeri ->" + d);
            a++;
        }
        while (a <= 255);


    }//main sonu

}// class sonu

