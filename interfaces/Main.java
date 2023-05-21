import java.util.List;
public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 32, 12.000, true);
        Empleado maria = new Empleado("Maria", 22, 7.000, true);
        Empleado julian = new Empleado("Julian", 43, 10.000, true);
        Empleado marcos = new Empleado("Marcos", 40, 50.000, true);
    
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(maria);
        empleadoCRUD.guardar(julian);
        empleadoCRUD.guardar(marcos);


        // Consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
     
}