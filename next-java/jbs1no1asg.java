
public class jbs1no1asg {
    static int costPerKgClothes = 4500;
    static int discountTreshold = 10;
    static double discount = 0.05;
    static double calculateCost(int kg) {
        double cost = kg * costPerKgClothes;
        if (kg >= discountTreshold) {
            cost = cost - (cost * discount);
        }
        return cost;
    }
    public static void main(String[] args) {
        double aniCost = calculateCost(4);
        double budiCost = calculateCost(15);
        double binaCost = calculateCost(6);
        double citaCost = calculateCost(11);

        double totalIncome = aniCost + budiCost + binaCost + citaCost;
        System.out.println("Total income: " + totalIncome);
    }
}
