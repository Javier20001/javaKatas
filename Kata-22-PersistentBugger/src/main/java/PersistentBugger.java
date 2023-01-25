class PersistentBugger{
    public static int persistence(long n) {
        String str = n+"";
        int contador = 0;
        while(str.length() > 1){
            int numero1 = Integer.valueOf(String.valueOf(str.charAt(0)));
            for(int i = 1; i < str.length(); i++){
                numero1 *= Integer.valueOf(String.valueOf(str.charAt(i)));
            }
            str = numero1+"";
            contador++;
        }
        return contador;
	}
}

