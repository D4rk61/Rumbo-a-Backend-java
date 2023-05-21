import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Uso de do-while dentro de java 

        int select = 0;
        do {
            System.out.println("\tSelecciona un numero\n1. Peliculas \n2. Series\n3. Salir del menu");

            Scanner sc = new Scanner(System.in);
            select = Integer.valueOf(sc.nextLine());

            switch(select) {
                case 1:
                    System.out.println("Peliculas");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 3:
                    System.out.println("Salir del menu");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (select != 3); // condicion para mostrar el menu
        System.out.println("\nSe termino el programa");
    }   
}
