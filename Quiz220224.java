public class Quiz220224 {
    public static void main(String[] args) {
        int x = 5, y = 7;
        boolean result = (x > y) && (x++ < y--);
        System.out.println(x);
        System.out.println(y);
        System.out.println(result);
    }
}
