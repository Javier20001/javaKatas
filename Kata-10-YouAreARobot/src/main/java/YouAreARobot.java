import java.util.HashMap;
import java.util.Map;

public class YouAreARobot {
    public static String walk(String path) {
        String result = "";
        if(path.length() == 1){
            result="Take "+ 1 +" step "+direction(path.charAt(0));
        }else if(path.isEmpty()){
            result="Paused";
        }else{
            char inicio = path.charAt(0);
            int contador = 1;
            for(int i = 1; i<=path.length()-1;i++){
                if(path.charAt(i)==inicio){
                    contador++;
                }else{
                    result = result + "Take "+ contador + plural(contador) +direction(inicio);
                    result = result + "\n";
                    contador = 1;
                    inicio = path.charAt(i);
                }
                if(i==path.length()-1){
                    result = result + "Take "+ contador + plural(contador) +" steps "+direction(inicio);
                }
            }
        }
        return result;
    }

    private static String direction(char simbolo){
        String signo = String.valueOf(simbolo);
        Map<String , String> doubleBraceMap = new HashMap<String, String>() {{ put("v", "down"); put("<","left");put("^","up");put(">","right");}};
        return doubleBraceMap.get(signo);
    }

    private static String plural(int n){
        return n == 1? " step " : " steps ";
    }
}
