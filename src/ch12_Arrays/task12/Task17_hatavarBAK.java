package ch12_Arrays.task12;

public class Task17_hatavarBAK {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};//24

        int enBuyuk = sayi[0][0];
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi.length; j++) {
                if (sayi[0][0] < sayi[i][j]) {
                    sayi[0][0] = sayi[i][j];
                }

            }
        }

        System.out.println(enBuyuk);

    }
}
