import java.util.ArrayList;
import java.util.List;

public class listas {

    private static List<String> nombre = new ArrayList<>();

    public static void main(String[] args) {
        
        add("Java");
        System.out.println("\n\tLista de Lenguajes\n");
        for(String item: nombre) {
            System.out.println(item);
        }
    }
    
    public static void add(String newItem) {
        nombre.add(newItem);

    }
}
