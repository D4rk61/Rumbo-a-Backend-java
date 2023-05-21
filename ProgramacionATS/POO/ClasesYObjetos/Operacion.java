import java.util.Scanner;

public class Operacion {
    // Atributos
    int numero1;
    int numero2;

    int suma;
    int resta;
    int multiplicacion;
    int division;
    // Metodos
    // Metodo para pedirle al usuario 2 numeros
    public void leerNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero [Primer numero]");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese otro numero [Segundo numero]");
        numero2 = scanner.nextInt();
        scanner.close();
    }

    public void sumar() {
        suma = numero1 + numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    public void dividir() {
        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por 0");
        }
    }

    public void todasOperaciones() {
        sumar();
        restar();
        multiplicar();
        dividir();
    }

    public void mostrarResultado() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
