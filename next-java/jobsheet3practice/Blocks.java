package jobsheet3practice;

public class Blocks {
    public int length, width, height;
    public Blocks() {
    }
    public int getVolume() {
        return length * width * height;
    }

    public int getSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
