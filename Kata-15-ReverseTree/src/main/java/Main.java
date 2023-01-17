public class Main {
    public static void main(String[] args) {
        Treenode arbol = new Treenode();

        arbol.insertar(4);
        arbol.insertar(2);
        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(6);
        arbol.insertar(9);

        arbol.recorrerPreOrden(arbol.raiz);
        System.out.println("---------------------------------------------");

        Treenode arbolInvertido = arbol.invertTree(arbol);
        arbolInvertido.recorrerPreOrden(arbolInvertido.raiz);

    }
}
