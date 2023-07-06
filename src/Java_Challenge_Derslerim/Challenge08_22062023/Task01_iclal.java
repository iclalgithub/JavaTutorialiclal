package Java_Challenge_Derslerim.Challenge08_22062023;

public class Task01_iclal {
    public static void main(String[] args) {
		/* task->
        verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[] = {2,6,4,5,8,9};

        for (int i = 0; i <arr.length ; i++) {
            int kare=arr[i]*arr[i];
            System.out.println(i+". indisli elamanın karesi = " + kare);
        }


    }
}
