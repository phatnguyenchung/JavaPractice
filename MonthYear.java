import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        int _month, _year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month:");
        do {
            _month = scanner.nextInt();
        } while (_month <= 0 || _month >= 13);
        System.out.println("Input year:");
        do {
            _year = scanner.nextInt();
        } while (_year <= 0);
        switch (_month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if (checkYear(_year))
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
                break;
            default:
                System.out.println("Invalid month!!!");
        }
    }

    public static boolean checkYear(int _year) {
        return (_year % 4 == 0 && _year % 100 != 0) || _year % 400 == 0;
    }
}
