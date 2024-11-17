public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        for (int xor = x ^ y; xor != 0; xor &= (xor - 1)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1, y = 4;
        int result = hammingDistance(x, y);
        System.out.println(result);
    }
}
