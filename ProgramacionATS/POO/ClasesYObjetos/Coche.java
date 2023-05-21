public class Coche {
    // Metodos 
    String color;
    String marca;
    int km;

    // Metodos
    public static void main(String[] args) {
        // Creando objetos de la clase coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        // Asignando valores a los objetos
        coche1.color = "Azul";
        coche1.marca = "Ford";
        coche1.km = 100;

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 200;

        coche3.color = "Verde";
        coche3.marca = "Ferrari";
        coche3.km = 300;

        // Imprimiendo los valores
        System.out.println("Color: " + coche1.color);
    }
}