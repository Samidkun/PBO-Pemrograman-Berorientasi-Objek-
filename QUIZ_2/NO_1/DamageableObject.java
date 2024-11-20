public abstract class DamageableObject extends GameObject {
    public int maxHealth;
    protected int health;

    public boolean isDead() {
        return health <= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (isDead()) {
            onKilled();
        }
    }

    public abstract void onKilled();
}
