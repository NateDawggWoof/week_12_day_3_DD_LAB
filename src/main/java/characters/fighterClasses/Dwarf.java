package characters.fighterClasses;

import behaviours.IAttack;
import characters.GameCharacter;
import characters.Hero;

public class Dwarf extends Hero implements IAttack {

    public Dwarf(String name, int hp, int strength, int defence, int agility) {
        super(name, hp, strength, defence,agility);
    }

    public void attack(GameCharacter character){


    }
}
