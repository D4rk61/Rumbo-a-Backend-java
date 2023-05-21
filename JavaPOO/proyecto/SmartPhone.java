public class SmartPhone extends SmartDevice {

    String procesador;
    int memoriaRAM;
    int almacenamiento;
    String camaraCapacidad;
    String conectividad;

    public SmartPhone(String procesador, int memoriaRAM, int almacenamiento, String camaraCapacidad,
            String conectividad) {
        super(camaraCapacidad, procesador, almacenamiento, almacenamiento, camaraCapacidad, memoriaRAM, conectividad,
                almacenamiento);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.camaraCapacidad = camaraCapacidad;
        this.conectividad = conectividad;

    }
    

}