import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        int x;
        double result;
        System.out.println("x:");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        if (x > 3) {
            result = Math.pow(x, 3) + 2 * Math.pow(x, 2) + 5 * x;
        } else if (x >= 1) {
            result = Math.pow(x, 2) - 2 * x + 4;
        } else {
            result = 5 * x - 8;
        }
        System.out.println(result);
    }
}
