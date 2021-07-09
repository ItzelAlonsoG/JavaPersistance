import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class MensajesService {

    public static void CrearMensaje() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println(" Tu nombre: ");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();

        registro.setMensaje(mensaje);
        registro.setAutor(nombre);

        MensajesDAO.CrearMensajeDB(registro);
    }

    public static void ListarMensajes(){
        MensajesDAO.LeerMensajesDB();
    }

    public static void BorrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Indica el ID del mensaje a borrar: ");
        int id_mensaje = sc.nextInt();
        MensajesDAO.BorrarMensajeDB(id_mensaje);
    }

    public static void EditarMensaje() throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Escribe el nuevo mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println(" Indica el ID del mensaje a editar: ");
        int id_mensaje = sc.nextInt();



        Mensajes actualizacion = new Mensajes();

        actualizacion.setId(id_mensaje);
        actualizacion.setMensaje(mensaje);

        MensajesDAO.ActualizarMensajeDB(actualizacion);

    }

}
