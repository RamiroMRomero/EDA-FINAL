package eda.pkgfinal;

import java.util.ArrayList;
import java.util.Collections;

public class Contendientes {
    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<String> apellidos = new ArrayList<>();
    
    private ArrayList<Caballero> contendientes = new ArrayList<>();
    
    public Contendientes() {
        cargarNombres();
        cargarApellidos();
        cargarCaballeros();
    }
    
    private void cargarNombres() {
        nombres.add("Scott");
        nombres.add("Duncan");
        nombres.add("Harrys");
        nombres.add("Harold");
        nombres.add("Alexander");
        nombres.add("Finn");
        nombres.add("Connor");
        nombres.add("Kylian");
    }
    
    private void cargarApellidos() {
        apellidos.add("Ferguson");
        apellidos.add("Blackwood");
        apellidos.add("Carpenter");
        apellidos.add("Walker");
        apellidos.add("Hunter");
        apellidos.add("Dickson");
        apellidos.add("Hawthorne");
        apellidos.add("McKensie");
    }
    
    public void cargarCaballeros() {
        for (int i = 0; i < 8; i++) {
            Caballero caballero = new Caballero();
            
            Collections.shuffle(nombres);
            Collections.shuffle(apellidos);
            
            String nombreCaballero;
            
            nombreCaballero = nombres.get(0) + " " + apellidos.get(0);
            caballero.setNombre(nombreCaballero);
            contendientes.add(caballero);
            
            nombres.remove(0);
            apellidos.remove(0);
        }
    }
    
    public void mostrarListaCaballeros() {
        for (Caballero contendiente : contendientes) {
            System.out.println(contendiente.toString());
        }
        
        System.out.println("");
    }
    
    public void cargarPoder(int rondas) {
        int indice = 1;
        int contador = 0;
        int contadorcito = 0;
        Caballero cab = null;
        
        cab = contendientes.get(contadorcito);
        cab.setPoder(rondas);
        contendientes.set(contadorcito, cab);
        
        for(int i = 0 ; i < rondas ; i++) {
            for (int j = 0; j < indice; j++) {
                contadorcito++;
                
                while(indice/2 != 0) {
                    contador++;
                    indice /= 2;
                }
                indice = (indice*2)*contador;
                
                cab = contendientes.get(contadorcito);
                cab.setPoder((rondas-1)-contador);
                contendientes.set(contadorcito, cab);
            }
            indice*=2;
        }
        
    }
    
}
