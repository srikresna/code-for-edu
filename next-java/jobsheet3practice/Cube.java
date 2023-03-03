package jobsheet3practice;

public class Cube {
    public int side;
    public Cube() {
    }
    public int getVolume() {
        return side * side * side;
    }
    public int getSurfaceArea() {
        return 6 * side * side;
    }

}
