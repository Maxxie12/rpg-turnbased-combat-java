public class Magic {
    private String name;
    private int damage;
    private int manaCost;

    

    public Magic(int damage, int manaCost, String name) {
        this.damage = damage;
        this.manaCost = manaCost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }


    
}
