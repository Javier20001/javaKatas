import java.util.HashMap;

public class UniqueNumber {
    public static double findUniq(double arr[]) {
        HashMap<Double, Integer> mapa = arrayToMap(arr);
        int menor = mapa.get(arr[0]);
        double modant = getKey(mapa, menor);
        for (HashMap.Entry<Double, Integer> entry : mapa.entrySet()) {
            if (menor > entry.getValue()) {
                menor = entry.getValue();
                modant = entry.getKey();
            }
        }
        return modant;
    }

    private static HashMap arrayToMap(double arr[]) {
        HashMap<Double, Integer> mapa = new HashMap<Double, Integer>();
        for (int x = 0; x < arr.length; x++) {
            double numero = arr[x];
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1);
            } else {
                mapa.put(numero, 1);
            }
        }
        return mapa;
    }

    private static double getKey(HashMap<Double, Integer> mapa, int value) {
        double key = 0;
        for (HashMap.Entry<Double, Integer> entry : mapa.entrySet()) {
            if(entry.getValue() == value){
                key = entry.getKey();
            }
        }
        return key;
    }
}
