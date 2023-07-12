package ch16_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_OCA01_iclal {

    public static void main(String[] args) {
        //5. ayın 4ü girilmiş
        //
        String date = LocalDate.parse("2014-05-04").
                format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);


        // cevap D)  An exception is throw at runtime
        //string degil Local time olmasi lazim

        //what is the result ?

        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime  ***
         */


    }

}
