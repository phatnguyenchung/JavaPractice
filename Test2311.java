import java.util.Scanner;

public class Test2311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input n: ");
            n = scanner.nextInt();
        } while (n < 0);
        System.out.println("Output:");
        for (int i = 0; i <= n; i++) {
            String parity = (i % 2 == 0) ? "even" : "odd";
            System.out.printf("%d: %s%n", i, parity);
        }
        scanner.close();
    }
}
