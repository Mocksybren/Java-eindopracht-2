package reactie_game;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Header_Paneel extends StackPane{


	public Header_Paneel() {
		//maak titel van de game duidelijk
		Label header = new Label();
		
		//------------------------------
		Rectangle rechthoek = new Rectangle(1000,50);
		rechthoek.setFill(Color.PURPLE);

		//------------------------------
		header.setText("Reactie Spel");
		header.setFont(Font.font("Arial",30));
		header.setTextFill(Color.WHITE);

		//------------------------------
		this.getChildren().addAll(rechthoek,header);

	}
}
