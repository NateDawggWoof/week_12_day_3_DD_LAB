package game;

import characters.GameCharacter;
import characters.enemies.Enemy;
import characters.heros.Hero;
import quests.Quest;
import quests.Room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GameEngine {
    ArrayList<GameCharacter> combatants;

    public GameEngine() {
        this.combatants = new ArrayList<>();
    }

    public ArrayList<GameCharacter> getCombatants() {
        return combatants;
    }

    public void setCombatants(ArrayList<GameCharacter> combatants) {
        this.combatants = combatants;
    }



    public void addCombatants(ArrayList<Hero> heros, ArrayList<Enemy> enemies){
        combatants.addAll(heros);
        combatants.addAll(enemies);
        Collections.sort(combatants, new GameCharacter());
    }





    public String playQuest(ArrayList<Hero> heros, Quest quest){
        for(Room room : quest.getRooms()){
            addCombatants(heros, room.getEnemies());

        }
    }
}
