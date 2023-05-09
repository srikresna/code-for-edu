package jobsheetQueue;

public class Passengers {
    public String name, cityOrigin, cityDestination;
    public int ticketAmount, price;

    public Passengers(String name, String cityOrigin, String cityDestiantion, int ticketAmount, int price) {
        this.name = name;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestiantion;
        this.ticketAmount = ticketAmount;
        this.price = price;
    }
}

