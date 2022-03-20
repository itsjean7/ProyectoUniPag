package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.MainLogin;


public class Conexion {
    public void validarlogin(String name, String pass) throws SQLException {

        //ManagerController mn = new ManagerController();
        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgresql";
        String password = "1234";

        //String name = "nombre";
        //String pass = "contraseña";

        String query = "INSERT INTO Usuarios (nombre, contraeña) VALUES (?, ?, ?)";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String verificarlogin ="select count (1) from usuario where name_user ='"+name+"' and  pass_user ='"+pass+"'";
        System.out.println("verificando string verigicarlogin");

        
        try {
            ps = con.prepareStatement("select count (1) from usuarios where nombre ='"+name+"' and  contraseña ='"+pass+"'");
            rs = ps.executeQuery();
            
            while (rs.next()){
                if(rs.getInt(1)==1){
                    System.out.println("Bienvendio");
                    main.MainLogin mv = new main.MainLogin();
                    mv.checkLogin("/vista/VistaLogin.fxml"); 
                }
                else{
                    System.out.println("Login invalido");
                }
            }
            
        } catch (Exception e) {
        }
        
    }
    public void validarlogin(TextField txtusuario, PasswordField pswd) {
        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgresql";
        String password = "1234";
        String query = "INSERT INTO Usuarios (nombre, contraeña) VALUES (?, ?, ?)";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
    }
    
}
