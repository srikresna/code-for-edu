public class Barrier implements Destroyable{
    private int health;

    public Barrier(int strength) {
        this.health = strength;
    }

    public void setStrength(int strength) {
        this.health = strength;
    }

    public int getStrength() {
        return health;
    }

    public void destroyed() {
        health -= health * 0.1;
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength = " + health + "\n";
    }
}

