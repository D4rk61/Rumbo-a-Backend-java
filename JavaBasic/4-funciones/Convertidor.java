// package 4-funciones;

public class Convertidor {

    /**
     * Convetidor de monedas latinas a dolares con informacion actualizada (13 de mayo del 2023)
     * @param args
     * 
     */
    public static void main(String[] args) {
        System.out.println("\tConvertidor de monedas, monedas aceptadas: \n\nMX => Pesos Mexicanos\nQ => Quetzales \nCOL => Colones (Costarricense)");

        System.out.println("\nLa conversión es: " + convert("Q", 12.00));
    }

    public static double convert(String moneda, double cantidad) {
        double opt = 0; // Inicializamos opt con un valor válido
        if (moneda.equals("MX")) {
            opt = cantidad * 0.057;
        } else if (moneda.equals("Q")) {
            opt = cantidad * 0.13;
        } else if (moneda.equals("COL")) {
            opt = cantidad * 0.00185764;
        } else {
            // Manejo de error, puedes mostrar un mensaje o hacer algo en caso de que la moneda no sea reconocida
            System.out.println("Moneda no reconocida");
        }
        return opt; // Devolvemos el valor calculado
    }
}
