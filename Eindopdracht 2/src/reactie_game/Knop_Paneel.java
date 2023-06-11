package reactie_game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Knop_Paneel extends StackPane {
	final Button knop;
	final Button knop1;
	final Button knop2;
	final Button knop3;
	final Button start;
	final Button herstart;
//Button namen koppelen
	// ------------------------------
	public Knop_Paneel() {
		Rectangle rechthoek = new Rectangle(1000, 50);
		rechthoek.setFill(Color.PURPLE);

		// ------------------------------
		knop = new Button("Cirkel");
		knop1 = new Button("Rechthoek");
		knop2 = new Button("Vierkant");
		knop3 = new Button("Ellipse");
		start = new Button("Start");
		herstart = new Button("Herstart");

		// ------------------------------
		//Positie bepaling
		// ------------------------------
		knop.setTranslateX(25);
		knop1.setTranslateX(-40);
		knop2.setTranslateX(82);
		knop3.setTranslateX(-105);
		start.setTranslateX(-300);
		herstart.setTranslateX(300);

		// ------------------------------
		//Positie bepaling
		// ------------------------------

		this.getChildren().addAll(rechthoek, knop, knop1, knop2, knop3, start, herstart);
	}

	public void schakelknoppenuit() { //methode voor andere methodes om knoppen uit te schakelen
		schakelCirkelknopuit(true);
		schakelRechthoekknopuit(true);
		schakelVierkantknopuit(true);
		schakelEllipseknopuit(true);
		schakelherstartknopuit(true);
	}

	public void schakelknoppenin() { //methode voor andere methodes om knoppen in te schakelen
		schakelCirkelknopuit(false);
		schakelRechthoekknopuit(false);
		schakelVierkantknopuit(false);
		schakelEllipseknopuit(false);
	}

	public void setopstartactie(EventHandler<ActionEvent> opstartknopactie) { //actie koppeling
		start.setOnAction(opstartknopactie);
	}

	public void setopherstartactie(EventHandler<ActionEvent> opherstartknopactie) { //actie koppeling
		herstart.setOnAction(opherstartknopactie);
	}

	public void cirkelklik(EventHandler<ActionEvent> cirkelklik) { //actie koppeling
		knop.setOnAction(cirkelklik);
	}

	public void vierkantklik(EventHandler<ActionEvent> vierkantklik) { //actie koppeling
		knop2.setOnAction(vierkantklik);
	}

	public void rechthoekklik(EventHandler<ActionEvent> rechthoekklik) { //actie koppeling
		knop1.setOnAction(rechthoekklik);
	}

	public void eclipseklik(EventHandler<ActionEvent> eclipseklik) { //actie koppeling
		knop3.setOnAction(eclipseklik);
	}

	public void schakelCirkelknopuit(boolean isDisabled) { //actie koppeling
		knop.setDisable(isDisabled);
	}

	public void schakelVierkantknopuit(boolean isDisabled) {
		knop1.setDisable(isDisabled);
	}

	public void schakelRechthoekknopuit(boolean isDisabled) {
		knop2.setDisable(isDisabled);
	}

	public void schakelEllipseknopuit(boolean isDisabled) {
		knop3.setDisable(isDisabled);
	}

	public void schakelstartknopuit(boolean isDisabled) {
		start.setDisable(isDisabled);
	}

	public void schakelherstartknopuit(boolean isDisabled) {
		herstart.setDisable(isDisabled);
	}
}