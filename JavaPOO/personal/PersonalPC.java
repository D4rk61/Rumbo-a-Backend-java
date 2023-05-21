package personal;
public class PersonalPC {
    

    public static void main(String[] args) {
        Computer computer = new Computer("Undefied", "HP", "Intel", 8, 500, false, "linux", 200);

        System.out.println(computer.getAll()); 
    }
}