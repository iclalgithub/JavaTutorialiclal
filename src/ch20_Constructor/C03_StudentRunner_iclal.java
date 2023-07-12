package ch20_Constructor;

public class C03_StudentRunner_iclal {

    public static void main(String[] args) {
        C03_Student_iclal std = new C03_Student_iclal();
        //field lara obje üzerinden ulaşıyoruz

        std.name = "cinar";
        std.lastName = " kilic";
        std.classNo = 123;
        std.degree=90.5;
        std.success = true;
        std.schoolNo = 355;

        System.out.println("std = " + std);


        std.graduate();
        //you are graduated
        std.socialActivity();
        //you should join social activities
    }

}
