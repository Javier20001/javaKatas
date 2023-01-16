import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String reverseLetter(String str) {
        str = str.replaceAll("[^\\p{IsAlphabetic}]", "");
        List<Character> listaLetras = new ArrayList<Character>();
        String wordReverse = "";
        for (char iterable_element : str.toCharArray()) {
            listaLetras.add(iterable_element);
        }
        Collections.reverse(listaLetras);
        for (Character character : listaLetras) {
            wordReverse += String.valueOf(character);
        }
        return wordReverse; //coding and coding..
    }
}
