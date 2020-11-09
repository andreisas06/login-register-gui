package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button cancelButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private ImageView brandingImageView;

    @FXML
    private ImageView lockImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        File brandingFile = new File("Pictures/login_register.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("Pictures/lock-icon-transparent-background-19.jpg");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockImageView.setImage(lockImage);
    }

    public void loginButtonOnAction(ActionEvent event){
        loginMessageLabel.setText("You tried to login");
    }

    public void cancelButtonOnAction(ActionEvent event){

        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();

    }

}
