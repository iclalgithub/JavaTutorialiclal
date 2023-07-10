package Java_Project_Derslerim.project02_08072023;

import java.util.Arrays;
import java.util.List;

public class Task06_ElementUpdateList_iclal {
/* Task->
     If the list has 12 as element, change all 12s to 21
     Listteki 12 elemanını 21 olarak update eden code create ediniz
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 11, 12, 15, 12, 34, 43);
        System.out.println(list);

        //burda 12 elemanı yoksa direk bu listte for döngüsünü çaşlıştırma demek için 2. kodda yazdım
        for (int avuc : list) {
            if (avuc == 12) {//avucundaki çekirdek varsa
                list.set(list.indexOf(12), 21);//sıra yok avucumda var
                //list te 12'nin indeksindeki elemanı 21 yap diyoruz dimi hocam
            }
        }
    }

}
