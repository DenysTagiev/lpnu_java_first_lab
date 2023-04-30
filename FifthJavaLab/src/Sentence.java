import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    public static void main(String[] args) {
        String text = "This is a sample text with words of various lengths.";
        int length = 5;

        Pattern pattern = Pattern.compile("\\b[^aeiou]\\w{" + (length - 1) + "}\\b");

        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("");

        System.out.println(result);
    }
}
