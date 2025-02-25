
public class AbsVehiculo {
    private String placa;
    private String modelo;
    private String color;

    // Constructor
    public AbsVehiculo(String datoPlaca, String datoModelo, String datoColor) {
        this.placa = datoPlaca;
        this.modelo = datoModelo;
        this.color = datoColor;
    }

    // Getters y Setters
    public void setColor(String datoColor) {
        this.color = datoColor;
    }

    public String getColor() {
        return this.color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("La placa es: " + this.placa);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("El color es: " + this.color);
    }
}
