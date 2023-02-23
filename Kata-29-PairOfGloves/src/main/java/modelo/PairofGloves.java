package modelo;

import java.util.HashMap;
import java.util.Map;

public class PairofGloves {

    public PairofGloves() {
    }

    public static int numberOfPairs(String[] gloves) {
        for (String string : gloves) {
            System.out.println(string);
        }
        int pair = 0;
        if (gloves.length != 0) {
            HashMap<String, Integer> mapa = new HashMap<String, Integer>();
            for (int i = 0; i < gloves.length; i++) {
                if (mapa.containsKey(gloves[i])) {
                    mapa.put(gloves[i], mapa.get(gloves[i]) + 1);
                } else {
                    mapa.put(gloves[i], 1);
                }
            }
            for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                if (entry.getValue() % 2 == 0) {
                    pair += entry.getValue() / 2;
                }else if((entry.getValue() - 1) % 2 == 0) {
                    if (entry.getValue() - 1 != 0) {
                        pair +=(entry.getValue() - 1) / 2;
                    }
                }
            }
        }
        System.out.println(pair);
        return pair;
    }
}
