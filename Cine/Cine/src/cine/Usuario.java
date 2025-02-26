package cine;

public class Usuario extends Persona {
    public Usuario(String nombre, int edad) {
        super(nombre, edad);
    }

    public void reservarAsiento(Sala sala, int fila, int columna) {
        sala.ocuparAsiento(fila, columna);
    }
}

