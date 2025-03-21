package com.umg.curso.ejercicio1colas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio1Colas {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        int turno = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar turnos en espera");
            System.out.println("4. Salir");

            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            if (opcion == 1) {
                // Agregar cliente
                System.out.print("Ingrese el nombre del cliente: ");
                String nombre = scanner.nextLine();
                String cliente = "Turno " + turno + ": " + nombre;
                cola.add(cliente);
                System.out.println(cliente + " agregado a la cola.");
                turno++;
                
            } else if (opcion == 2) {
                // Atender cliente
                if (!cola.isEmpty()) {
                    String clienteAtendido = cola.poll();
                    System.out.println(clienteAtendido + " ha sido atendido.");
                } else {
                    System.out.println("No hay clientes en la cola.");
                }
                
            } else if (opcion == 3) {
                // Mostrar turnos en espera
                if (cola.isEmpty()) {
                    System.out.println("No hay turnos en espera.");
                } else {
                    System.out.println("Turnos en espera:");
                    for (String cliente : cola) {
                        System.out.println(cliente);
                    }
                }
            } else if (opcion == 4) {
                // Salir
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
