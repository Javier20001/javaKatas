

public class Treenode {
    
    Nodo raiz;
    public Treenode(){
        raiz = null;
    }

    public void insertar(int value){
        Nodo nuevoNodo = new Nodo(value);
        if(raiz == null){
            raiz = nuevoNodo;
        }else{
            Nodo nodoAux = raiz;
            
            while(nodoAux != null){
                nuevoNodo.padre = nodoAux;
                if(nuevoNodo.value >= nodoAux.value){
                    nodoAux = nodoAux.right;
                }else{
                    nodoAux = nodoAux.left;
                }
            }
            // System.out.println(nodoAux.value);
            if(nuevoNodo.value<nuevoNodo.padre.value){
                nuevoNodo.padre.left = nuevoNodo;
            }else{
                nuevoNodo.padre.right = nuevoNodo;
            }
        }
    }


    public static void recorrerPreOrden(Nodo n){
        if(n != null){
            System.out.println("El valor es: "+n.value);
            recorrerPreOrden(n.left);
            recorrerPreOrden(n.right);
        }
    }

    public static Treenode invertTree(Treenode arbol) {
        arbol.reverseTree(arbol.raiz);
        return arbol;
    }

    static void reverseTree(Nodo root) {
        if (root == null) {
            return;
        }
    
        final Treenode.Nodo temp = root.right;
        root.right = root.left;
        root.left = temp;
    
        reverseTree(root.left);
    
        reverseTree(root.right);
    }

    private class Nodo{
        public int value;
        public Nodo padre;
        public Nodo left;
        public Nodo right;

        public Nodo(int value){
        this.value = value;
        this.padre = null;
        this.right = null;
        this.left = null;
        }
    }
}
