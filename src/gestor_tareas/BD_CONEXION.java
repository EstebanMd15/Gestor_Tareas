
package gestor_tareas;
import java.sql.Connection;
import java.sql.*;

public class BD_CONEXION {
   static String url = "jdbc:mysql://localhost:3306/Gestor_Tareas";
   static String user = "root";
   static String pass = "costos";
    
    public static Connection conectar(){
     Connection con = null;
     try
     {
     con = DriverManager.getConnection(url, user, pass);
         System.out.println("Conexion exitosa");
     }catch(SQLException e)
     {
      e.printStackTrace();
     }
    return con;
    }
    
   

}
