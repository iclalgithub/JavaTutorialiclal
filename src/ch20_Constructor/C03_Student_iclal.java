package ch20_Constructor;

public class C03_Student_iclal {
    //POJO class , plain old java object (reel de adi entity class)
    //main meth olmayan obje create etmek icin tasarlanmis class
    //obj ler icin depo kaliphane , sablon , fabrika


    /*Chat GPt
    POJO, Plain Old Java Object'ın kısaltmasıdır.
     POJO, bir Java sınıfının basit, temel bir sınıf olduğunu ifade eder.
      Bu terim genellikle Java EE (Enterprise Edition) veya Java ile nesne yönelimli programlama alanlarında kullanılır.
     */
     //fileds  -> inst variables
    String name;
    String lastName;
    int classNo;
    double degree;
    int schoolNo;
    boolean success;

    public void graduate(){//mezun olup olmadigini olcen met
        if (degree >= 60){
            System.out.println("you are graduated");
        }else {
            System.out.println("we are waiting you next year");
        }
    }

    public void socialActivity(){
        System.out.println("you should join social activities");
    }

    //iki metodumuz var graduate ve  socialActivity

    @Override
    public String toString() {
        return "C03_Student_iclal{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNo=" + classNo +
                ", degree=" + degree +
                ", schoolNo=" + schoolNo +
                ", success=" + success +
                '}';
    }
}
