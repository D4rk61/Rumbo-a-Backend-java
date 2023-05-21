public class Main {
    public static void main(String[] args) {
        Router tplink1 = new Router("Claro", "Tp-link", "TP-link-2007Stable", 4, "Antena001", false, "admin", "admin",
                null, null);
        
        Router hola = new Router("Tigo", "Patito", "dsfkdskfdkf", 5, "AntenaAraña", false, "Fernanda", null, "1234", null);

        //tplink1.getInfo();

        //tplink1.mainLogin();
        hola.getInfo();
        hola.mainLogin();
    }
}