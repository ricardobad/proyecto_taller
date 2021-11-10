import javax.swing.JOptionPane;

public class Cliente {
    private static String Nombre;
    private int Telefono;

    

    /*public Cliente(String Nombre, int Telefono) {
        this.setNombre(Nombre);
        this.setTelefono(Telefono);
    }*/


    public static String getNombre() {
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
  
    //Metodo para pedir datos al usuario
    public void leerdatos(){

    Nombre=JOptionPane.showInputDialog("Digite su nombre completo con apellidos ");
    Telefono=Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de telefono :"));
} 


    
    
}