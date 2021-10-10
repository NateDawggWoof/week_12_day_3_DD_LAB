package characters.enemies;

import characters.actions.IDefend;

public class Orc extends Enemy implements IDefend {

    public Orc(String name, int hp, int strength, int defence, int agility) {
        super(name, hp, strength, defence, agility);
    }

    public void defend(int damage){
        int remainingHp = this.getHp()+ this.getDefence() - damage;
        this.setHp(remainingHp);
    }

}
