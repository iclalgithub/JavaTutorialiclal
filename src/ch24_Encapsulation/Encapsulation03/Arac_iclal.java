package ch24_Encapsulation.Encapsulation03;

public class Arac_iclal {
    /*
      TASK
  1- fieldları(encapsulated) model(String), renk(String), motor(int) -motor hacmi,
  yil (int)
 olan Arac  isimli bir class cretae ediniz.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- Runner isminde main için bir class oluşturunuz.
 4- İki adet parametreli const ile 1 adet parametresiz cons ile, toplam 3 adet
  araba create ediniz

 5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı
 veri girisine karsi kontrol ediniz.
   */
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Arac_iclal() {
    }

    public Arac_iclal(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        setMotor(motor);
        setYil(yil);
       // this.motor = motor;
        //this.yil = yil;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
         //this.motor = motor;
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000) {
            System.out.println("fındık kadar motor mu olur yakıtlar pahalı galiba");
            this.motor = 1001;
        } else this.motor = motor;
        //1000 üzerindeyse zaten kendisiin dediği olsun yoksa biz 1001 yaptık

        //Aşağısı kurtarmaz enaz 1001 deriz
        //Set Method içinde kontrol yaptık
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
        if(yil<0){
            System.out.println("eksi yıl girdin farkında mısın");
            this.yil=(-1)*yil;
        }else if(yil>2025){
            System.out.println("o yılda ki arabanın  burda ne işi var");
        }else this.yil=yil;
    }

    @Override
    public String toString() {
        return "Arac_iclal{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
