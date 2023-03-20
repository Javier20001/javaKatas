package modelo;

import java.util.ArrayList;
import java.util.List;

public class RepeticionConsecutiva {

    public RepeticionConsecutiva() {
    }

    public static Object[] longestRepetition(String s) {
        Object[] resultado = null;
        if (s.length() != 0) {
            List<Object[]> LtsObject = new ArrayList<Object[]>();
            String actual = String.valueOf(s.charAt(0));
            int repetido = 0;
            for (int i = 0; i < s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals(actual)) {
                    repetido++;
                    if (i == s.length() - 1) {
                        LtsObject.add(new Object[] { actual, repetido });
                    }
                } else {
                    LtsObject.add(new Object[] { actual, repetido });
                    repetido = 1;
                    actual = String.valueOf(s.charAt(i));
                }
            }
            resultado = LtsObject.get(0);
            for (Object[] objects : LtsObject) {
                if ((Integer) resultado[1] < (Integer) objects[1]) {
                    resultado = objects;
                }
            }
        } else {
            resultado = new Object[] { "", 0 };
        }
        System.out.println(resultado[0] + " " + resultado[1]);
        return resultado;
    }
}
