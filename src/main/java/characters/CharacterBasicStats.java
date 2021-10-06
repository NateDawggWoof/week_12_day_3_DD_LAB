package characters;

public abstract class CharacterBasicStats {


    private String name;

    public CharacterBasicStats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
