import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        int median = nums[n / 2]; // Use the median (middle element after sorting)
        for (int num : nums) {
            ans += Math.abs(num - median); // Sum of absolute differences
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsII solution = new MinimumMovesToEqualArrayElementsII();
        System.out.println(solution.minMoves2(new int[]{1, 2, 3})); // Output: 2
        System.out.println(solution.minMoves2(new int[]{1, 10, 2, 9})); // Output: 16
    }
}
