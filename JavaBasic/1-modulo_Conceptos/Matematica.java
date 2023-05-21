public class Matematica {
    public static void main(String[] args) {
        
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x)); // => Redondea hacia arriba
        
        System.out.println(Math.floor(x));  // => Redondea hacia abajo
    

        // elevar un numero a una potencia 

        int base = 5;
        int Exponente = 2;

        // potenciar un numero a otro
        System.out.println("\nLa potencia de 5**2 es igual a => " + Math.pow(base, Exponente));
    }
}
