public class CreacionVehiculos {
    public static void main(String[] args) {
        // Creacion de un objeto a partir de la clase "molde" creada anteriormente 
    


        // Estructura => 
        // Nombre de la clase   identificador   =   new     Nombre de la clase()

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, "negro", false, 0);

        System.out.println("Fabricante => " + fordMondeo.fabricante);
        fordMondeo.acelerar(40);

    }
    
}
