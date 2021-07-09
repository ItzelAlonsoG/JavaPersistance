import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do{
            System.out.println("-------------------------------------------");
            System.out.println( "Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje ");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");

            // leemos la opcion del usuario

            opcion = sc.nextInt();

            switch (opcion){

                case 1:
                    MensajesService.CrearMensaje();
                    break;
                case 2:
                    MensajesService.ListarMensajes();
                    break;
                case 3:
                    MensajesService.BorrarMensaje();
                    break;
                case 4:
                    MensajesService.EditarMensaje();
                    break;

                default:
                    break;
            }

        }while(opcion != 5);

    }
}
