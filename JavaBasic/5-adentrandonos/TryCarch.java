// package 5-adentrandonos;

public class TryCarch {
    public static void main(String[] args) {
        // Manejo de errores con try-catch y finally

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fin");
        }
    }  
}
