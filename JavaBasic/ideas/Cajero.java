import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);

        int conteo = 0;

        do {
            try {
                System.out.println("\tPorfavor ingresa tus Credenciales");

                System.out.println("Ingresa tu nombre de usuario: ");
                String userName = scanner.nextLine();

                System.out.println("\nIngresa tu contraseña: ");
                String passwordInput = scanner.nextLine();

                int password = Integer.parseInt(passwordInput); // Convertir a entero

                if (userName.equals("admin") && password == 1234) {
                    condition = false;
                } else {
                    System.out.println("\n\nUsuario o contraseña incorrecta\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nDato incorrecto\n");
            }
            conteo++;
            if (conteo == 3) {
                System.out.println("\nDemasiados intentos, se notificará de su ingreso... \nFeliz dia");
                System.exit(0);
            }
        } while (condition);

        System.out.println("\nInicio de sesión exitoso. Bienvenido.");

    }
}


/*  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingresa tu nombre: ");
        String nombre = scanner.nextLine();
 */
