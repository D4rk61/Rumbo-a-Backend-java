public class ArraysManejo {

    public static void main(String[] args) {
        
        // Manejo de arrays dentro de java
        // Almacenando notas de alumnos con una serie de 10 notas
        
        int[] notas = new int[10];


        // Otra forma 
        int[] notas2 = { 10, 11, 25, 15, 20 };
        // Crea un ejemplo de uso de un forEach con el array "notas2"



        // ForEach el array

        for (int item : notas2) {
            System.out.println(item);
        }
    }
    
}
