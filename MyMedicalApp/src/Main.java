import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    
        System.out.println("\n");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient.name);
        System.out.println(patient.email);
    }



}
