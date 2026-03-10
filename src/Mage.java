
import java.util.ArrayList;

public class Mage extends Combatant {

    private List<Magic> spells;

     public Mage(String name) {
        super(name, 80, 100, 8, 3, 10);
        spells = new ArrayList<>();
    }

    public int castSpell(Magic spell, Combatant target) {

        if (getCurrentMP() < spell.getManaCost()) {
            System.out.println("Not enough MP!");
            return 0;
        }

        setCurrentMP(getCurrentMP() - spell.getManaCost());

        return target.takeDamage(spell.getDamage());
    }
}
