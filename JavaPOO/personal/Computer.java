package personal;

public class Computer {
    String modelo;
    String marca;
    String Procesador;
    int cantidadRAM;
    int cantidadAlmacenamiento;
    boolean GPU;
    String SO;
    double precio;


    // Creacion de un metodo constructor
    public Computer(String modelo, String marca, String Procesador, int cantidadRAM, int cantidadAlmacenamiento,
            boolean GPU, String SO, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.Procesador = Procesador;
        this.cantidadRAM = cantidadRAM;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.GPU = GPU;
        this.SO = SO;
        this.precio = precio;

    }
    
    // metodos getter 
    public String getAll() {
        String data = "Modelo: " + this.modelo + "\nMarca: " + this.marca + "\nProcesador: " + this.Procesador
                + "\nCantidad RAM: " + this.cantidadRAM + "\nCantidad Almacenamiento: " + this.cantidadAlmacenamiento
                + "\nGPU: " + this.GPU + "\nSO: " + this.SO + "\nPrecio: " + this.precio;

        return data;
    }
}
