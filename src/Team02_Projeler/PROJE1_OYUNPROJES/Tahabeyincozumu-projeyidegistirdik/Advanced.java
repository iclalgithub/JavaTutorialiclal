public abstract class Advanced extends Basic{
    private boolean armour= false;

    public void damageByGun1() {
        if (armour){
            health -=20;
        }else health -=30;
        deadOrNot();
    }

    @Override
    public void damageByGun2() {
        if (armour){
            health -=40;
        }else health -=50;
        deadOrNot();
    }
    public void setArmour(boolean armour) {
        this.armour = armour;
    }

    public boolean getArmour() {
        return armour;
    }
}
