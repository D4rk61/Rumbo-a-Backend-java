public class SmarthWatch extends SmartDevice {
    String tipoPantalla;
    boolean resistenciaAgua;
    String sensores;
    String funcionalidades;

    public SmartWatch(String marca, String modelo, double precio, double pantallaSize, String color, double peso, String systemOperative, int capacidadBateria, String tipoPantalla, boolean resistenciaAgua, String sensores, String funcionalidades) {
        super(marca, modelo, precio, pantallaSize, color, peso, systemOperative, capacidadBateria);
        this.tipoPantalla = tipoPantalla;
        this.resistenciaAgua = resistenciaAgua;
        this.sensores = sensores;
        this.funcionalidades = funcionalidades;
    }
}