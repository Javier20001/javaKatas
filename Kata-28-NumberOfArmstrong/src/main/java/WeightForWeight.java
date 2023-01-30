class NumberOfArmstrong{
     public static boolean isNarcissistic(int number) {
        int resultado = 0;
        String numero = String.valueOf(number);
        for(int i = 0;i<numero.length();i++){
            resultado += Math.pow(Integer.parseInt(String.valueOf(numero.charAt(i))), numero.length()); 
        }
        return resultado == number;
    }
}