import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YourOrderPlease {
    public static String order(String words) {
        String result = "";
        if(words.length()!=0){
            List<String> elements = Arrays.asList(words.split("\\ "));
            List<Integer> clean = new ArrayList<Integer>();
            for (String word : elements) {
                clean.add(Integer.valueOf(String.valueOf(word.replaceAll("[a-z|A-Z]", "").charAt(0))));
            }
            for(int i = 0; i<elements.size();i++){
                for(int j=0; j<clean.size();j++){
                    if(i+1 == clean.get(j)){
                        result += elements.get(j);
                    }
                }if(i!=elements.size()-1){
                    result+=" ";
                }
            }
        }
        return result;
    }
}
