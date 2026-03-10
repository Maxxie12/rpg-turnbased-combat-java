public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de combate iniciado...");

        Warrior player = new Warrior("Hero");
        Warrior enemy = new Warrior("Goblin");

        System.out.println(player.getName() + " HP: " + player.getCurrentHP());
        System.out.println(enemy.getName() + " HP: " + enemy.getCurrentHP());

    }
}