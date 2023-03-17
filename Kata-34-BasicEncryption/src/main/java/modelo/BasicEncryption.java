package modelo;
public class BasicEncryption {
    
    public BasicEncryption() {
    }
    
    public String encrypt(String text, int rule) {
        String resultado = "";
        for (int i = 0; i<text.length();i++){
            int valor = (int)(text.charAt(i)+rule);
            while(valor>255){
                valor-=256;
            }
            resultado += String.valueOf((char)valor);
        }
        return resultado;
    }
}

