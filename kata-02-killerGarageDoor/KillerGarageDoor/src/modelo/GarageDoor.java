package modelo;

public class GarageDoor {

    public GarageDoor() {
    }

    public static String run(String events) {
        String result = "";
        int valorOfEvente = 0;
        String condicion = "down";
        for (int i = 0; i <= events.length() - 1; i++) {
            if (events.charAt(i) == 'P') {
                if (condicion != "up") {
                    condicion = "up";
                    result = result.concat(String.valueOf(valorOfEvente += 1));
                } else {
                    if (condicion != "pause") {
                        result = result.concat(String.valueOf(valorOfEvente));
                        condicion = "pause";
                    } else {
                        condicion = "up";
                    }
                }
            }
            if (events.charAt(i) == 'O') {
                if (condicion != "down") {
                    condicion = "down";
                    result = result.concat(String.valueOf(valorOfEvente -= 1));
                } else {
                    if (condicion != "pause") {
                        result = result.concat(String.valueOf(valorOfEvente));
                        condicion = "pause";
                    } else {
                        condicion = "down";
                    }
                }
            }
            if (events.charAt(i) == '.') {
                if (condicion == "up") {
                    result = valorOfEvente < 5 ? result.concat(String.valueOf(valorOfEvente += 1)) : result.concat(String.valueOf(valorOfEvente));
                } else if (condicion.equals("pause")) {
                    result = result.concat(String.valueOf(valorOfEvente));
                } else {
                    result = valorOfEvente > 0 ? result.concat(String.valueOf(valorOfEvente -= 1)) : result.concat(String.valueOf(0));
                }
            }
        }
        return result;
    }
}
