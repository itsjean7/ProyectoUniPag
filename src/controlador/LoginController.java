package controlador;

import java.io.IOException;

import conexion.Conexion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private Button btningre;

    @FXML
    private ImageView imgfondo;

    @FXML
    private Text lblcontra;

    @FXML
    private Text lblusuario;

    @FXML
    private PasswordField pswd;

    @FXML
    private TextField txtusuario;

    @FXML
    void click(ActionEvent event) throws IOException{
        try {
            Conexion cn = new Conexion();
            String n = txtusuario.getText();
            String n1 = pswd.getText();
            cn.validarlogin(txtusuario, pswd);

            
        } catch (Exception e) {
        }

    }

}