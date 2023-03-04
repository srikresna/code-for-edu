public class Blocks {
    public int width, length, heigth;

    public Blocks(int p, int l, int t) {
        length = p;
        width = l;
        heigth = t;
    }

    public int countVolume(){
        return length * width * heigth;
    }
}
