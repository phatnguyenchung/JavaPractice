public class Challenge {
    static {
        initialize();
    }

    private static int sum;

    private static int add(int number){
        sum += number;
        return sum;
    }

    private static void initialize() {
        sum = 10;
    }

    public static void main(String[] args){
        Challenge.add(5);
        System.out.println(Challenge.add(4));
    }
}
