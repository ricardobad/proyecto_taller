
public class Cliente {
    private String Nombre;
    private int Telefono;

    public Cliente(String Nombre, int Telefono) {
        this.setNombre(Nombre);
        this.setTelefono(Telefono);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        this.Telefono = telefono;
    }
  


    
    
}