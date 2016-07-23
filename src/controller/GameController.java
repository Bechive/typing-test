package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;
import model.*;

public class GameController extends Controller<Game> {
  public final Game getGame() {return model;}

  @FXML TextField inputTf;

  @FXML
  public void initialize() {
      inputTf.setOnKeyReleased(event -> {
        if (event.getCode() == KeyCode.SPACE) {
          model.check(inputTf.getText().trim());
          inputTf.setText("");
        }
      });
  }
}
