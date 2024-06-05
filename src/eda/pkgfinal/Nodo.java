package eda.pkgfinal;

public class Nodo {
    private Caballero valor;
    private Nodo izq;
    private Nodo der;

    public Nodo(Caballero valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    public Caballero getValor() {
        return valor;
    }

    public void setValor(Caballero valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
}
