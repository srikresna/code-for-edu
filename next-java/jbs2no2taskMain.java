public class jbs2no2taskMain {
    public static void main(String[] args) {
        jbs2no2task rental1 = new jbs2no2task("001", "Stepen", "VALHO", 10000, 3);
        jbs2no2task rental2 = new jbs2no2task("002", "Pirza", "JUMA", 5000, 5);
        jbs2no2task rental3 = new jbs2no2task("003", "Dapis", "LOR", 3000, 2);

        rental1.printRentalData();
        rental2.printRentalData();
        rental3.printRentalData();
    }
}
