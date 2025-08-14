public class Uppg1c {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 2, 3, 3 };
        int count = countpairs(a);
        System.out.println("Antal lika par: " + count);
    }
    public static int countpairs(int[] sortedarr) {
        int N = sortedarr.length;
        int pairs = 0;

        int[] temp = new int[sortedarr[N - 1] + 1];
        for (int num : sortedarr) {
            temp[num]++;
        }

        for (int pair : temp) {
            pairs += (pair * (pair - 1)) / 2;
        }

        return pairs;
    }
}