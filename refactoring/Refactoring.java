public class Refactoring {
    String name;
    double salary;
    String cargo;
    boolean importante;

    public Refactoring(String name, int salary, String cargo, boolean importante) {
        this.name = name;
        this.salary = salary;
        this.cargo = cargo;
        this.importante = importante;

    }



    // Creando instancias 

    public static void main(String[] args) {
        Refactoring user1 = new Refactoring("Jose", 3000, "Ing. Software", true);


        System.out.println("Segun tu cargo tu antiguo salario es " + user1.salary + " Ahora sera de: " + user1.calcSalary());
    }



    // Metodo para calcular algo random en su salario
    public double calcSalary() {
        if (importante == true) {
            return salary * 1.2;
        } else if (importante && salary >= 4000) {
            return salary * 0.2;
        }

        return salary;


    }
}