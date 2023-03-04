public class Triangle {
    public int base;
    public int height;
    public Triangle(int a, int t) {
        base = a;
        height = t;
    }
    public double countArea(){
        return 0.5 * base * height;
    }
    public double countPerimeter(){
        return base + height + Math.sqrt(base * base + height * height);
    }

}
