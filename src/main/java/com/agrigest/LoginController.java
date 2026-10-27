
        package com.agrigest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.geometry.NodeOrientation;

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
    private Hyperlink francaisButton;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label messageLabel;

    @FXML
    public void initialize() {
        setFrench();
    }

    @FXML
    private void setFrench() {
        welcomeLabel.setText("Bienvenue");
        descriptionLabel.setText("Connectez-vous pour continuer");
        usernameField.setPromptText("Nom d'utilisateur");
        passwordField.setPromptText("Mot de passe");
        rememberCheckBox.setText("Se souvenir de moi");
        loginButton.setText("Se connecter");
        messageLabel.setText("");
    }

    @FXML
    private void setArabic() {
        welcomeLabel.setText("مرحباً بكم");
        descriptionLabel.setText("سجل دخولك للمتابعة");
        usernameField.setPromptText("اسم المستخدم");
        passwordField.setPromptText("كلمة المرور");
        rememberCheckBox.setText("تذكرني");
        loginButton.setText("تسجيل الدخول");
        messageLabel.setText("");
    }

    @FXML
    private void handleLogin() {

        String username = usernameField.getText().trim();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Veuillez remplir tous les champs.");
            return;
        }

        // Exemple de connexion temporaire.
        // À remplacer par une vérification dans la base de données.

        if (username.equals("admin") &&
                password.equals("1234")) {

            messageLabel.setStyle("-fx-text-fill: #217A45;");
            messageLabel.setText("Connexion réussie !");

        } else {
            messageLabel.setStyle("-fx-text-fill: #B33A32;");
            messageLabel.setText(
                    "Nom d'utilisateur ou mot de passe incorrect."
            );
        }
    }
}
