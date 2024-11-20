import java.awt.Color;

public class Monster extends DamageableObject {
    private int threatLevel;
    private Color color;

    public String makeNoise() {
        // Monster-specific noise
        return "Roar!";
    }

    @Override
    public void onKilled() {
        // Handle monster death, e.g., drop items
        System.out.println("Monster is dead!");
    }

    // Getter and Setter methods for threatLevel and color
    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
