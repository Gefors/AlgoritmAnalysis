public class Main2 {
    public static void main(String[] args) {
        int m = 4;
        int pairs = algorithm(m);
        System.out.println("Antal lika par: " + pairs);
    }

    private static int algorithm(int m) {
        if (m < 2) {
            return 0;
        }
        int pairs = factorial(m) / (2 * factorial(m - 2));
        return pairs;
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = n * factorial(n - 1);
        return result;
    }
}

