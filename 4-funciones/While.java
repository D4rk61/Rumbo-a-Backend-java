public class While {

    static boolean isTurnOnLigth = false;

    public static void main(String[] args) {
        // Ejemplo para ek ciclo while
        turnOnOffLigth();
        int contador = 1;
        while (isTurnOnLigth) {
            printSOS();
            contador++;
        }


    }
    
    public static void printSOS() {
        System.out.println("...___...");
    }

    public static boolean turnOnOffLigth() {
        isTurnLight = (isTurnLight)) ? false : true;
        return isTurnLight;
    }
}
