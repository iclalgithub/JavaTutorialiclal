public class Ana_Menu extends Advanced {
    int bA;//Basic or Advance secildikten sonra atandigi field
    private Ana_Menu enemy;//Objelerimiz Ana_Menu turunden oldugundan ve obj1 in dusmani obj2 oldugundan enemyi Ana_Menu turunden urettik.

    public Ana_Menu() {//isim ve zirhli olup olmiyacaginin secimlerini yapacagi meth call olan p'siz cons
        isimlendirme();
        rutbe();
    }

    public void setEnemy(Ana_Menu enemy) {//Runnerda p1 in dusmani p2
        this.enemy = enemy;               //p 2 nin dusmani p1 olarak parametre veriliyor ve burda enemy obj ina ataniyor
    }

    public void oyunBaslar() {
        if (bA == 1) {//if (basic)
            System.out.println(name + " hamlenizi seçin: \n\n1. silah için => 1  \n2. silah için => 2 " +
                                      "\nCan yükseltmek için => 3");
            int secim = sc.nextInt();
            attack(enemy, secim);

        } else if (bA == 2) {//if (advance)
            System.out.println(name + " hamlenizi seçin: \n\n1. silah için => 1  \n2. silah için => 2 " +
                                      "\nCan yükseltmek için => 3 \nZirhi kusanmak icin =>4");
            int secim = sc.nextInt();
            attack(enemy, secim);
        }
    }

    // Oyuncunun düşmana hasar verme fonksiyonu
    public void attack(Ana_Menu enemy, int secim) {//basic ve advance icin ayni atack methodunu kullaniyoruz
        switch (secim) {                                 //tek fark zirhi bA == 2 durumunda alabiliyor olmasi
            case 1:                                      //Menu ara yuzleride farkli oldugundan basic oynayan oyuncu
                enemy.damageByGun1();              //armor diye bir secenegi oldugunu bilmiycek kazayla 4 e bassa bilene
                if (dead) {                              //if(bA==2) blogundan dolayi kullanamiycak
                    System.out.println(enemy.name + " " + enemy.getHealth() + " canin kaldi");
                }
                break;

            case 2:
                enemy.damageByGun2();
                if (dead) {
                    System.out.println(enemy.name + " " + enemy.getHealth() + " canin kaldi");
                }
                break;

            case 3:
                heal();
                System.out.println(name + " " + getHealth() + " canin var");
                break;

            case 4:
                if (bA == 2)
                    setArmour(true);
                System.out.println("Armour activated ");
                break;
        }
    }

    public void rutbe() {
        System.out.println("Basic için => 1  \nAdvanced için => 2 ");
        bA = sc.nextInt();
    }

    public void isimlendirme() {
        System.out.println("Oyuncu adinizi giriniz");
        name = sc.nextLine();
    }
}
