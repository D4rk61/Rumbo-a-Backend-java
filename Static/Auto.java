package Static;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double descuento;

    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        Auto.descuento = 0; // Apunta a la clase
    }

    public double precioPromocional() {
        return this.precio - this.precio * Auto.descuento / 100;
    }

    @Override
    public String toString() {
        return "Auto{" + patente + "," + marca + "," + precio + "," + color + "}";
    }
}
