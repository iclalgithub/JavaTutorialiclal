package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q31_DuplicateValue_halukhoca {
       /* Task->
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Girilen bir string için tekrarlanan karakterleri print eden code create ediniz.
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("agam bişeyler giresen : ");
        String metin = input.nextLine();// emine
        ArrayList<Character> output = new ArrayList<>();//tekrarlana elemanların depolanacagı bos list
        char[] arr = metin.toCharArray();// metin herbir karakter arr ya atandı
        System.out.println(Arrays.toString(arr));// [j, a, v, a, c, a, n, J, a, v, v, a, n, u, r]

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] ==arr[j]&& !output.contains(arr[j])) {
                   // System.out.print(arr[j]);
                    output.add(arr[j]);//tekrarlayan eleman liste eklendi
                }
            }
        }
        System.out.println(output);

    }
}

