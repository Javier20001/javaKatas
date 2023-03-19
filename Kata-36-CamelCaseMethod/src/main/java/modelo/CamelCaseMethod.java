package modelo;

import java.util.Arrays;
import java.util.List;

public class CamelCaseMethod {

    public CamelCaseMethod() {
    }

    public static String camelCase(String str) {

        List<String> listWords = Arrays.asList(str.split(" "));
        String strFinal = "";
        for (String string : listWords) {
            if (string.matches("[a-zA-Z]+")) {
                string = string.replaceFirst(String.valueOf(string.charAt(0)),
                        String.valueOf(string.charAt(0)).toUpperCase());
                strFinal += string;
            }
        }
        // System.out.println(strFinal);
        return strFinal;
    }
}
