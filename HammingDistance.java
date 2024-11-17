public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int pos = 0;
        while (ans != 0) {
            ans = ans & (ans - 1);
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        int x = 1, y = 4;
        int result = hammingDistance(x, y);
        System.out.println(result);
    }
}
