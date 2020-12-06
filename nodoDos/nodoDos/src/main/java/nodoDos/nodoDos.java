/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoDos;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class nodoDos {
    
    Scanner sc = new Scanner(System.in);
    // dentro del nodo se ocupo  un string tambien se puede manejar como voleanos, enteros,etc.
    static class Nodo {
        String dato;
        Nodo sig;  //es para podder seguir almacenando nodos dentro del mismo nodo como un ciclo infinito
    }
    
    Nodo fin = null; // declaracion del nodo donde se van a guardar todos los datos
    // dando un valor nulo

    public void agregar() {                              //metodo uno 
        Nodo temp; 
        String msg;
        System.out.println("agregar el dato "); // aqui va agregar un dato cuando se llame a la funcion 
        if (fin == null) { // inicio con las condiciones 
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine(); 
            temp.sig = fin;
            fin = temp; // fin va a contener lo que contiene temporal que es el dato que se acaba de meter y fin 
            
        }
    }

    public void mostrar() {                             // metodo dos
        Nodo actual = new Nodo(); // declaracion del nodo que es un objeto que se va a llamar actual 
        actual = fin; 
        if (fin != null) { // condiciones 
            while (actual != null) { 
                System.out.print(" DATO " + "[" + actual.dato + "]");
                actual = actual.sig; 
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n"); //
        }
    }
    public void eliminar(){ // metodo tres
        if (fin != null ){
            fin=fin.sig;
            
        }
        else{
            System.out.println("no se encuentra nada para poder eliminar");
        }
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        nodoDos n = new nodoDos();
        do {
            System.out.println("1 agregar  \n" // aqui se realizo un menu
                    + "2 mostrar \n"
                    + "3 eliminar \n "
                    + "4 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                case 3:
                     n.eliminar();
                    break;
            }
            
        } while (opt != 4);
    }
}
