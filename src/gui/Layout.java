package gui;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.lang.Exception;

public class Layout {

  /**
   * Create a new instance of Layout
   * @param Stage stage
   */
  public Layout(Stage stage) {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Layout.fxml"));
    try {
      Parent view = (Parent) loader.load();

      // Get controller instance
      // Controller controller = loader.getController();

      this.createMainScene(stage, view);
    } catch (Exception err) {
      System.out.print(err);
    }
  }

  /**
   * Create the main scene
   * @param Stage  stage
   * @param Parent root
   */
  private void createMainScene(Stage stage, Parent view) {
    Scene scene = new Scene(view);
    stage.setScene(scene);
    stage.show();
  }

}
