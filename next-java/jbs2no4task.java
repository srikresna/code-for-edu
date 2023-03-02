public class jbs2no4task {
    int x, y, width, height;
    jbs2no4task(){
    }
    void moveLeft(int left) {
        x -= left;
    }
    void moveRight(int right) {
        x += right;
    }
    void moveUp(int up) {
        y -= up;
    }
    void moveDown(int down) {
        y += down;
    }
    void printPosition() {
        System.out.println("width: " + width + ", height: " + height + ", x: " + x + ", y: " + y + "");
    }
}
