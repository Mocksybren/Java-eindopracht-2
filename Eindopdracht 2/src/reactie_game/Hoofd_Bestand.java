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
		Scene scene = new Scene(VBox, 800, 800);

		initLayout(VBox); //Layout verzorging
		primaryStage.setScene(scene);
		primaryStage.setMaxHeight(840);//vaste max hoogte
		primaryStage.setMaxWidth(820);//vaste max dikte
		primaryStage.setMinHeight(800);//vaste min hoogte
		primaryStage.setMinWidth(800);//vaste min dikte
		primaryStage.setTitle("Reactie spel");
		primaryStage.show();

	}

	private void initLayout(VBox VBox) {
		inittussenpaneel(VBox);
		initheaderpaneel(VBox);
		inittussenpaneel(VBox);
		initspeelveldpaneel(VBox);
		inittussenpaneel(VBox);
		initknoppaneel(VBox);
		inittussenpaneel(VBox);
		//aanroepen van layout
	}

	private void inittussenpaneel(VBox VBox) {
		VBox.getChildren().add(new Tussen_Paneel());//header paneel ophalen
	}
	
	private void initheaderpaneel(VBox VBox) {
		VBox.getChildren().add(new Header_Paneel());
	}
	
	private void initspeelveldpaneel(VBox VBox) {
		VBox.getChildren().add(new Speelveld_Paneel());
	}

	private void initknoppaneel(VBox VBox) {
		VBox.getChildren().add(new Knop_Paneel());
	}
	public static void main(String[] args) {
		launch(args); //app opstarten
	}
}
