package jobsheetBFnDC;

public class Faktorial {
    public int num;

    public int FaktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    public int FaktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * FaktorialDC(n - 1);
        }
    }
}
