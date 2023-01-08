import java.util.ArrayList;
import java.util.List;

public class Collatz {

    public Collatz() {
    }

    public static long conjecture(long x) {
        List<Long> ListaNumeros = new ArrayList<Long>();
        ListaNumeros.add(x);
        while(x != 1){
            x = x%2==0 ? x/2 : x*3+1;
            ListaNumeros.add(x);
        }

        return ListaNumeros.size();
    }
}