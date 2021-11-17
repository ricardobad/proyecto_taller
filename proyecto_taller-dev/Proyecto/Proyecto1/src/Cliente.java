import javax.swing.JOptionPane;

public class Cliente extends Persona {

    public static final String email = null;
    private String Marca;
    private String Placa;
    private String ProblemaVehiculo;

    public Cliente(String nombre) {
        super(nombre);
    }

    public Cliente(int telefono, String correo, String direccion, int cedula, String marca, String placa,
            String problemaVehiculo) {
        super(problemaVehiculo, telefono, correo, direccion, cedula);
        Marca = marca;
        Placa = placa;
        ProblemaVehiculo = problemaVehiculo;
    }

    public String getMarca() {
        return Marca;
    }

    public static void setMarca(String marca) {
        // Marca = marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public static void setPlaca(String placa) {
        // Placa = placa;
    }

    public String getProblemaVehiculo() {
        return ProblemaVehiculo;
    }

    public static void setProblemaVehiculo(String problemaVehiculo) {
        // ProblemaVehiculo = problemaVehiculo;
    }

    @Override
    public String toString() {
        return "Cliente [Marca=" + Marca + ", Placa=" + Placa + ", ProblemaVehiculo=" + ProblemaVehiculo + "]";
    }

}