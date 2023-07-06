package Java_Challenge_Derslerim.Challange01_31052023;

public class Task03_PrimitiveDataType {//class blok

    public static void main(String[] args) { //main blok

/*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */


//byte, short, integer,long, double, float data type'larının max ve min degerlerini print eden code create ediniz.

        byte byteMinValue = Byte.MIN_VALUE;//byte type assaignment(atama) aypılan variable create edildi.
        System.out.println("byteMinValue = " + byteMinValue);

        byte byteMaxValue = Byte.MAX_VALUE;// -128
        System.out.println("byteMaxValue = " + byteMaxValue); // 127

        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE); //-32768
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE); //32767

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);//-2147483648
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);//2147483647

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);//-9223372036854775808
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);//9223372036854775807

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);// 4.9E-324
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE); // 1.7976931348623157E308


        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);// 1.4E-45
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE); // 3.4028235E38

        //Her data type bir tane olmak uzere 4 variable create ediniz. (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, print ediniz..

        // kendi çözümlerim - iclal
        System.out.println("\n ****Kendi Çözümüm**** \n");
        byte bb = 123;
        float ff = 123.f;
        double dd = 122222;
        char ch = 'z';
        boolean isTrue = true;



        System.out.println("byte değerimiz = " + bb);
        System.out.println("float değerimiz = " + ff);
        System.out.println("double değerimiz = " + dd);
        System.out.println("char değerimiz = " + ch);
        System.out.println("boolean değerimiz = " + isTrue);


        System.out.println("\n ****Haluk hoca Çözümü**** \n");
        float zaynepHanımId = 1453.571F;
        double fitnatSenabulamadım = 1905.1907;
        char şampiyon = 'G';
        boolean cimbomIsChampion = true;
        System.out.println("zaynepHanımId = " + zaynepHanımId);
        System.out.println("fitnatSenabulamadım = " + fitnatSenabulamadım);
        System.out.println("sampiyon = " + şampiyon);
        System.out.println("cimbomIsChampion = " + cimbomIsChampion);


    }//main sonu
}//Class sonu
