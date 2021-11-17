import javax.swing.*;

public class Servicio extends Cliente {

    public Servicio(int telefono, String correo, String direccion, int cedula, String marca, String placa,
            String problemaVehiculo, Cliente objeto1) {
        super(telefono, correo, direccion, cedula, marca, placa, problemaVehiculo);
    }

    static int Costo = 0;
    static int Garantia = 0;
    static int meses = 0;
    static int Cantidad = 0;

    public static void Revision() {
        String Descripcion;
        int Repuestos;

        Descripcion = JOptionPane.showInputDialog(null, "Informe del problema");
        Repuestos = JOptionPane.showConfirmDialog(null, "¿Requiere repuestos?");
        if (Repuestos == 0) {
            Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de Repuestos Requerida"));
        } else {

        }

    }

    public static void Mantenimiento(int Costo) {
        Costo = JOptionPane.showConfirmDialog(null, "¿Se cambia liquido de frenos?");
        if (Costo == 0) {
            suma();
        } else {

        }
        Costo = JOptionPane.showConfirmDialog(null, "¿Se cambia aceite?");
        if (Costo == 0) {
            suma();
        } else {

        }
        Costo = JOptionPane.showConfirmDialog(null, "¿Se cambia liquido refrigerante?");
        if (Costo == 0) {
            suma();
        } else {

        }

    }

    public static void Reparacion() {
        Garantia = JOptionPane.showConfirmDialog(null, "Aplica Garantia?");
        if (Garantia == 0) {
            meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la cantidad de meses de garantia"));
            Informe();
        } else {
            Informe();

        }

    }

    public static void Informe() {

        JOptionPane.showMessageDialog(null,
                "\t\tInforme Final\n\n\n" + "\t1. Cantidad de repuestos\n" + Cantidad + "\t2. Garantia \n" + Garantia
                        + " Cantidad de " + meses + " Meses " + "\t3. Costo total $\n" + (Costo * 100)
                        + "\tGRACIAS POR SU VISITA ");

    }

    public static void suma() {
        Costo = Costo + 1;

    }

}
