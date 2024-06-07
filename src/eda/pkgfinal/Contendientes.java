package eda.pkgfinal;

import java.util.ArrayList;
import java.util.Collections;

public class Contendientes {
    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<String> apellidos = new ArrayList<>();
    private ArrayList<Caballero> contendientes = new ArrayList<>();
    
    public Contendientes() {}
    
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
    
    public void cargarCaballerosAleatoreamente(int rondas) {
        contendientes.removeAll(contendientes);
        cargarNombres();
        cargarApellidos();
        
        for (int i = 0; i < Math.pow(2, rondas); i++) {
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
    
    public void cargarPoder(int rondas, int indiceGanador) {
        int contador = 0;
        int tamaño = 1;
        int reduccion = 1;
        Caballero cab = null;
        
        cab = contendientes.get(indiceGanador);
        cab.setPoder(rondas);
        contendientes.set(indiceGanador, cab);
        
        while (contador != contendientes.size()) {
            
            for (int i = 0; i < tamaño; i++) {
                if(contador == indiceGanador) {contador++;}
                
                cab = contendientes.get(contador);
                cab.setPoder(rondas-reduccion);
                contendientes.set(contador, cab);
                    
                contador++;
            }
            reduccion++;
            tamaño*=2;  
            
            if(tamaño == contendientes.size()) {break;}
        }  
        
        /*
        for (Caballero contendiente : contendientes) {
            System.out.println(contendiente.getNombre() + " " + contendiente.getPoder());
        }
        */
        
    }
    
    public void mostrarListaCaballeros() {
        for (int i = 0; i < contendientes.size(); i++) {
            System.out.println(i+1 + ". " + contendientes.get(i).getNombre());
        }
        System.out.println("");
    }

    public ArrayList<Caballero> getContendientes() {
        return contendientes;
    }
    
    
}
