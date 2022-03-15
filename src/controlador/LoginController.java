package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author paulg
 */
public class LoginController implements Initializable {

    @FXML
    private Button btningre;
    @FXML
    private Label lblusuLabel;
    @FXML
    private Label lblcontrLabel;
    @FXML
    private TextField txtusuario;
    @FXML
    private PasswordField pswd;
    @FXML
    private ImageView imgfondo;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
    @FXML 
    private void click(ActionEvent event){
    System.out.println("ingresado");

    }

    
}