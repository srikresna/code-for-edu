package oop_java.week3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();

    }
}
