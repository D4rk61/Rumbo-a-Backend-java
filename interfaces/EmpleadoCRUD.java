import java.util.ArrayList;
import java.util.List;
public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>();

    // Guardar un empleado
    public void guardar(Empleado empleado) {

        empleados.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleados;
    }
}
