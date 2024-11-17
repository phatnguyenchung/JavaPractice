import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int ans = 0;

        Arrays.sort(nums);

        int identity = nums[n % 2 == 0 ? (n/2)-1 : n/2];

        for(int e: nums) {
            if(e == identity) continue;
            else ans += Math.abs(e - identity);
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsII solution = new MinimumMovesToEqualArrayElementsII();
        System.out.println(solution.minMoves2(new int[]{1, 2, 3})); // Output: 2
        System.out.println(solution.minMoves2(new int[]{1, 10, 2, 9})); // Output: 16
    }
}
