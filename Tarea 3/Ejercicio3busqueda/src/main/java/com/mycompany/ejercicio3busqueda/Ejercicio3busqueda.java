package com.mycompany.ejercicio3busqueda;

import static com.mycompany.ejercicio3busqueda.Ejercicio3busqueda.BinarySearch.busquedaBinaria;
import java.util.Scanner;
public class Ejercicio3busqueda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] listaOrdenada = {1, 3, 5, 7, 9, 11, 13, 15};
        
        System.out.println("Su lista de números es la siguiente: ");
        
        for (int i =0; i<8; i++){
        
            System.out.println("Dato en la posicion " + i + ": " + listaOrdenada[i]);
        
        }
        System.out.println("Escoja el número que desea buscar: ");
        int objetivo = scanner.nextInt();
        System.out.println("Se encuentra en el indice: " + busquedaBinaria(listaOrdenada, objetivo));
        
        
        
    }
    
    public class BinarySearch {
    public static int busquedaBinaria(int[] lista, int objetivo) {
        int izquierda = 0, derecha = lista.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            
            if (lista[medio] == objetivo) {
                return medio;
            } else if (lista[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        
        return -1;
    }
    }
}
