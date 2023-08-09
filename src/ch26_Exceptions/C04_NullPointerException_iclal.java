package ch26_Exceptions;

public class C04_NullPointerException_iclal {
    //NullPointerException --->
    public static void main(String[] args) {
        String str="";

        String str1=null;

        //null bir onjenin length'i almaya çalışınca hata aldık
        //Exception in thread "main" java.lang.NullPointerException
        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesajı okuduysan null'ın length i ni aldın demekt,r");
        } catch (NullPointerException e) {
            //sadece NullPointer class'ına gidecek
            //bu daha hızlı bir adım ama aşağıdaki
            //Exception seçilirse daha garanti
            //hatanın spesifik olarak yazdırılması
            System.out.println("null'ın lentgh i olmaz ki");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }//tüm hataları kapsar

        try {
            System.out.println("str.length() = " + str.length());
            System.out.println("bu mesajı okuduysan hiçliğin \"\" lentgh ini aldın demektir");
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
