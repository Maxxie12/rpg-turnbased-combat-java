public class Warrior extends Combatant {

    private boolean defending;

    public Warrior(String name) {
        super(name, 120, 20, 15, 10, 8);
    }

    public boolean isDefending() {
        return defending;
    }

    public void defend(){
        defending= true;
    }
    

    

}
