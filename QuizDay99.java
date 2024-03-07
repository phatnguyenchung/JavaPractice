public class QuizDay99 {
    public static void main(String[] args) {
        int[] numbs = {3, 8, 5, 2};
        int res = 0;
        for (int x : numbs) {
            if (x > res) {
                res = x;
            }
        }
        System.out.println(res);
    }
}
