package ch19_StringBuilder;

public class C02_StringBuilder_iclaleksik {
    public static void main(String[] args) {
        //eksik üstte eklenecek
        //hoca burdaki kodları sb1'e göre yaptı ben sb3'e göre yaptım

        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("Rumeysa hanim QA");
        System.out.println("sb3.capacity() = " + sb3.capacity());

        //girilen indeksteki karakteri getirmek için
        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));


        //istenilen indeks aralığındaki değer getirmek için subsequence
        System.out.println("sb3.subSequence(3,10) = " + sb3.subSequence(3, 10));
        System.out.println("sb3.substring(3, 10) = " + sb3.substring(3, 10));

        //girilen int indeks teki karakteri silen deleteCharat
        System.out.println("sb3.deleteCharAt(6) = " + sb3.deleteCharAt(6));

        // istenen indekse istenen ifadeyi ekler
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(7,\":)\") = " + sb3.insert(7, ":)"));

        //belirli bir stringbuilder in istenen indeksine verilen stringin istenen indeks aralığını ekleme
        // sb3.insert(0,"hi",3,5); bu kod sb1'de deneyelim dedi hoca
        System.out.println("sb3.insert(0,\"hello\",1,3) = " + sb3.insert(0, "hello", 1, 3));

        //belirli bir indeksteki karakteri değiştirme
        //set - update
        sb3.setCharAt(5,'M');
        System.out.println("sb3 = " + sb3);

        //istenen aralıktaki değeri siler ve yerine istenen string i ekler
        System.out.println("sb3.replace(7,9,\"meşgul\") = " + sb3.replace(7, 9, "meşgul"));
    }
}
