import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(purify("It is a bit chilly"));
    }

    public static String purify(String s) {
        String s2 = "";
        
        s = s.replaceAll("i", "I")+" ";
        for (int i = 0; i != s.length()-1; i++) {
            if(s.charAt(i)!='I'){
                if(s.charAt(i+1)!='I' && s.charAt(i-1)!='I'){
                    s2 += s.charAt(i);
                    if(s.charAt(i+1)==' '){
                        s2 += " "; 
                    }
                }
            }
        }

        StringBuilder s3 = new StringBuilder(s2);
        s2 = "";
        for(int i = 0; i< s3.length()-1;i++){
            if(s3.charAt(i)==' '){
                if(s3.charAt(i+1)==' '){
                    s3.deleteCharAt(i);
                }
            }
            s2 += s3.charAt(i);
        }

        return s2;
    }
}
