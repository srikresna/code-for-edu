public class jbs2no3task {
    String name;
    int unitPrice, qty;

    jbs2no3task(){
    }
    jbs2no3task(String name, int unitPrice, int qty){
        this.name = name;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
    int calculateTotalPrice(){
        return unitPrice * qty;
    }
    int calculateDiscount(){
        if (calculateTotalPrice() > 100000){
            return calculateTotalPrice() * 10 / 100;
        } else if (calculateTotalPrice() >= 50000 && calculateTotalPrice() <= 100000){
            return calculateTotalPrice() * 5 / 100;
        } else {
            return 0;
        }
    }
    int calculateFinalPrice(){
        return calculateTotalPrice() - calculateDiscount();
    }
}
