package modelo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PlayingWithDigits {

    public PlayingWithDigits() {
    }

    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += Math.pow(Integer.parseInt(String.valueOf(number.charAt(i))), p);
            p++;
        }
        int valor = result / n;
        return result % n == 0 ? valor : -1;
    }
}
