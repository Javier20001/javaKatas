import modelo.GarageDoor;

public class App {
    public static void main(String[] args) throws Exception {
        // el objetivo de este kata es controlar una puerta automatica, la P abre la puerta, la O la cierra y los . no hacen nada
        // si aparecen dos P concecutivas la puerta se detiene en su lugar 
        GarageDoor gd = new GarageDoor();
        System.out.println(gd.run(".....P......O.O.O....."));
    }
}
