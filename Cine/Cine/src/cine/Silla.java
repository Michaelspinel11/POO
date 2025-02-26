package cine;

public class Silla {
    private boolean ocupada;

    public Silla() {
        this.ocupada = false;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocupar() {
        if (!ocupada) {
            ocupada = true;
        }
    }
}
