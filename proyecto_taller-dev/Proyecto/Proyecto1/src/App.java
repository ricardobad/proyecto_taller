import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;
   
            //HAY QUE HACER UN DEFAULT POR SI SELECCIONA OTRA OPCION QUE NO ESTE EN EL MENU
            // TAMBIEN UN METODO QUE INDIQUE QUE TIENE QUE INGRESAR DATOS CLIENTE Y 
            //VEHICULO ANTES DE PASAR AL CLASE MECANICO

            //CREAR LAS CLASES MECANICA 1,2,3 

public class App {
    public static void main(String[] args) {

        String op= "";
        
        JOptionPane.showMessageDialog(null,"Bienvenido al Taller Los Patitos");
        
        Cliente nm = new Cliente();
        nm.leerdatos();
        System.out.println("Su nombre es "+ Cliente.getNombre());
        JOptionPane.showMessageDialog( null,"Su nombre es "+ Cliente.getNombre() );
        

        op = JOptionPane.showInputDialog("SELECCIONE UNA OPCION: " +
         "\n 1- Ingresar Datos del Cliente \n 2- Ingresar Datos del Vehiculo " +
         "\n 3- Si necesita Servicio de Revision  \n4- Si necesita Servicio de Mantenimiento" +
         "\n 5- Si necesita Servicio de Reparacion \n 6- Salir");

         switch (op.toLowerCase()){   
             case "1":{
                 System.out.println("INGRESAR DATOS: ");  //AQUI SE LLAMA A LA CLASE CLIENTE
             break;}

             case "2":{
                 System.out.println("INGRESAR DATOS DEL VEHICULO: ");  // AQUI SE LLAMA A LA CLASE VEHICULO
             break;}

             case "3":{
                 System.out.println("SERVICIO DE REVISION: "); // AQUI LA CLASE MECANICA 1
             break;}

             case "4":{
                 System.out.println("SERVICIO DE MANTENIMIENTO: ");  // AQUI LA CLASE MECANICA2
             break;}

             case "5":{
                 System.out.println("SERVICIO DE REPARACION"); // AQUI LA CLASE MECANICA3
             break;}
             
             case "6":{
                 

            break; }       
          }
        
    }
}
