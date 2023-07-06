package Java_Challenge_Derslerim.Challange04_08062023;

public class Task10_SOR_chatGPTcozumu {
    public static void main(String[] args) {
        //output:123
        String input = "   Java ogrenmek123 Cok guzel@      ";
        String output = input.replaceAll("\\D", "").trim();
        System.out.println(output);
        //output:Java ogrenmek Cok guzel@
        String input2 = "   Java ogrenmek123 Cok guzel@      ";
        String output2 = input.replaceAll("\\d", "").trim();
        System.out.println(output2);
        //output:Java ogrenmek123 Cok guzel@
        String input3 = "   Java ogrenmek123 Cok guzel@      ";
        String output3 = input.trim();
        System.out.println(output3);
        //output:Javaogrenmek123Cokguzel@
        String input4 = "   Java ogrenmek123 Cok guzel@      ";
        String output4 = input.replaceAll("\\s+", "");
        System.out.println(output4);
        //output:Java ogrenmek123 Cok guzel@
        String input5 = "   Java ogrenmek123 Cok guzel@      ";
        String output5 = input.trim();
        System.out.println(output5);
    }





}
