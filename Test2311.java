import java.util.Scanner;

public class Test2311 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input n:");
        } while ((n = scanner.nextInt()) < 0);
        System.out.println("Output:");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d: %s%n", i, (i % 2 == 0) ? "even" : "odd");
        }
        scanner.close();
    }
}
