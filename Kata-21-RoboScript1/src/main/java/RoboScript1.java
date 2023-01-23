public class RoboScript1 {
    public static String highlight(String code) {
        String resultScript = "";
        String key = "";
        String value = "";
        int i = 0;
        while (i <= code.length() - 1) {
            if (i == 0) {
                key = String.valueOf(code.charAt(0));
                value = String.valueOf(code.charAt(0));
            } else {
                if (String.valueOf(code.charAt(i)).equals(key)) {
                    value += String.valueOf(code.charAt(i));
                } else if (isNumeric(String.valueOf(code.charAt(i))) == isNumeric(key)
                        && isNumeric(String.valueOf(code.charAt(i)))) {
                    value += String.valueOf(code.charAt(i));
                } else {
                    resultScript += hfkasfsa(key, value);
                    key = String.valueOf(code.charAt(i));
                    value = String.valueOf(code.charAt(i));
                }
            }
            if (i == code.length() - 1) {
                resultScript += hfkasfsa(key, value);
            }
            i++;
        }
        return resultScript;
    }

    private static String hfkasfsa(String key, String value) {
        String result = "";
        if (key.equals("F")) {
            result = "<span style=\"color: pink\">" + value + "</span>";
        } else if (key.equals("L")) {
            result = "<span style=\"color: red\">" + value + "</span>";
        } else if (key.equals("R")) {
            result = "<span style=\"color: green\">" + value + "</span>";
        } else if (isNumeric(key)) {
            result = "<span style=\"color: orange\">" + value + "</span>";
        } else {
            result = value;
        }
        return result;
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
