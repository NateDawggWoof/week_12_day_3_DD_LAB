package characters.heros.fighterClasses;

import characters.actions.IAttack;
import characters.GameCharacter;
import characters.actions.IBattleCry;
import characters.actions.IDefend;
import characters.heros.Hero;
import items.Item;
import items.Weapon;

public class Dwarf extends Hero implements IAttack, IBattleCry {

    public Dwarf(String name, int hp, int strength, int defence, int agility) {
        super(name, hp, strength, defence,agility);
    }

    public String battleCry(){
        return  "Khayamu!!!";
    }

    public void attack(IDefend character) {
        int attackDamage;
        if (getSlot1() != null && getSlot1() instanceof Weapon)
        {
            attackDamage = this.getStrength() + this.getWeapon().getDamage();
        }
        else
        {
            attackDamage = this.getStrength();
        }
        character.defend(attackDamage);
    }

    public void equip(int slotNum, Item item){
        if(slotNum == 1){
            setSlot1(item);
        }
        else
        {
            setSlot2(item);
        }
    }



}
