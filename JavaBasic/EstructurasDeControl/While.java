public class While {
    public static void main(String[] args) {
        int contador = 0;
        while (true) {
            System.out.println("[" + contador + "] Ciclooooo");
            contador++;
            if (contador == 10) {
                break;
            }
        }
        System.out.println("\nFin del bucle!");
    }
    
}
