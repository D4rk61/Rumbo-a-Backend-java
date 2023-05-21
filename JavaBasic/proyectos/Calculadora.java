// package proyectos;

import java.nio.channels.Selector;

public class Calculadora {
    public static void main(String[] args) {

        int selector = 0;
        int contador = 0;
        while (true) {
            menu();
            contador++;
            if (contador == 1) {
                break;
            }
            System.out.println();
        }
    }

    public static void menu() {
        System.out.println("\tMenu de Operaciones\n\n1-) Suma \n2-) Resta \n3-) Multiplicacion\n4-) Division");
    }

    public static int numbers(int num1, int num2, int selector) {
        
        switch (selector) {
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
