import java.util.ArrayList;
import java.util.List;

public class WhoLikeIt {
    public static String whoLikesIt(String... names) {
        String resultado = "";
        if(names.length == 0){
            resultado = "no one like this";
        }else if(names.length == 1){
            resultado = names[0] + " likes this";
        }else if(names.length == 2){
            resultado = names[0]+" and " + names[1] +" like this";
        }else if(names.length == 3){
            resultado = names[0]+ ", "+names[1]+" and "+names[2]+" like this";
        }else if(names.length > 3){
            int i = names.length-2;
            resultado = names[0]+ ", "+names[1] + " and " + i + " others like this";;
        }
        return resultado;
    }
}
