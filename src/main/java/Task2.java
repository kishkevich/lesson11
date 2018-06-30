import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("([a-z])\\1+");
        String str = "Hellowoooorld";
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            String match = matcher.group();
            int length = match.length();
            str = str.replaceFirst(match, match.substring(0, 1) + length);
        }
        System.out.println(str);

        Pattern patternReturn = Pattern.compile("([a-z])\\d+");
        Matcher matcherReturn = patternReturn.matcher(str);

        while (matcherReturn.find()) {
            String match = matcherReturn.group();
            String letter = Character.toString(match.charAt(0));
            int value = Integer.parseInt(match.substring(1));
            String repeats = "";
            for (int i = 0; i < value - 1; i++) {
                repeats += letter;
            }
            str = str.replaceFirst(match, match.substring(0, 1) + repeats);
        }
        System.out.println(str);
    }
        /*while (matcher.find()) {
            result += matcher.group(1);
            int length = matcher.group().length();
            if (length > 1)
                result += length;
        }
        return result;*/
}


