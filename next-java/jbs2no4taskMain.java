public class jbs2no4taskMain {
    public static void main(String[] args) {
        jbs2no4task task1 = new jbs2no4task();
        task1.x = 8;
        task1.y = 0;
        task1.width = 10;
        task1.height = 10;
        task1.printPosition();
        task1.moveLeft(8);
        task1.moveRight(6);
        task1.moveUp(4);
        task1.moveDown(3);
        task1.printPosition();
    }
}
