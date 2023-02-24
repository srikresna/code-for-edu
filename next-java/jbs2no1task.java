public class jbs2no1task {
    double phi;
    double r;

    jbs2no1task(){
    }
    jbs2no1task(double p, double r){
        phi = p;
        this.r = r;
    }

    double hitungLuas(){
        return phi * r * r;
    }

    double hitungKeliling(){
        return 2 * phi * r;
    }
}
