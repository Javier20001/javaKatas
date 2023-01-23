import java.util.regex.Pattern;

public class BackspacesInString {

    public static String cleanString(String s) {
        Pattern pattern = Pattern.compile("[a-z|0-9]", Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("[-+/*^()]", Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(s).find() && !s.isEmpty()) {
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == '#') {
                    if( i != 0 ){
                        s = pattern1.matcher(String.valueOf(s.charAt(i-1))).find() ? s.replaceFirst("\\"+s.charAt(i - 1) + "" + s.charAt(i), "") :s.replaceFirst(s.charAt(i - 1) + "" + s.charAt(i), "");
                        i = 0;
                    }else{
                        s = s.replaceFirst(""+s.charAt(i), "");
                        i = 0;
                    }
                } else {
                    i++;
                }
            }
        }
        return pattern.matcher(s).find() ? s : "";
    }
}
