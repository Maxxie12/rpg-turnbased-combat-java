
public abstract class Combatant {
    private String name;

    private int maxHP;
    private int currentHP;

    private int maxMP;
    private int currentMP;

    private int attack;
    private int defense;
    private int speed;

    public Combatant(String name, int maxHP, int maxMP, int attack, int defense, int speed) {
        this.name = name;
    
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    
        this.maxMP = maxMP;
        this.currentMP = maxMP;
    
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }
 
    
}

