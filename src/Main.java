public class Main {
    public static void main(String[] args) {
        byte[] a = { 1, 2, 3, 1, 3, 1 };
        int count = algorithm(a);
        System.out.println("Antal lika par: " + count);
    }

    private static int algorithm(byte[] array) {
        int[] temp = new int[256];
        int count = 0;

        for (byte num : array) {
            count += temp[num];
            temp[num]++;
        }
        return count;
    }
}

