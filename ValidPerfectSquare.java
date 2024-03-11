import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num to check perfect square:");
        int num = scanner.nextInt();
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
