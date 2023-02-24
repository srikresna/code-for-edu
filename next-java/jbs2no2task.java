public class jbs2no2task {
    String memberId, memberName, gameName;
    double dailyPrice;
    int dayRent;

    jbs2no2task(){
    }
    jbs2no2task(String id, String name, String game, double price, int day){
        memberId = id;
        memberName = name;
        gameName = game;
        dailyPrice = price;
        dayRent = day;
    }
    void printRentalData(){
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Daily Price: " + dailyPrice);
        System.out.println("Day Rent: " + dayRent);
        System.out.println("Total Price: " + getPrice());
    }
    double getPrice(){
        return dailyPrice * dayRent;
    }

}
