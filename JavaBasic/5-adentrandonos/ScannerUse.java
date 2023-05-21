// package 5-adentrandonos;

import java.util.Scanner;



public class ScannerUse {
    public static void main(String[] args) {

        // Leer datos 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola querido usuario: " + nombre);


    }
    
    public static void input(String pregunta, String type, String save) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(pregunta);
        try {

            if (type == "String" || type == "string") {
                String save = scanner.nextLine();

            } else if (type == "Integer" || type == "Int" || type == "integer" || type == "int") {
                Int save = scanner.nextInt();
            } 

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return save;
    }
}
