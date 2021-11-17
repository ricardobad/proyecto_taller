import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String op;

        JOptionPane.showMessageDialog(null, "Bienvenido al Taller Los Patitos" + "\n Digite los datos del cliente");
        // Creé una variable que se llama name para poder inyectarla al setNombre de
        // Persona

        String name = JOptionPane.showInputDialog(null, "Digite nombre de Cliente : ");
        Persona.setNombre(name);
        Cliente name1 = new Cliente(name);
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Cedula sin guiones : "));
        Persona.setCedula(id);
        int phone = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero telefono : "));
        Persona.setTelefono(phone);
        String email = JOptionPane.showInputDialog(null, "Digite el correo electronico : ");
        Persona.setCorreo(email);
        String address = JOptionPane.showInputDialog(null, "Digite direccion física : ");
        Persona.setDireccion(address);
        String brand = JOptionPane.showInputDialog(null, "Digite marca de Vehiculo: ");
        Cliente.setMarca(brand);
        String idcar = JOptionPane.showInputDialog(null, "Digite placa de Vehiculo: ");
        Cliente.setPlaca(idcar);
        String issue = JOptionPane.showInputDialog(null, "Digite Descripcion problema de Vehiculo: ");
        Cliente.setProblemaVehiculo(issue);
        JOptionPane.showMessageDialog(null,
                        "DATOS DEL CLIENTE :" + "\n Nombre: " + name + "\n Cedula: " + id + "\n Telefono: " + phone
                                + "\n Correo Electronico: " + email + "\n Direccion: " + address
                                + "\n DATOS DE VEHICULO: " + "\n Marca: " + brand + "\n Placa: " + idcar
                                + "\n Problemas del vehiculo: " + issue);

        do {
            op = JOptionPane.showInputDialog("SELECCIONE UNA OPCION: "
                    + "\n 1- Servicio de Revision Básica \n 2- Servicio de Mantenimiento Rutinario "
                    + "\n 3- Servicio de Reparación   \n 4- Salir");

            switch (op.toLowerCase()) {
            case "1": {
                System.out.println("Servicio de Revision Básica : "); // SE INVOCA EL METODO REVISION

                Servicio.Revision();

                break;
            }

            case "2": {
                System.out.println("Servicio de Mantenimiento Rutinario: "); // SE INVOCA EL METODO MANTENIMIENTO
                Servicio.Mantenimiento(0);

                break;
            }

            case "3": {
                System.out.println("Servicio de Reparacion: "); // SE INVOCA EL METODO DE REPARACION
                Servicio.Reparacion();
                
                break;
            }

            }
        } while (!op.equals("4"));

    }
}
