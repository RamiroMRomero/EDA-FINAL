package eda.pkgfinal;


public class Arbol {
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    
    public void insertarNodo(Nodo rz, Caballero valor, int rondas) {
        if(rondas == 0) { return; }
        
        if(rz.getIzq() == null || rz.getDer() == null) {
//            Ambos son null
            if(rz.getIzq() == null && rz.getDer() == null) {
                int aleatorio = (int) Math.round(Math.random());
                if(aleatorio == 1) {
                    rz.setIzq(new Nodo(valor));
                    insertarNodo(rz.getIzq(), valor, rondas-1);
                    return;
                } else {
                    rz.setDer(new Nodo(valor));
                    insertarNodo(rz.getDer(), valor, rondas-1);
                    return;
                }
            }
//            Solo uno es null
            if(rz.getIzq() == null) {
                rz.setIzq(new Nodo(valor));
                insertarNodo(rz.getIzq(), valor, rondas-1);
                return;
            } else {
                rz.setDer(new Nodo(valor));
                insertarNodo(rz.getDer(), valor, rondas-1);
                return;
            }

        } else {
//            Ninguno es null
            insertarNodo(rz.getIzq(), valor, rondas-1);
            insertarNodo(rz.getDer(), valor, rondas-1);
        }
        
    }
    
    public void anadirGanador(Caballero valor) {
        raiz = new Nodo(valor);
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    public int altura(Nodo raiz) {
        if(raiz == null) {
            return 0;
        }
        else {
            int laltura = altura(raiz.getIzq());
            int raltura = altura(raiz.getDer());
            
            if (laltura > raltura) {
                return laltura+1;
            } else { return raltura+1; }
            
            
        }
    }
    
    public void mostrarNivel(Nodo raiz, int nivel) {
        if(raiz == null) {
            return;
        } if(nivel == 1) {
            System.out.println(raiz.getValor().getNombre() + " ");
        }
        else if(nivel>1) {
            mostrarNivel(raiz.getIzq(), nivel-1);
            mostrarNivel(raiz.getDer(), nivel-1);
        }
    }
    
    public void mostrarNiveles() {
        int alt = altura(raiz);
        for (int i = 1; i <= alt; i++) {
            mostrarNivel(raiz,i);
            System.out.println("");
            
        }
    }
}
