package eda.pkgfinal;

public class EDAFINAL {
    public static void main(String[] args) { 
        
        Arbol arbol = new Arbol();
        
        Caballero cab1 = new Caballero("Joseph", 3);
        
        
        arbol.anadirGanador(cab1);
        
        arbol.insertarNodo(arbol.getRaiz(), cab1, 3);
        arbol.mostrarNiveles();
        
        System.out.println("/////////");
        
        Caballero cab2 = new Caballero("Pepe", 2);
        arbol.insertarNodo(arbol.getRaiz(), cab2, 3);
        arbol.mostrarNiveles();
        
        System.out.println("/////////");
        
        Caballero cab3 = new Caballero("Juan", 1);
        arbol.insertarNodo(arbol.getRaiz(), cab3, 3);
        arbol.mostrarNiveles();
        
        System.out.println("/////////");
        
        Caballero cab4 = new Caballero("Ramon", 0);
        arbol.insertarNodo(arbol.getRaiz(), cab4, 3);
        arbol.mostrarNiveles();
        
        System.out.println("");
        
        arbol.mostrarNivel(arbol.getRaiz(), 4);
        
//        Menu menu = new Menu(); 
//        
//        menu.menuPrincipal();
    }
}
