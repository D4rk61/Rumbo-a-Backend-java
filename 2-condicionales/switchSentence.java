import javax.print.DocFlavor.STRING;

public class switchSentence {
    public static void main(String[] args) {
        // uso de la sentencia switch dentro de java, sentencia similar a if-else 

        String clima = "Invierno";

        System.out.println("\t\nclima actual: " + clima + "");
        switch (clima) {
            case "Verano":
                System.out.println("\nHora de ir a la playaaaa");
                break;

            case "Otoño":
                System.out.println("\nVe a ver los arboles <3");
                break;

            case "Invierno":
                System.out.println("\nAbrigate por el frio");
                break;

            default:
                System.out.println("\nQue clima esta por tu area? ");

        }
    }
}
