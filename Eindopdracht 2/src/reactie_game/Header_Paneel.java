package reactie_game;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Header_Paneel extends StackPane{


	public Header_Paneel() {
		//maak titel van de game duidelijk
		Label scoreg = new Label();
		Label scoref = new Label();
		Label header = new Label();
		
		//------------------------------
		Rectangle rechthoek = new Rectangle(800,50);
		rechthoek.setFill(Color.PURPLE);

		//------------------------------
		header.setText("Reactie Spel");
		header.setFont(Font.font("Arial",30));
		header.setTextFill(Color.WHITE);

		//------------------------------
		scoreg.setText("SCORE: ");
		scoreg.setTextFill(Color.WHITE);
		scoreg.setFont(Font.font("Arial",26));
		scoreg.setTranslateX(225);
		
		//------------------------------
		scoref.setText("FOUTEN: ");
		scoref.setTextFill(Color.WHITE);
		scoref.setFont(Font.font("Arial",26));
		scoref.setTranslateX(-325);
		
		//------------------------------
		this.getChildren().addAll(rechthoek,header,scoreg,scoref);

	}
}
