package jobsheet3practice;

public class Cylinder {
    public int radius, height;
    public Cylinder() {
    }
    public int getVolume() {
        return (int) (Math.PI * radius * radius * height);
    }

    public int getSurfaceArea() {
        return (int) (2 * Math.PI * radius * (radius + height));
    }
}
