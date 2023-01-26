public class SnailCrawlsUp {
    public static int snail(int column, int day, int night) {
        int recorrido = day;
        int dias = 1;
        while(recorrido < column){
            recorrido -= night;
            recorrido +=day;
            dias++;
        }

        return dias; // your code here
    }
}
