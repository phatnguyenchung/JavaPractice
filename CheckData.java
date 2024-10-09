import java.util.Scanner;

public class CheckData {
    // Hàm kiểm tra xem một số có phải là số chẵn hay không
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        System.out.println(" Nhập số:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        // Kiểm tra xem num có phải là số chẵn hay không
        if (isEven(num)) {
            System.out.println(num + " là số chẵn");
        } else {
            System.out.println(num + " không là số chẵn");
        }

        // Kiểm tra xem num có phải là số nguyên tố hay không
        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không là số nguyên tố");
        }
    }

}
