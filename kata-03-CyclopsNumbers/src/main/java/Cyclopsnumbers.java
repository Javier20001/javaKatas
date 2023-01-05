import java.util.ArrayList;
import java.util.List;

public class Cyclopsnumbers {
	public Cyclopsnumbers(){}
	
	public static boolean cyclops(long n) {
		List<Integer> listaDecimal = conver(n);
		int contador = 0; 
		boolean valido = false;
		for (Integer integer : listaDecimal) {
			if(integer == 0){
				contador+=1;
			} 
		}
		if(listaDecimal.size()%2 == 1 && contador == 1){
			valido = listaDecimal.get(listaDecimal.size()/2) == 0 &&  listaDecimal.get(listaDecimal.size()/2)+1 != 0 && listaDecimal.get(listaDecimal.size()/2)-1 != 0? true : false;
		}
		return valido;
	}
	
	private static List<Integer> conver(long n){
		List<Integer> result = new ArrayList();
		while(n >= 2) {
			result.add((int) (n%2));
			n = n/2;
		}
		result.add((int) n);
		return result;
	}
}
