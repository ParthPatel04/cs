import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
                             
public class UI extends Application{

	@Override
	public void start(Stage myStage){
		myStage.setTitle("Bug Run");

		VBox vbox = new VBox();
		HBox hbox = new HBox();
		TextField field = new TextField();
		Button button = new Button("Login");
		Label label = new Label("Play Offline");

		hbox.getChildren().addAll(field, button);
		vbox.getChildren().addAll(hbox, label);

		Scene scene = new Scene(vbox,300,300);
		myStage.setScene(scene);
		myStage.show();
	}
}