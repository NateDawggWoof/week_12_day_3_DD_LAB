package items;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, ClassTypes classType, int damage) {
        super(name, classType);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
