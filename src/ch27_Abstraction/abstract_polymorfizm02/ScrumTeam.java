package ch27_Abstraction.abstract_polymorfizm02;

public abstract class ScrumTeam {
    public String name, jobTitle;
    public double salary;

    public abstract void dailyStandup();

    public abstract void demo();

    public void getEmployeeInfo() {
        System.out.println("****************");
        System.out.println("employee name: " + this.name +
                "\n Job title: " + this.jobTitle +
                "\n salary: " + this.salary);
        System.out.println("****************");
    }

}//class sonu

class Testers extends ScrumTeam {

    public Testers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    @Override
    public void dailyStandup() {
        System.out.println("Tester" + name + "is working");
    }

    @Override
    public void demo() {
        System.out.println("Tester" + name + "is demo");
    }
}//sonnn

class Developers extends ScrumTeam {

    public Developers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    @Override
    public void dailyStandup() {
        System.out.println("Developer" + name + "is working");
    }

    @Override
    public void demo() {
        System.out.println("Developer" + name + "is demo");
    }
}//sonnn

class BOA {
    public static void main(String[] args) {
        Testers tester1 = new Testers("Ahmet", "Tester", 5000);
        Testers tester2 = new Testers("Iclal", "Tester", 8000);
        Testers tester3 = new Testers("Sefa", "Tester", 6000);

        ScrumTeam [] testerarr= {tester1,tester2,tester3};
        //Testers [] testerarr= {tester1,tester2,tester3};
        //bu da doğru polymorfizm açısından
        for (ScrumTeam tester:testerarr) {
            tester.getEmployeeInfo();
        }

        Testers developer1 = new Testers("taha", "Developer", 8000);
        Testers developer2 = new Testers("zeynep", "Developer", 9000);
        Testers developer3 = new Testers("eren", "Developer", 10000);

        ScrumTeam [] developersArr= {developer1,developer2,developer3};

        for (ScrumTeam dev:developersArr) {
            dev.getEmployeeInfo();
        }



    }
}
