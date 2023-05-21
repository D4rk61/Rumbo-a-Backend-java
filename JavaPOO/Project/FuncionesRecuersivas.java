public class FuncionesRecuersivas {
    public static void main(String[] args) {

        cuentaRegresiva(10);
        System.out.println("\nFin del bucle!");
    }
    
    static void cuentaRegresiva(int number) {
        while (true) {
            if (number == 0) {
                System.out.println("Numero no puede ser 0");
                break;
            }
            System.out.println("Conteo => " + number);
            number--;
        }
    }
}
