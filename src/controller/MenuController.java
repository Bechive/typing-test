package controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.*;

public class MenuController extends Controller<Typee> {
    public final Typee getTypee() {return model;}

    @FXML
    public void handlePlay() throws Exception {
        ViewLoader.showStage(new Game(), "/view/game.fxml", "Game", new Stage());
    }
}
