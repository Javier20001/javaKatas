public class Tribonacci {

    public static double[] tribonacci(double[] s, int n) {
        double[] aux = new double[n];
        if(n!=0){
            int largo = n>s.length ? s.length : n;
            for(int i = 0; i <  largo; i++){
                aux[i] = s[i];
            }
            int i = 4;
            int poscion = 0;
            while(i<=n){
                aux[i-1] = aux[poscion] + aux[poscion+1] + aux[poscion+2];
                poscion++;
                i++;
            }
        }
        return aux;
      // hackonacci me
    } 
}
