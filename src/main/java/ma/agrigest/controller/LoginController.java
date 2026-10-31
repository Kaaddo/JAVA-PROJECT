
package ma.agrigest.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox rememberCheckBox;

    @FXML
    private Button loginButton;

    @FXML
    private Label messageLabel;

    @FXML
    private StackPane brandPanel;

    @FXML
    private ImageView farmImage;

    // Authentification
    @FXML
    private void handleLogin() {
        /*admin test ===================================================================*/
        String username = usernameField.getText().trim();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText(
                    "Veuillez remplir tous les champs."
            );
            return;
        }


        if (username.equals("admin")
                && password.equals("1234")) {

            try {
                URL url = getClass().getResource(
                        "/view/main.fxml"
                );

                if (url == null) {
                    messageLabel.setText(
                            "Fichier main.fxml introuvable."
                    );
                    return;
                }

                FXMLLoader loader = new FXMLLoader(url);
                Parent root = loader.load();

                Stage stage = (Stage) loginButton
                        .getScene()
                        .getWindow();

                stage.getScene().setRoot(root);
                stage.setTitle("AgriGest");

            } catch (IOException e) {
                e.printStackTrace();

                messageLabel.setText(
                        "Erreur lors du chargement."
                );
            }

        } else {
            messageLabel.setText(
                    "Identifiants incorrects."
            );

            passwordField.clear();
        }
    }
}
/*====================================================================*/