public class QuizDay95 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbs.length; i++) {
            sum += numbs[i];
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 0; j < numbs.length; j++) {
                sum += numbs[j];
                if (j % 2 != 0) {
                    break;
                }
            }
        }
        System.out.println("Sum:" + sum);
    }
}
