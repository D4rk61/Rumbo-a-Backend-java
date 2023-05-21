public abstract class SmartDevice {
    String marca;
    String modelo;
    double precio;
    double pantallaSize;
    String color;
    double peso;
    String systemOperative;
    int capacidadBateria;

    public SmartDevice(String marca, String modelo, double precio, double pantallaSize, String color, double peso, String systemOperative, int capacidadBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.pantallaSize = pantallaSize;
        this.color = color;
        this.peso = peso;
        this.systemOperative = systemOperative;
        this.capacidadBateria = capacidadBateria;
    }
}