public class Java1910 {
    public static void main(String[] args){
        int meal = 5, tip = 2;
        var total = meal + (meal > 6 ? tip++ : tip--);
        System.out.println(total);
    }
}
