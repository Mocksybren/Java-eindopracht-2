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
		Scene scene = new Scene(VBox, 1000, 800);

		initLayout(VBox); //Layout verzorging
		primaryStage.setScene(scene);
		primaryStage.setMaxHeight(840);//vaste max hoogte
		primaryStage.setMaxWidth(1020);//vaste max dikte
		primaryStage.setMinHeight(800);//vaste min hoogte
		primaryStage.setMinWidth(1000);//vaste min dikte
		primaryStage.setTitle("Reactie spel");
		primaryStage.show();

	}

	private void initLayout(VBox VBox) {
		inittussenpaneel(VBox);
		initheaderpaneel(VBox);
		inittussenpaneel(VBox);
		HBox Scorepaneel = new HBox();
		initspeelveldpaneel(Scorepaneel);
	    initRightPane(Scorepaneel);
	    VBox.getChildren().add(Scorepaneel);
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
	
	private void initspeelveldpaneel(Pane parentPane) {
	    Speelveld_Paneel speelveld = new Speelveld_Paneel();
	    speelveld.setPrefWidth(800); // Set the preferred width of the "speelveld" pane
	    parentPane.getChildren().add(speelveld);
	}
	private void initRightPane(Pane parentPane) {
	    Pane rightPane = new Pane(); // Create a new pane for the right side content
	    rightPane.setPrefWidth(200); // Set the preferred width of the right pane
	    rightPane.setStyle("-fx-background-color: lightgray;"); // Set the background color of the right pane

	    parentPane.getChildren().add(rightPane);
	}

	private void initknoppaneel(VBox VBox) {
		VBox.getChildren().add(new Knop_Paneel());
	}
	public static void main(String[] args) {
		launch(args); //app opstarten
	}
}
