package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author paulg
 */
public class LoginController implements Initializable {

    @FXML
    private Button btningre;
    //private TextField txtusuario;
    //private TextField txtcontra;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtUser;
    @FXML
    private Label lblStatus;
    @FXML
    private AnchorPane txtcontrasenha;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
    
    @FXML
    private void eventAction (ActionEvent event) throws Exception {
        if (txtUser.getText().equals("user")&& txtPassword.getText().equals("user")){
            lblStatus.setText("Contraseña Correcta");
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("vista/FXMLBuscador.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();
        }else {
            lblStatus.setText("Contraseña Incorrecta");

        }
    }

    
}