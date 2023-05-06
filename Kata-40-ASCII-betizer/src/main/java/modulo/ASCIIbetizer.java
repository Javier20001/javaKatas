package modulo;

import java.util.*;
import java.util.Map.Entry;

public class ASCIIbetizer {

    public static String[] ASCIIbetize(String str) {

        List<String> ltsPalabras = Arrays.asList(str.split("\\ "));
        HashMap<String, Integer> mapPalabras = new HashMap<>();
        for (String string : ltsPalabras) {
            mapPalabras.put(string, ASCValue(string));
        }

        List<Map.Entry<String, Integer>> mapPalabrasOrdenado = new ArrayList<>(mapPalabras.entrySet());

        Collections.sort(mapPalabrasOrdenado, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int r = o1.getValue().compareTo(o2.getValue());
                if (r == 0) {
                    r = o1.getKey().compareTo(o2.getKey());
                }

                return r;
            }
        });

        LinkedHashMap<String, Integer> hashMapPalabrasOrdenado = new LinkedHashMap<>();

        for (Entry<String, Integer> entry : mapPalabrasOrdenado) {
            hashMapPalabrasOrdenado.put(entry.getKey(), entry.getValue());
        }

        String[] resutado = new String[mapPalabrasOrdenado.size()];
        int i = 0;
        for (Entry<String, Integer> dato : hashMapPalabrasOrdenado.entrySet()) {
            resutado[i] = dato.getKey();
            i++;
        }

        return resutado;
    }

    public static int ASCValue(String palabra) {
        int resultado = 0;
        for (int i = 0; i < palabra.length(); i++) {
            resultado += (int) palabra.charAt(i);
        }
        return resultado;
    }
}