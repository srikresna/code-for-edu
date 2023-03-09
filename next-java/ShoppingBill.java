public class ShoppingBill {
    //make attribute
    public String billid, customerId, customerName, date, couponCode;
    public double[] price = new double[4];
    public int deliveryDistance;

    //create a constructor for this class
    public ShoppingBill(){
    }

    //there are 3 ooupon code available:
    //GIFT10 -> 10% OFF
    //GIFT15 -> 15% OFF
    //GIFT17 -> 17% OFF
    public int calcDiscount(double calcDiscount) {
        //check whether the input have coupon code, if it yes give a discount.
        if (couponCode.equals("GIFT10")) {
            calcDiscount = (price[0] + price[1] + price[2] + price[3]) * 0.1;
        } else if (couponCode.equals("GIFT15")) {
            calcDiscount = (price[0] + price[1] + price[2] + price[3]) * 0.15;
        } else if (couponCode.equals("GIFT17")) {
            calcDiscount = (price[0] + price[1] + price[2] + price[3]) * 0.17;
        }
        //return the final calcDiscount
        return (int) calcDiscount;
    }



    //method for calculate the shipping cost
    public int shippingCost() {
        //if no one item have price more than 75000, so the shipping cost will still same
        double shippingCost = 1000 * deliveryDistance;
        //this will check, whether or not the item have price more than 75000 then give a discount
        if (price[0] > 75000 || price[1] > 75000 || price[2] > 75000 || price[3] > 75000) {
            shippingCost = shippingCost * 0.95;
        }
        //return the final shipping cost
        return (int) shippingCost;
    }

    //method for calculate total payment
    public int calcTotalPayment() {

        //doing some addition from array price[0] to price[3] then minus with discount, lastly add shippingCost for totalprice
        //Then return it directly
        return (int) (price[0] + price[1] + price[2] + price[3] - calcDiscount(0) + shippingCost());
    }
}


