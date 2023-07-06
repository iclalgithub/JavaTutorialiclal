package Java_Challenge_Derslerim.Challange05_14062023;

public class Q09_ForLoop_iclal {

    //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

    public static void main(String[] args) {

        int count=0;
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                count++;
                System.out.println( count +".i = " + i);

            }

        }


    }

}
