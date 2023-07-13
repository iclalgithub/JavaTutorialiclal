package Java_Interview_Questions.Interview_01_13072023;

import java.util.Arrays;

public class Q25_ConvertToNegativeFormString_iclaleksik {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr = {"J", "a", "v", "a", "I", "s", "D", "i", "f", "f", "i", "c", "u", "l", "t"};
        String str="";
        System.out.println("***for i***");
        for (int i = 0; i <arr.length ; i++) {
            str+=arr[i];
        }
        System.out.println(str);
        System.out.println("str.replace(\"Is\",\"Isnot\") = " + str.replace("Is", "Isnot"));

        System.out.println("***for each ile***");
        Arrays.sort(arr);
        for (String avuc:arr) {
            str+=avuc;
        }
        System.out.println(str);
    }

}
