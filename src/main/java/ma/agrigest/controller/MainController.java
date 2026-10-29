package ma.agrigest.controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import javafx.geometry.Pos;



public class MainController {

    @FXML
    private BorderPane mainPane;

    @FXML
    public void initialize() {
        afficherPage("dashboard.fxml");
    }

    private void afficherPage(String nomPage) {
        try {
            URL url = getClass().getResource("/view/" + nomPage);

            if (url == null) {
                System.out.println("Page introuvable : " + nomPage);
                return;
            }

            FXMLLoader loader = new FXMLLoader(url);
            Parent page = loader.load();
            BorderPane.setAlignment(page, Pos.TOP_LEFT);
            mainPane.setCenter(page);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // min hna  ya d4ti 3la butin kai idik sfha akhra
    @FXML
    private void afficherDashboard() {
        afficherPage("dashboard.fxml");
    }

    @FXML
    private void afficherStock() {
        afficherPage("stock.fxml");
    }

    @FXML
    private void afficherExploitation() {
        afficherPage("exploitation.fxml");
    }

    @FXML
    private void afficherOuvriers() {
        afficherPage("ouvriers.fxml");
    }

    @FXML
    private void afficherTaches() {
        afficherPage("taches.fxml");
    }

    @FXML
    private void afficherDepenses() {
        afficherPage("depenses.fxml");
    }

    @FXML
    private void afficherRapports() {
        afficherPage("rapports.fxml");
    }
    @FXML
    private void afficherParametres() {
        afficherPage("parametres.fxml");
    }
}
