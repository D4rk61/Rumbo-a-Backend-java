public class User {
    String sudoUser = "admin";
    String passwordSudo = "admin";
    boolean checkSUDO = false;

    // Crear nuevos usuarios
    String newUser;
    String passwordUser;
    boolean checkNewUser = false;

    // Metodo constructor de este usuario

    public User(String sudoUser, String passwordSudo, String newUser, String passwordUser) {
        this.sudoUser = sudoUser;
        this.passwordSudo = passwordSudo;
        this.newUser = newUser;
        this.passwordUser = passwordUser;
    }


}


    

