public class QuizDay95 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                if (j % 2 != 0) {
                    break;
                }
            }
        }
        System.out.println("Sum:" + sum);
    }
}
