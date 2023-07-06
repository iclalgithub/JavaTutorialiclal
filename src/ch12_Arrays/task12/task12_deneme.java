package ch12_Arrays.task12;
import java.util.Arrays;
public class task12_deneme {


        static int[] arr = {2, 6, 4, 5, 8, 9};
        static int[] kareDizisi = new int[arr.length]; // Kare değerlerini tutacak dizi

        public static void main(String[] args) {
        /*
        TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
            diziBelirle();
            karesiniAl();
        }

        private static void karesiniAl() {
            System.out.println("Dizinin kareleri alınıyor...");
            for (int i = 0; i < arr.length; i++) {
                int kare = arr[i] * arr[i];
                kareDizisi[i] = kare; // Kare değerini diziye ekleme
            }
            System.out.println("Kareler: " + Arrays.toString(kareDizisi));
        }

        private static void diziBelirle() {
            System.out.println("Karesi alınacak dizi...");
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        }
    }

