public class Vehiculo {

    //! Estructura | atributos 
    String fabricante;
    String modelo;
    double ce;
    int año;
    String color;
    boolean sport; // => Modo deportivo?
    double velocidad;

    
    //! Constructores | Plantillas
    public Vehiculo() {
        // Metodo constructor, Vacio

    }

    public Vehiculo(String fabricante, String modelo, double ce, int año, String color, boolean sport,
            double velocidad) {
        // Metodo constructor, Pasando datos por parametros
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ce = ce;
        this.año = año;
        this.color = color;
        this.sport = sport;
        this.velocidad = 0;
    }
    

    //! Metodos | acciones => comportamiento

    public void acelerar(int cantidad_inicial) {

        while (true) {
            if (cantidad_inicial >= 30) {
                System.out.println("No se puede acelerar de esa manera");
                break;
            } else {
                this.velocidad += cantidad_inicial;
            }

            System.out.println("Velocidad => " + cantidad_inicial);

            cantidad_inicial++;
            if (cantidad_inicial == 200) {
                System.out.println("Velocidad maxima alcanzada " + cantidad_inicial);
                break;
            }
        }

    }

}
