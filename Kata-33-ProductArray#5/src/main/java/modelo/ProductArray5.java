package modelo;

public class ProductArray5 {
    
    public ProductArray5() {
      // TODO document why this constructor is empty
    }
    
    public static long[] productArray(int[] numbers){
        long[] result = new long[numbers.length];
        long multiplicador = 1;
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0 ; j<numbers.length; j++){
                if(j != i){
                    multiplicador *= numbers[j];
                }
            }
            result[i] = multiplicador;
            multiplicador = 1;
        }
        return result; // Do your magic!
    }
}
