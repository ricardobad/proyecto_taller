import javax.swing.JOptionPane;

public class Persona {
    // Aqui van los datos que son comunes en mecanicos, clientes)
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;
    private int cedula;
    
    public Persona(){
    }
    
    public Persona(String nombre, int telefono, String correo, String direccion, int cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.cedula = cedula;
    }
    
public Persona(){
    this.nombre="Desconocido";
}


    public Persona(String nombre){
        this.nombre=nombre;
            }
    public String getNombre() {
           return nombre;
    }
    //Aqui agregué static al metodo, eliminé el this, asi puede editarlo desde cualquier otro lado
    public static void setNombre(String nombre) {
        //this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public static void setTelefono(int telefono) {
        //this.telefono = telefono;
    }
    public  String getCorreo() {
        return correo;
    }
    public static void insercion(){

        String email = JOptionPane.showInputDialog(null, "Digite direccion de correo : ");
        Persona.setCorreo(email);
        return;
    }
    public static void setCorreo(String correo) {
        //this.correo = correo;
    }
    public String getDireccion() {
        return direccion;
    }
    public static void setDireccion(String direccion) {
        //this.direccion = direccion;
    }
    public int getCedula() {
        return cedula;
    }
    public static void setCedula(int cedula) {
        //this.cedula = cedula;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
      


}
