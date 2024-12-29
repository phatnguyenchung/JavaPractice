import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        int n;
        System.out.println("input n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (prime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static int prime(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
