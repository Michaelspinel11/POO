package cine;

public class Sala {
    private boolean[][] asientos;

    public Sala(int filas, int columnas) {
        asientos = new boolean[filas][columnas];
    }

    public void mostrarAsientos() {
        System.out.println("Estado actual de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] ? "[X] " : "[O] ");
            }
            System.out.println();
        }
    }

    public boolean ocuparAsiento(int fila, int columna) {
        if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos[0].length) {
            if (!asientos[fila][columna]) {
                asientos[fila][columna] = true;
                System.out.println("Asiento reservado con éxito.");
                return true;
            } else {
                System.out.println("El asiento ya está ocupado.");
                return false;
            }
        } else {
            System.out.println("Ubicación fuera de rango.");
            return false;
        }
    }
}
