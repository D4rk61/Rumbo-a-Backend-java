import java.util.Scanner;

public class Router extends User {

    String ISP;
    String marca;
    String modelo;
    int cantidadPuertos = 1;
    boolean puertoRedTelefonia;
    String modeloAntena;
    boolean WPScompatible;
    int lucesPuertos = 1;


    // Constructor de la clase Router
    public Router(String ISP, String marca, String modelo, int cantidadPuertos, String modeloAntena, boolean WPScompatible, String sudoUser, String passwordSudo, String newUser, String passwordUser) {
        super("", "", "", "");
        this.ISP = ISP;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadPuertos = cantidadPuertos;
        this.modeloAntena = modeloAntena;
        this.WPScompatible = WPScompatible;
        this.sudoUser = "admin";
        this.passwordSudo = "admin";
        this.newUser = "";
        this.passwordUser = "";

    }


    //! Creacion de algunos metodos! 


    // Método para actualizar las luces de los puertos
    public void actualizarLucesPuertos() {
        lucesPuertos = cantidadPuertos;
    }

    // Metodo Get para informacion superficial
    public void getInfo() {
        System.out.println("\tInformación de su Router:\n");
        System.out.println("Proveedor de internet: " + ISP);
        System.out.println("Marca de su Router: " + marca);
        System.out.println("Cantidad de Puertos Ethernet: " + cantidadPuertos);
        System.out.println("Modelo de antena de su Router: " + modeloAntena);
        System.out.println("WPScompatible: " + isWPSCompatible());
    }

    // Método para obtener el estado de compatibilidad con WPS
    private String isWPSCompatible() {
        if (WPScompatible) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public void mainLogin() {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n\tIncio de sesion en el Router: " + modelo);
            System.out.println("Veces ingresadas: " + contador);
            System.out.print("\n\nIngrese su nombre de usuario: ");
            String username = scanner.nextLine();
        
            System.out.print("Ingrese su contraseña: ");
            String password = scanner.nextLine();


            // Confirmando al usuario
            if (username.equals(sudoUser ) && password.equals(passwordSudo) || username.equals(newUser) && password.equals(passwordUser)) {
                System.out.println("\nIncio de Sesion exitoso, bienvenido!\n");
                break;
            } else {
                System.out.println("\n!--Usuario o contraseña incorrecto--!\n");
                contador++;
            }


            if (contador == 3) {
                System.out.println("!!--Seras notificado de tu acceso--!!");
                break;
            }
        }
        scanner.close();

    }


    public boolean checkSudoUser() {
        if (sudoUser.equals(newUser) && passwordSudo.equals(passwordUser)) {
            checkSUDO = true;
        }
        return checkSUDO;
    }

    // Opciones dentro del router

    public void RouterMenu() {
        while (true) {
            System.out.println("");
        }
    }

    // Dentro del router
    public void IntoRouter() {
        
    }
}


