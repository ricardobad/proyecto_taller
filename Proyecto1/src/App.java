import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String op= "";
        op = JOptionPane.showInputDialog("SELECCIONE UNA OPCION: " +
         "\n 1- Ingresar Datos del Cliente \n 2- Ingresar Datos del Vehiculo " +
         "\n 3- Si necesita Servicio de Revision  \n4- Si necesita Servicio de Mantenimiento" +
         "\n 5- Si neceista Servicio de Reparacion \n 6- Salir");

         switch (op.toLowerCase()){
             case "1":{
                 System.out.println("INGRESAR DATOS: ");
             break;}

             case "2":{
                 System.out.println("INGRESAR DATOS DEL VEHICULO: ");
             break;}

             case "3":{
                 System.out.println("SERVICIO DE REVISION: ");
             break;}

             case "4":{
                 System.out.println("SERVICIO DE MANTENIMIENTO: ");
             break;}

             case "5":{
                 System.out.println("SERVICIO DE REPARACION");
             break;}
             
             case "6":{
                 

            break; }       
          }
        
    }
}
