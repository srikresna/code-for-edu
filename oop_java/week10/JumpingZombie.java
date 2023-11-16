public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += health * 0.3;
        } else if (level == 2) {
            health += health * 0.4;
        } else if (level == 3) {
            health += health * 0.5;
        }
    }

    public void destroyed() {
        health -= health * 0.095;
    }

    public String getZombieInfo() {
        return "\nJumping Zombie Data = " + super.getZombieInfo();
    }
}
