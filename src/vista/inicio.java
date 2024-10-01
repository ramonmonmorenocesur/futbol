package vista;
import java.util.Scanner;

public class inicio {
    
    public void menu (){
      Scanner teclado = new Scanner (System.in);
        System.out.println("El orden de creacion de elementos es ");
        System.out.println("1 liga 2EQUIPO , 3 JUG. 4 ENTRENADOR");

        System.out.println("*** CREACION DE LIGAS ***");
        System.out.println("Introduce opción");
        System.out.println("[1]Crear nueva liga ");
        System.out.println("[2] Siguiente (crear equipos )");
        int opcion = teclado.nextInt();
        switch(opcion){
         case 1:


            break;
        case 2 :

            break;
            default:
            System.out.println("introduce la opcion correcta");
        }
    }
}
