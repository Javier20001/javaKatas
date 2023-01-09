import java.util.Arrays;
import java.util.List;

public class HighestScoringWord {

    public HighestScoringWord() {
    }

    public static String high(String s) {
        List<String> elements = Arrays.asList(s.split("\\ "));
        String palabraMasGrande = "";
        int valor = 0;
        for (String string : elements) {
            int aux = valorDelString(string);
            if (aux > valor) {
                palabraMasGrande = string;
                valor = aux;
            }
        }
        return palabraMasGrande;
    }

    private static int valorDelString(String palabra) {
        String line = "abcdefghijklmnopqrstuvwxyz";
        int valor = 0;
        for (int i = 0; i < palabra.length(); i++) {
            valor += line.indexOf(palabra.charAt(i)) + 1;
        }
        return valor;
    }
}
