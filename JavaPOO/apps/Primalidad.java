package apps;

import java.util.Scanner;

public class Primalidad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = leer.nextInt();
        if (esPrimo(numero)) {
            
        }
        
    }

    public static boolean esPrimo(int numero) {
        int contador = 0;
        int[] numeros = new int[numero];

        for (int item = 0; item < numeros.length; item++) {
            numeros[item] = item+1;
        }

        for (int item : numeros) {
            if (item == 1 || item == numero) {
                continue;
            }
            if (numero % item == 0) {
                contador++;
            }
        }
        return contador ==0;
    }
    
}
