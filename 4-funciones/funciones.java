// package 4-funciones;

public class funciones {
    public static void main(String[] args) {

        
        double y = 3;

        // Area de un circulo
        // pi * r2
        double area = circuleArea(y);

        // Area de una esfera 
        // 4*PI*r2

        System.out.println(); 

        // Volume de una esfera
        // (4/3)*PI*r3
        


    }

    // Aqui deben de estar las funciones 
    public static double circuleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double esferaArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double esferaVolume(double r) {
            return (4 / 3) * Math.PI * Math.pow(r, 3);
    }
}
