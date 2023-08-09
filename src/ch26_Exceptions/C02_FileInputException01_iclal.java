package ch26_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputException01_iclal {
    /*

             Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi durumlara karşılk gelen hatalara
             Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.

            Bir kod yazilirken olasi exception'lar ongorulup
            exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.

                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                 2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */

    public static void main(String[] args) throws IOException {
        //

        String filePath = "/Users/igor/Desktop/JAVA/codes-zafer/JavaTutorialiclal/src/javadanEsintiler";
        // "C:\\Users\\pc\\IdeaProjects\\JavaTutorialTR\\src\\javadanEsintiler";
        //yol tanımlanacak
        //javadan esintiler dosyasına gel-sağ click
        //Copy  path reference
        //absolute path


        FileInputStream fis = new FileInputStream(filePath);

        //dosyayı input olarak verdik
        //output olarak da dosyayı alıyoruz

         /*
        Eğer bir method'da Checked (CTE riski olan excp.) exception varsa method
        signature(mnethod name'den sonraki bölüm) hata uyarısı altı kırmızı çizgi verir
        komutun derlenmesine izin vermez ve kod üzerine gelidiğimde Add...  exception handle etme
        tavsiye eder otamatih throws excp eklenir.
        Bu şekilde methodu call eden komutlat try-catch alınması garanti edilmiş olur.
         */

        int c;
        while ((c = fis.read()) != -1) {//bu kod input olarak verilen dosyadan son karaktere gelene kadar calis demek
            System.out.print((char) c);
        }
        //Char deyince o ascıı değeri olan karakteri basıyoruz
        System.out.println();
        System.out.println("fis = " + fis); //ref

        //BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\örnekler\\src\\ExceptionHandling\\javadanEsintiler"));
        //bw.write("try catch throw");
        //bw.close(); //finalize yerine close var



    }


}
