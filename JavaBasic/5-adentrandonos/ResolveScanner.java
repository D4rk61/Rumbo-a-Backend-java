import java.util.Scanner;

public class ResolveScanner {
    public static void main(String[] args) {
        String nombre = inputString("Por favor ingresa tu nombre: ");
        System.out.println("Hola querido usuario: " + nombre);

        int edad = inputInt("¿Cuál es tu edad? ");
        System.out.println("Tu edad es: " + edad);
    }

    public static String inputString(String pregunta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta);
        return scanner.nextLine();
    }

    public static int inputInt(String pregunta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0; // Valor por defecto si ocurre algún error
    }
}
