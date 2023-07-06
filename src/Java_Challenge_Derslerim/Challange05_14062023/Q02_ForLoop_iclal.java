package Java_Challenge_Derslerim.Challange05_14062023;

public class Q02_ForLoop_iclal {
        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {


        for (int i = 0; i< 256; i++) {
            System.out.println("i = " + i);
            char ch = (char)i; //büyük küçüğe sığmaz her bir i tamsayısı karaktere atandı....
            System.out.println("ch = " + ch);

        }


    }

}
