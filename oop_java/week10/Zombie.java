public class Zombie implements Destroyable{
    protected int health;
    protected int level;

    public void heal() {
        if (level == 1) {
            health += health * 0.1;
        } else if (level == 2) {
            health += health * 0.3;
        } else if (level == 3) {
            health += health * 0.4;
        }
    }
     
    public void destroyed() {
        health -= health * 0.02;
    }

    public String getZombieInfo() {
        return "\nHealth = " + health + "\nLevel = " + level + "\n";
    }
}
