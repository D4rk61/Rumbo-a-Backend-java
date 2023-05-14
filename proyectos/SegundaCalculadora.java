package proyectos;

import java.util.Scanner;

public class SegundaCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            int seleccion = scanner.nextInt();

            if (seleccion >= 1 && seleccion <= 4) {
                System.out.println("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();

                int resultado = numbers(num1, num2, seleccion);
                System.out.println("El resultado es: " + resultado);
            } else {
                System.out.println("Selección inválida. Intente nuevamente.");
            }
        }
    }

    public static void menu() {
        System.out.println("\tMenu de Operaciones\n\n1-) Suma \n2-) Resta \n3-) Multiplicacion\n4-) Division");
        System.out.println("Seleccione una opción: ");
    }

    public static int numbers(int num1, int num2, int seleccion) {
        switch (seleccion) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
                return 0;
        }
    }
}

    

