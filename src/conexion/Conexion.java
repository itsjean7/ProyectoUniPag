 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    public static void writeToDatabase(String nombre, String contraseña){
        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgresql";
        String password = "1234";

        String name = nombre;
        String pass = contraseña;

        String query = "INSERT INTO Usuarios (nombre, contraeña) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(parameterIndex 1, name);
                pst.setString(parameterIndex 2, pass);
                pst.executeUpdate();
                System.out.println("Coneccion Creada");
            
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }


    }
    
}
