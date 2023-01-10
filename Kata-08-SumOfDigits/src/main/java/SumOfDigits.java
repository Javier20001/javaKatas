import java.util.ArrayList;
import java.util.List;

class SumOfDigits{

    public SumOfDigits() {
    }
    
    public static int digital_root(int n) {
        List<Integer> ListaDeNumeros = separacion(n);
        int valor = 0;
        while(ListaDeNumeros.size() != 1 && n > 0){
            for (Integer integer : ListaDeNumeros) {
                valor += integer;
            }
            return digital_root(valor);
        }
        return ListaDeNumeros.get(0);
    }

    public static List<Integer> separacion(int n){
        List<Integer> stack = new ArrayList();
        if(n > 0){
            while(n > 0){
                stack.add(n % 10);
                n = n / 10;
            }  
        }else{
            stack.add(n);
        }
        return stack;
    }
}