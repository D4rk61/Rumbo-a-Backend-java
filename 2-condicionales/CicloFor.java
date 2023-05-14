public class CicloFor {
    public static void main(String[] args) {
        
        // uso del ciclo for dentro de java 
        for (int i = 0; i <= 10; i++) {
            System.out.println("[" + i + "] Hola mundo");

            if (i == 5) {
                System.out.println("\nEl programa ha llegado a 5! ");
                break;
            }
        }

    System.out.println("\nFin del bucle for");
    }
}
