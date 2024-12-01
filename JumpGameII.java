public class JumpGameII {
    public static void main(String[] args) {
        int[] numbs = {2, 3, 1, 1, 4};
        int result = jump(numbs);
        System.out.println("Result:" + result);
    }

    public static int jump(int[] numbs) {
        int length = numbs.length;
        if (length == 1)
            return 0;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < length; i++) {
            farthest = Math.max(farthest, i + numbs[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= (length - 1))
                    break;
            }
        }
        return jumps;
    }
}
