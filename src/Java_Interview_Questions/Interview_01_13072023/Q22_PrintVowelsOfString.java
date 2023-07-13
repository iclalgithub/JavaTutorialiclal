package InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam bi seyler giresen  : ");
        String str = input.nextLine();//zeynep hanım
        System.out.println("   ***   amele code   ***   ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i') {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.println();
        System.out.println("   ***   cincix code   ***   ");

        System.out.println(str.replaceAll("[^aeiuo]", ""));
        System.out.println(str.replaceAll("[aeiuo]", ""));
        // [] -> içersindeki tum characterleri işleme alır
        // ^-> yanındakiler hariç anlamındadir:değili
    }

}
