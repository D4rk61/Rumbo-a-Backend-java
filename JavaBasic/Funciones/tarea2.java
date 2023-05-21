package Funciones;

import java.util.Scanner;

public class tarea2 {
   public static void main(String[] args) {
    /* 
     * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
     * 
     */

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el precio (Sin IVA): ");
    double precio = scanner.nextDouble();
    System.out.println("El precio con el IVA incluido es: " + insertIVA(precio));

   } 

   public static double insertIVA(double precio) {
    return precio + (precio * 0.15);
   }
}
