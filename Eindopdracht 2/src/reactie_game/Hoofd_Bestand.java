package reactie_game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
//basis import van benodigede classes



public class Hoofd_Bestand extends Application {
	//variabelen declareren
	private Speelveld_Paneel speelveld;
	private Knop_Paneel knop_Paneel;
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
	
	private void initspeelveldpaneel(Pane Pane) {
	    speelveld = new Speelveld_Paneel();
	    score_paneel scorePaneel = new score_paneel();
	    knop_Paneel  = new Knop_Paneel();
	    speelveld.setScorePaneel(scorePaneel);
	    speelveld.setKnopPaneel(knop_Paneel);
	    speelveld.setPrefWidth(800); // limiteerd breedte aan van speelveld paneel
	    Pane.getChildren().addAll(speelveld,scorePaneel);
	}

	private void initknoppaneel(VBox VBox) {
		knop_Paneel = new Knop_Paneel();
		knop_Paneel.schakelknoppenuit();
		knop_Paneel.setopstartactie(opstartknopactie()); //actie koppelen
		knop_Paneel.cirkelklik(cirkelklik()); //actie koppelen
		knop_Paneel.vierkantklik(vierkantklik()); //actie koppelen
		knop_Paneel.rechthoekklik(rechthoekklik()); //actie koppelen
		knop_Paneel.eclipseklik(eclipseklik()); //actie koppelen
		VBox.getChildren().add(knop_Paneel);
	}
	public EventHandler<ActionEvent> opstartknopactie() { 							//start actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				speelveld.start();
				speelveld.setspelstart();
				knop_Paneel.schakelknoppenin();
				knop_Paneel.schakelstartknopuit(true);
				System.out.println("start");
			}
		};
	}
	public EventHandler<ActionEvent> cirkelklik() { 							//start actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				speelveld.cirkelklik();
			}
		};
	}
	public EventHandler<ActionEvent> vierkantklik() { 							//start actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				speelveld.vierkantklik();
			}
		};
	}
	public EventHandler<ActionEvent> rechthoekklik() { 							//start actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				speelveld.rechthoekklik();
			}
		};
	}
	public EventHandler<ActionEvent> eclipseklik() { 							//start actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				speelveld.eclipseklik();
			}
		};
	}
	
	public void reset() {
	speelveld.timelinestart.stop();
	speelveld.timelinestart.getKeyFrames().clear();
	}
	
	public static void main(String[] args) {
		launch(args); //app opstarten
	}
}	

