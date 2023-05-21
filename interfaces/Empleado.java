public class Empleado {

    // Atributos
    String nombre;
    int edad;
    double salario;
    boolean activo;

    // constructores
    public Empleado() {}

    public Empleado(String nombre, int edad, double salario, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
    }
    
    // Metodo toString del constructor anterior
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", activo=" + activo + '}';
    }
    
}
