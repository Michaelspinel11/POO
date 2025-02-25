public class Moto extends AbsVehiculo {
    private int cantidadCauchos;

    public Moto(String datoPlaca, String datoModelo, String datoColor, int datoCauchos) {
        super(datoPlaca, datoModelo, datoColor);
        this.cantidadCauchos = datoCauchos;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Cantidad de cauchos es: " + this.cantidadCauchos);
    }
}

