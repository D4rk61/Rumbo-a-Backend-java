import java.util.Vector;

public class Vectores {
    //! Introduccion a vectores dentro de Java 
    public static void main(String[] args) {
        // Son como arrays, no le daremos un tamaño final, se ajustaran a los datos


        Vector<Integer> vector = new Vector<>(0);


        // Añadiendo datos a un vector

        vector.add(1);
        vector.add(2);
        vector.add(3);

        for (int item : vector) {
            System.out.println(item);
        }
    }
}