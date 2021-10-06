package characters.enemies;

import characters.CharacterBasicStats;

public abstract class Enemy extends CharacterBasicStats {


    public Enemy(String name, int hp, int strength, int defence, int agility) {
        super(name, hp, strength, defence, agility);
    }

}
