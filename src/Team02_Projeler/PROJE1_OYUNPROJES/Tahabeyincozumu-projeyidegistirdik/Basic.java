import java.util.Scanner;

public abstract class Basic {
    String name;
    int health = 100;
    static boolean dead = true;

    Scanner sc = new Scanner(System.in);
    public abstract void damageByGun1();
    //bodyleri child classda

    public abstract void damageByGun2();
    //bodyleri child classda


    public void deadOrNot() {
        if (health <= 0) {
            health = 0;
            System.out.println(name + " is dead.");
            dead =false;
            System.out.println("Game Over...");
        }
    }
    public void heal() {
        if (health <= 0) {
            System.out.println("Player is dead. Heal not possible");

        } else health = 100;
        System.out.println("health is" + health);
        //this.health yazılmasına gerek yok, tüm classın içinde başka health adında
        //girdi yok
    }

    public int getHealth() {

        return health;
    }
}
