package ch28_Interface_Polymorphizm.Polymorphism;

class Animal {
    public void talk() {
        System.out.println("animal is talking");
    }
}//class sonu

class Tiger extends Animal {
    public void hunt() {
        System.out.println("tiger is hunting");
    }

    public void talk() {
        System.out.println("tiger is talking ==> roar");
    }
}//class sonu

class Octopus extends Animal {
    public void swim() {
        System.out.println("octopus is swimming");
    }

    public void talk() {
        System.out.println("octopus is talking ==> gologglog");
    }
}//class sonu


public class Zoo {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger[] tigers = {tiger1, new Tiger()};

        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1, new Octopus()};

        Animal                  animal1 =        new       Tiger();
        //reference type      reference name                obje constructor

        animal1.talk();

        //talk static method olmadığı için tiger

        // animal1.hunt();
        //Cannot resolve method 'hunt' in 'Animal'
        //data type ın olduğu yere bakıyor

        //parent ta olmayan bir metodu parent data type olunca ulaşamazsıjız

        //ilk data type bak override edilmişse git child 'a yoksa static ise gitmez child a

        //ilk data type bak override edilmişse git child 'a yoksa static ise gitmez child a

        Animal                  animal2 =        new Octopus();

        //animal2.swim();
        //can not resolve
        animal2.talk();

    }
}//class sonu
