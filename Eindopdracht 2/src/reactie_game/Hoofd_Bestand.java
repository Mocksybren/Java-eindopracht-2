package reactie_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
//basis import van benodigede classes

public class Hoofd_Bestand extends Application {
	//variabelen declareren
	//variabelen declareren

	//App opstart
	public void start(Stage primaryStage) {
		VBox VBox = new VBox();
		Scene scene = new Scene(VBox, 600, 600);

		initLayout(VBox); //Layout verzorging
		primaryStage.setScene(scene);
		primaryStage.setMaxHeight(600);//vaste hoogte
		primaryStage.setMaxWidth(600);//vaste dikte
		primaryStage.setTitle("Reactie spel");
		primaryStage.show();

	}

	private void initLayout(VBox VBox) {
		//aanroepen van layout
	}


	//private void inittussenpaneel(VBox VBox) {
		//header paneel ophalen
	//}

	public static void main(String[] args) {
		launch(args); //app opstarten
	}
}
