public class jbs2no1taskMain {
    public static void main(String[] args) {
        jbs2no1task circle = new jbs2no1task();
        circle.phi = 3.14;
        circle.r = 7;
        System.out.println("Areas of Circle is : " + circle.hitungLuas());
        System.out.println("Circumference of Circle is : " + circle.hitungKeliling());

        jbs2no1task circle2 = new jbs2no1task(3.14, 14);
        System.out.println("Areas another Circles is: " + circle2.hitungLuas());
    }
}
