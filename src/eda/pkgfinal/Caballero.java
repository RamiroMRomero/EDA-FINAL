package eda.pkgfinal;

public class Caballero {
    String nombre;
    int poder;

    public Caballero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int Poder) {
        this.poder = Poder;
    }

    @Override
    public String toString() {
        return "Caballero{" + "nombre=" + nombre + ", Poder=" + poder + '}';
    }
    
}
