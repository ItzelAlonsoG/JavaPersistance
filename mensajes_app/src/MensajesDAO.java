import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void CrearMensajeDB (Mensajes mensaje) throws SQLException {
        Connect dbConnect = new Connect();

        try(Connection conexion = dbConnect.get_connection()){

            PreparedStatement ps = null;

            try{

                String query="INSERT INTO mensajes (mensaje, autor_mensaje ) VALUES (?,?)";


                ps = conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutor());


                ps.executeUpdate();

                System.out.println("mensaje creado");

            }catch (SQLException e){
                e.printStackTrace();
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void LeerMensajesDB(){
        Connect dbConnect = new Connect();

        try(Connection conexion = dbConnect.get_connection()){

            PreparedStatement ps = null;
            ResultSet rs = null;

            String query = "SELECT * FROM mensajes";

            ps = conexion.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("-------------------------------------------");
                System.out.println(" ID: " + rs.getInt("id_mensaje"));
                System.out.println(" Mensaje: " +rs.getString("mensaje"));
                System.out.println(" Autor: " + rs.getString("autor_mensaje"));
                System.out.println(" Fecha: " + rs.getString("fecha_mensaje"));
            }

        } catch(SQLException e){

        e.printStackTrace();

        }
    }

    public static void BorrarMensajeDB (int id_mensaje){
        Connect dbConnect = new Connect();

        try(Connection conexion = dbConnect.get_connection()){

            PreparedStatement ps = null;
            try{
                String query =  "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,id_mensaje);
                ps.executeUpdate();
                System.out.println("el mensaje ha sido borrado");
            }catch (SQLException j){
                j.printStackTrace();
            }

        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("no se pudo borrar mensaje");
        }
    }

    public static void ActualizarMensajeDB(Mensajes mensaje) throws SQLException {
        Connect dbConnect = new Connect();

        try (Connection conexion = dbConnect.get_connection()) {

            PreparedStatement ps = null;

            try {
                String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId());

                ps.executeUpdate();
                System.out.println("mensaje se ha actualizado correctamente");
            } catch (SQLException j) {
                j.printStackTrace();
                System.out.println("no se pudo actualizar el mensaje");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
