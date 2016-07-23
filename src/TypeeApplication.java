import javafx.application.Application;
import javafx.stage.Stage;
import model.*;

public class TypeeApplication extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Typee typee = new Typee();
    ViewLoader.showStage(typee, "/view/menu.fxml", "Menu", stage);
  }
}
