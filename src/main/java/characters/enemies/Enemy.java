package characters.enemies;

import characters.GameCharacter;

public abstract class Enemy extends GameCharacter {


    public Enemy(String name, int hp, int strength, int defence, int agility) {
        super(name, hp, strength, defence, agility);
    }

}
