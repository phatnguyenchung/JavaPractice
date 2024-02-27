import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz {
    public static void main(String[] args){
        String regex =  "\\d+";
        String input = "1234";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group() + " ");
        }
        int x = 5;
        System.out.println(x++ + ++x);
    }
}
