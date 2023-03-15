package Modelo;

public class ValidParentheses {


    public ValidParentheses() {
    }

    public static boolean validParentheses(String parens){
    //Put code below
        int abierto = 0;
        int cerrado = 0;
        for(int i = 0; i<parens.length();i++){
            if(parens.charAt(i)=='('){
                abierto++;
            }
            else if(parens.charAt(i)==')'){
                if(abierto!=0){
                    abierto--;
                }else{
                    cerrado++;
                }
            }
        }
        return abierto==0 && cerrado==0;
    }
}
