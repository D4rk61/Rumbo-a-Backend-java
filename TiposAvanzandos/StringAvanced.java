public class StringAvanced {
    public static void main(String[] args) {
        String cadena;
        cadena = "Hola mundo";        

        // Obteniendo el numero de caracteres
        System.out.println(cadena.length());

        System.out.println();

        // Recorriendo una cadena
        for (char c: cadena.toCharArray()) {
            System.out.println(c);
        }

    }
}

