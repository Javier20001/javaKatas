public class MultiplicationTable {
    public static int [][] multiplicationTable(int n){
        int[][] tabla = new int[n][n]; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                tabla[i][j] = (i+1)*(j+1);
            }
        }
        return tabla;
    }
}
