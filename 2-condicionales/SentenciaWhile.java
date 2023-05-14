public class SentenciaWhile {
    public static void main(String[] args) {
     
        // uso del bucle while dentro de java 
        int contador = 0;
        boolean check = false;
        String user = "adminn";

        if (user == "admin") {
            check = true;
        } else {
            System.out.println("\nUsuario no encontrado, se notificara de su acceso");
        }

        while (check) {
            System.out.println("\nHola usuario admin como estas!");
            contador++;

            if (contador == 2) {
                break;
            }

        }
        System.out.println("\nFin del programa :D");
    }
}
