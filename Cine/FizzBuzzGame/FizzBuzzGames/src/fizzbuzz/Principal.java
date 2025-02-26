package fizzbuzz;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FizzBuzz juego = new FizzBuzz();
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Explicación del juego");
            System.out.println("2. Jugar FizzBuzz");
            System.out.println("3. Volver a jugar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El juego recorre los números del 1 al 100.");
                    System.out.println("Si un número es múltiplo de 3, imprime 'Fizz'.");
                    System.out.println("Si es múltiplo de 5, imprime 'Buzz'.");
                    System.out.println("Si es múltiplo de ambos, imprime 'FizzBuzz'.");
                    break;
                case 2:
                    juego.jugar();
                    break;
                case 3:
                    System.out.println("Reiniciando el juego...");
                    juego.jugar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}

