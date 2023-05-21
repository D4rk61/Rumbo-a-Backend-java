// package 2-condicionales;

public class IfElse {
    public static void main(String[] args) {
    
        // Estructuras de control if-else 
        
        int num1 = 100;
        int num2 = 20;
        boolean check = num1 < num2; 

        // Condicional

        if (check) {
            System.out.println(num1 + " Si es menor a " + num2); 
        } else {
            System.out.println(num1 + " No es menor a " + num2);
        }
    
        System.out.println("\nFinal del programa");
    }
}
