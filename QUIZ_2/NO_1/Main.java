import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a player
        Player player = new Player();
        player.name = "Hero";
        player.maxHealth = 100;
        player.health = 100;
        player.setLivesRemaining(3);

        // Create a monster
        Monster monster = new Monster();
        monster.name = "Goblin";
        monster.maxHealth = 50;
        monster.health = 50;
        monster.setColor(Color.GREEN);

        // Player attacks the monster
        monster.takeDamage(12);

        // Monster attacks the player
        player.takeDamage(10);

        // Check if anyone is dead      
        if (player.isDead()) {
            System.out.println("Player is dead!");
        } else if (monster.isDead()) {
            System.out.println("Monster is dead!");
        } else {
            System.out.println("The battle continues...");
        }
    }
}
