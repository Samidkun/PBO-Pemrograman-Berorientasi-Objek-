public class Player extends DamageableObject {
    private int score;
    private int livesRemaining;

    @Override
    public void onKilled() {
        // Handle player death, e.g., game over screen
        System.out.println("Player is dead!");
    }

    // Getter and Setter methods for score and livesRemaining
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }

    public void setLivesRemaining(int livesRemaining) {
        this.livesRemaining = livesRemaining;
    }
}
 