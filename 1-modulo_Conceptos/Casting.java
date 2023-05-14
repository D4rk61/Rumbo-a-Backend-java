public class Casting {
    public static void main(String[] args) {
        
        // Cast => En la programación hay situaciones donde necesitamos cambiar el tipo de dato de nuestras variables, esto lo conocemos como Cast.
    

        // En un año encontre 30 perritos, pero no recuerdo cuantos fueron en un mes

        double PerrosAlMes = 30.0/12.0;
        System.out.println(PerrosAlMes); //! Pero aqui nos devuelve un float, y eso no nos sirve
        
        //* Estimacion */
        
        int estacionMensual = (int) PerrosAlMes;
        System.out.println(estacionMensual);    // Concirtiendo un tipo de dato :D 

    }
}
