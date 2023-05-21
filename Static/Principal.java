package Static;

public class Principal {

    public static void main(String[] args) {

        Auto a1 = new Auto("XYZ123", "Tiaf", 31230, "Azul");
        Auto a2 = new Auto("XYZ234", "Dorf", 43145, "Rojo");
        Auto a3 = new Auto("XYZ345", "Geupor", 63161, "Verde");
        Auto a4 = new Auto("XYZ456", "Tiaf", 34136, "Verde");

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());
    }
}
