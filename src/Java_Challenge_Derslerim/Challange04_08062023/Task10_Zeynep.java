package Java_Challenge_Derslerim.Challange04_08062023;

public class Task10_Zeynep {
    public static void main(String[] args) {

        String s = "   Java ogrenmek123 Cok guzel@      ";

        s = s.replaceAll("\\d", "") //"   Java ogrenmek Cok guzel@      "
                .replace("@", "")  //"   Java ogrenmek Cok guzel      "
                .replace("C", "c") //"   Java ogrenmek cok guzel      "
                .trim();                          //"Java ogrenmek cok guzel"


        System.out.println(s);


    }
}
