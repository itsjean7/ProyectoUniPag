package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author paulg
 */
public class LoginController implements Initializable {

    @FXML
    private Button btningre;
    private TextField txtusuario;
    private TextField txtcontra;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
    @FXML 
    private void click(ActionEvent event){
    System.out.println("ingresado");

    }

    
}