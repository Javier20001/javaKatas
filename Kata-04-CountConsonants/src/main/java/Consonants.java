import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Consonants {
    public Consonants() {
    }
    
    public static int getCount(String str) {
        str = str.replaceAll(" ","");
        Pattern pattern = Pattern.compile("[b-df-hj-np-tv-z]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        int resoult = 0;
        while(matcher.find()) {
            resoult++; 
        }
        return resoult;
    }
}
