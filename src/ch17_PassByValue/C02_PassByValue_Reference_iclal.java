package ch17_PassByValue;

public class C02_PassByValue_Reference_iclal {
    public static void main(String[] args) {
        // task -> verilen fiyat için %11, %22 ve %33 indirimli fiyatı print eden method
        // create ediniz.
        double fiyat = 100;


        System.out.println("method call öncesi fiyat"+fiyat);
        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));
        System.out.println("method call sonrası fiyat"+fiyat);

        //method call öncesi fiyat100.0
        //indir11(fiyat) = 89.0
        //indir22(fiyat) = 78.0
        //indir33(fiyat) = 67.0
        //method call sonrası fiyat100.0

    }

    private static double indir33(double fiyat) {
        return fiyat*=0.67;
    }

    private static double indir22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indir11(double fiyat) {
        return fiyat*=0.89;
    }
}
