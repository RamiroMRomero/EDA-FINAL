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

                case 2: break;

                case 3: break;

                case 4: return; 
            }

        }
    }
    
}
