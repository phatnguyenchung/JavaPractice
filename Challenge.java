public class Challenge {
    static {
        initalize();
    }

    private static int sum;

    private static int add(int number){
        sum += number;
        return sum;
    }

    private static void initalize() {
        sum = 10;
    }

    public static void main(String[] args){
        Challenge.add(5);
        System.out.println(Challenge.add(4));
    }
}
