package ch26_Exceptions;

public class C06_NumberFormatException_iclal {
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e
// cevirildiğinde oluşan RTE exception
// java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir
        String str="1516";
        System.out.println("str"+(str+53));

        int sayi =Integer.parseInt(str);
        System.out.println("(sayi+53) = " + (sayi + 53));

        String id="id12345";
        try {
            int sayi2 =Integer.parseInt(id);
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.out.println("Exception in thread \"main\" java.lang.NumberFormatException");
        }
        //Exception in thread "main" java.lang.NumberFormatException
        //RTE


        //exception olmayan kod

        try {
            int sayi3 =Integer.parseInt(str);//hatasız parse işlemi
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.out.println("Exception in thread \"main\" java.lang.NumberFormatException");
        }


    }
}
