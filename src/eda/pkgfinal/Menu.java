package eda.pkgfinal;

import java.util.Scanner;

public class Menu {
    private Arbol arbol;
    private Contendientes contendientes;
    private static int rondas;
    private static Scanner scan = new Scanner(System.in);
    
    public Menu() {
        arbol = new Arbol();
        contendientes = new Contendientes();
        rondas = 3;
    }
    
    public void menuPrincipal() {
        boolean invalido;
        int seleccion = 0;
        
        while(true) {
            
            do {
                invalido = false;

                System.out.println("1. CELEBRAR TORNEO DE CABALLEROS DE LA MESA BINARIA");
                System.out.println("2. ELEGIR CANTIDAD DE RONDAS");
                System.out.println("3. VER LISTA DE PARTICIPANTES");
                System.out.println("4. SALIR");

                seleccion = scan.nextInt();
                scan.nextLine();            

                if (seleccion < 1 || seleccion > 4) {
                    System.out.println("");
                    System.out.println("Ingrese un numero entre 1 y 4");
                    System.out.println("");

                    invalido = true;
                }

            }
            while (invalido);


            switch (seleccion) {
                case 1: break;

                case 2: 
                    ElegirCantidadDeRondas();
                break;

                case 3: 
                    listaDeContendientes();
                break;

                case 4: return; 
            }

        }
    }
    
    private void ElegirCantidadDeRondas() {
        boolean invalido;
        int seleccion = 0;
        
        while(true) {
            
            do {
                invalido = false;

                System.out.println("1. UNA RONDA");
                System.out.println("2. DOS RONDAS");
                System.out.println("3. TRES RONDAS");
                System.out.println("4. SALIR");

                seleccion = scan.nextInt();
                scan.nextLine();            

                if (seleccion < 1 || seleccion > 4) {
                    System.out.println("");
                    System.out.println("Ingrese un numero entre 1 y 4");
                    System.out.println("");

                    invalido = true;
                }

            }
            while (invalido);
            
            if (seleccion == 4) {return;}
            
            rondas = seleccion;
        }
        
    }
    
    private void listaDeContendientes() {
        contendientes.cargarCaballerosAleatoreamente(rondas);
        
        boolean invalido;
        int seleccion = 0;
        int tamaño = contendientes.getContendientes().size();
        
        while(true) {
            
            do {
                invalido = false;
                System.out.println("DETERMINAR UN GANADOR:");
                contendientes.mostrarListaCaballeros();
                System.out.println(tamaño+1 + ". NO DETERMINAR UN GANADOR (ALEATORIO)");
                System.out.println(tamaño+2 + ". SALIR");
                seleccion = scan.nextInt();
                scan.nextLine();            

                if (seleccion < 1 || seleccion > tamaño+2) {
                    System.out.println("");
                    System.out.println("Ingrese un numero entre 1 y " + tamaño+2);
                    System.out.println("");

                    invalido = true;
                }
            }
            while (invalido);
            
            if (seleccion==tamaño+2) {
                return;
            }
            
            if (seleccion==tamaño+1) {
                contendientes.cargarPoder(rondas, (int) (Math.random() * tamaño));
            }
            else contendientes.cargarPoder(rondas, seleccion-1);
  
        }
        
    }
    
}