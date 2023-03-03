package jobsheet3practice;

public class Land {
    public int length, width;

    public Land(){
    }
    public int getArea() {
        return length * width;
    }

    public int getWidestArea(Land[] companyLand) {
        int widestArea = 0;
        int land = 0;
        for(int i = 0; i < companyLand.length; i++) {
            if(companyLand[i].getArea() > widestArea) {
                widestArea = companyLand[i].getArea();
                land = i + 1;
            }
        }
        return land;
    }
}
