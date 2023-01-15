import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MoreZerosThanOnes {
    public static char[] moreZeros(String s) {
        List<String> listaDeLetrasAprobadas = new ArrayList<String>();
        for(int i = 0; i<s.length();i++){
            boolean tieneMas0 = charToBinary(s.charAt(i));
            if(tieneMas0){
                if(!listaDeLetrasAprobadas.contains(String.valueOf(s.charAt(i)))){
                    listaDeLetrasAprobadas.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        String str=listaDeLetrasAprobadas.toString().replaceAll(",", "");
        char[] chars = str.substring(1, str.length()-1).replaceAll(" ", "").toCharArray();
        return chars;
    }

    private static boolean esCorrecto(String s){
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        for (int x = 0; x < s.length(); x++) {
            if (mapa.containsKey(String.valueOf(s.charAt(x)))) {
                mapa.put(String.valueOf(s.charAt(x)), mapa.get(String.valueOf(s.charAt(x))) + 1);
            } else {
                mapa.put(String.valueOf(s.charAt(x)), 1);
            }
        }
        return mapa.get("0")>mapa.get("1");
    }

    private static boolean charToBinary(char c){
		List<Integer> result = new ArrayList();
        int n = c;
        String convert = "";
		while(n >= 2) {
			result.add((int) (n%2));
			n = n/2;
		}
		result.add((int) n);
        for (Integer integer : result) {
            convert += String.valueOf(integer);
        }
		return esCorrecto(convert);
	}
}
