package ch12_Arrays.task12;

import java.util.Arrays;

public class Task11_ezgisuhanim{
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String str1[] = str.split(" ");
        int dollarSum = 0;
        int poundSum = 0;
        for (String deger : str1) {
            if (deger.startsWith("$")) {
                String miktar = deger.substring(1);
                dollarSum += Integer.parseInt(miktar);

            } else if (deger.startsWith("£")) {
                String miktar = deger.substring(1);
                poundSum += Integer.parseInt(miktar);
            }
        }
        System.out.println("dollarSum = " + dollarSum);
        System.out.println("poundSum = " + poundSum);

    }
}
