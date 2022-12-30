public class Experiment1 {
    static int factorialRecursive(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * factorialRecursive(n - 1));
        }
    }
    static int factorialIterative(int n) {
        int factor = 1;
        for (int i = n; i >= 1; i--) {
            factor = factor * i;
        }
        return factor;
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(5));
    }
}
