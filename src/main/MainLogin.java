package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author paulg
 */
public class MainLogin extends Application {
    private static Stage esena;
    
    @Override
    public void start(Stage stage) throws Exception {
        esena = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/vista/VistaLogin.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
          launch(args);
    }
    
    public void checkLogin(String fxml) throws IOException{
        Parent root =  FXMLLoader.load(getClass().getResource(fxml));
        
        esena.getScene().setRoot(root);
    }
}