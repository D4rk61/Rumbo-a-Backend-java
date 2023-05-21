import java.util.Scanner;

public class SystemLogin {
    public static void main(String[] args) {
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\tInicio de Sesión\nIngresa tu usuario y contraseña para ingresar");
            System.out.println("\nIngresa tu nombre de usuario:");
            String user = scanner.nextLine();

            System.out.println("\nIngresa tu contraseña:");
            String password = scanner.nextLine();

            if (user.equals("admin") && password.equals("admin")) {
                break;
            } else {
                System.out.println("\nUsuario o contraseña incorrectos");
                contador++;

                if (contador == 3) {
                    System.out.println("\nSe notificará de tu ingreso...\nBuen día");
                    System.exit(contador);
                }
            }
        }

        stateAcount();
    }

    public static void stateAcount() {
        double saldo_total = 1000.00;

        while (true) {
            System.out.println("\nEstado de la cuenta del usuario \"user\"");
            System.out.println("\nSaldo total: Q." + saldo_total);

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("\n¿Qué deseas hacer?\n1- Retirar dinero\n2- Depositar\n3- Salir");
                String select1 = scanner.nextLine();

                if (select1.equals("1")) {
                    System.out.println("\n¿Cuánto dinero deseas retirar? (Debe ser menor o igual a " + saldo_total + ")");
                    double retirar = scanner.nextDouble();

                    if (retirar > saldo_total) {
                        System.out.println("\nOperación inválida....");
                    } else {
                        saldo_total = saldo_total - retirar;
                    }
                } else if (select1.equals("2")) {
                    System.out.println("\n¿Cuánto dinero deseas depositar? Saldo actual: " + saldo_total);
                    double depositar = scanner.nextDouble();
                    saldo_total = saldo_total + depositar;
                } else if (select1.equals("3")) {
                    System.out.println("\n¡Que tengas un excelente día, usuario!");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("\n\nError de dato...");
            }
        }
    }
}
