package reactie_game;

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
	
	//------------------------------
	public Knop_Paneel() {
		Rectangle rechthoek = new Rectangle(1000,50);
		rechthoek.setFill(Color.PURPLE);
		
		//------------------------------
		knop = new Button("Cirkel");
		knop1 = new Button("Rechthoek");
		knop2 = new Button("Vierkant");
		knop3 = new Button("Ellipse");
		start = new Button("Start");
		
		//------------------------------
		knop.setTranslateX(25);
		knop1.setTranslateX(-40);
		knop2.setTranslateX(85);
		knop3.setTranslateX(-115);
		start.setTranslateX(-300);
		
		//------------------------------
		
		this.getChildren().addAll(rechthoek,knop,knop1,knop2,knop3,start);
	}
}
