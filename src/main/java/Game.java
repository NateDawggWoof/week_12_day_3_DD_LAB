import characters.Hero;
import quests.Quest;

import java.util.ArrayList;

public class Game {
    private ArrayList<Hero> heroes;
    private Quest quest;

    public Game(Quest quest) {
        this.heroes = new ArrayList<>();
        this.quest = quest;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public int countHeroes() {
       return this.heroes.size();
    }
}
