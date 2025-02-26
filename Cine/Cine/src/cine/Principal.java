package cine;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala(5, 5); // Sala de 5x5 asientos
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Sistema de Reservas de Cine ---");
            System.out.println("1. Reservar asiento");
            System.out.println("2. Mostrar asientos");
            System.out.println("3. Repetir operación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese fila (0-4): ");
                    int fila = scanner.nextInt();
                    System.out.print("Ingrese columna (0-4): ");
                    int columna = scanner.nextInt();
                    sala.ocuparAsiento(fila, columna);
                    break;
                case 2:
                    sala.mostrarAsientos();
                    break;
                case 3:
                    System.out.println("Reiniciando...");
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
