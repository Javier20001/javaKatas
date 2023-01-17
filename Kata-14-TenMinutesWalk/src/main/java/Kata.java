import java.util.HashMap;
import java.util.Map;

class kata {

    //dado un array de chars [n s w e] indentificar que tenga un largo de 10 y que empieze en el mismo punto, ej 5 "n" y 5 "s" ambas se anular
    // y termina en el mismo lugar 
    public static boolean isValid(char[] walk) {
        boolean resoult = false;
        if(walk.length == 10){
            HashMap<String, Integer> mapa = new HashMap<String, Integer>();
            for (int x = 0; x < walk.length; x++) {
                if (mapa.containsKey(String.valueOf(walk[x]))) {
                    mapa.put(String.valueOf(walk[x]), mapa.get(String.valueOf(walk[x])) + 1);
                } else {
                    mapa.put(String.valueOf(walk[x]), 1);
                }
            }
            boolean validacion = true;
            for(Map.Entry<String, Integer> entry : mapa.entrySet()){
                if(validacion){
                    if(opuesto(entry.getKey(), mapa)){
                        resoult = true;
                    }else{
                        validacion = false;
                        resoult=false;
                    }
                }
            }
            return resoult;
        }
        return resoult;
    }

    private static boolean opuesto(String key, HashMap map){
        boolean resultado = false;
        if(key.equals("n")){
            resultado =map.get("s")!=null && map.get("s")==map.get(key) ;
        }else if(key.equals("s")){
            resultado =map.get("n")!=null && map.get("n")==map.get(key);
        }else if(key.equals("e")){
            resultado =map.get("w")!=null && map.get("w")==map.get(key);
        }else if(key.equals("w")){
            resultado =map.get("e")!=null && map.get("e")==map.get(key);
        }
        return resultado;
    }
}