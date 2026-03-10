
public abstract class Combatant {
    private String name;

    private int maxHP;
    private int currentHP;

    private int maxMP;
    private int currentMP;

    private int attack;
    private int defense;
    private int speed;

    private boolean defending;

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
 
    public boolean isAlive() {
        return currentHP > 0;
    }

    public int takeDamage(int damage) {
        int realDamage = (damage - this.defense);

         if (defending) {
        realDamage /= 2;
        defending = false;
        }   

        if (realDamage <0) { 
           realDamage = 0;
        }
       
        this.currentHP -= realDamage;
        if (this.currentHP < 0) {
            this.currentHP = 0;
        }
    
        return realDamage;
    }

    
    public int attack(Combatant target) {
        return target.takeDamage(this.attack);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP(){
        return currentHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }




}

