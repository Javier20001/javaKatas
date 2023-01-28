import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringToCamelCase {
    static String toCamelCase(String s) {
        Pattern pattern = Pattern.compile("[_]", Pattern.CASE_INSENSITIVE);
        List<String> elements = pattern.matcher(s).find() ? Arrays.asList(s.split("\\_"))
                : Arrays.asList(s.split("\\-"));

        String resoult = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            String letraMayus = String.valueOf(elements.get(i).charAt(0)).toUpperCase();
            resoult += elements.get(i).replaceFirst(String.valueOf(elements.get(i).charAt(0)), letraMayus);
        }
        return resoult;
    }
}
