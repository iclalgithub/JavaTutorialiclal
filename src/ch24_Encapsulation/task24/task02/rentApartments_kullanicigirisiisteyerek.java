package ch24_Encapsulation.task24.task02;

public class rentApartments_kullanicigirisiisteyerek {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public rentApartments_kullanicigirisiisteyerek() {
    }

    public rentApartments_kullanicigirisiisteyerek(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return "rentApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +
                '}';
    }

    //Chat GPT
    //Sonuç olarak, toString() metodunu override ederek
    // nesneleri kendi tarzınıza göre daha okunabilir hale
    // getirebilir ve özel durumlarda bilgi sağlayabilirsiniz.
    // Bu, nesnelerinizi daha iyi anlamak ve hata ayıklama sürecini
    // kolaylaştırmak için yaygın bir yaklaşımdır.

    // Kira hesaplama metodu
    public int RentHesapla() {
        int rent = 0;
        switch (roomCount) {//enhanced switch
            case 0 -> rent = 1400;
            case 1 -> rent = 1700;
            case 2 -> rent = 2200;
            case 3 -> rent = 2700;
            default -> System.out.println("Geçersiz bir seçim yaptınız!");
        }
        return rent;
    }
    public void BalconEklendiginde() {
        if (balconyOrNo) {
            int rent = RentHesapla();
            rent += 200;
            System.out.println("Balkon eklendikten sonra güncel kira bedeli: " + rent);
        } else {
            System.out.println("Balkon eklenmedi");
        }
    }
}
