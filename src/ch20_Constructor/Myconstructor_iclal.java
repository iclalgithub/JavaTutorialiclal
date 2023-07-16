package ch20_Constructor;

public class Myconstructor_iclal {
    int x = 3;
    int y = 5;

    public Myconstructor_iclal() {
        x += 1;
        System.out.println("x = " + x);
    }

    public Myconstructor_iclal(int i) {
        this();//pm siz const
        this.y = i;
        x += y;
        System.out.println("x = " + x);
    }

    public Myconstructor_iclal(int x, int y) {
        this(12);
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Myconstructor_iclal mc1 = new Myconstructor_iclal();
    }
}
