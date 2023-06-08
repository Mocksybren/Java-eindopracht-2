package reactie_game;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tussen_Paneel extends StackPane{

	public Tussen_Paneel(){
		//Maak tussen paneel "ook wel een border lijn"
		Rectangle rechthoek = new Rectangle(1000,5);
		rechthoek.setFill(Color.BLACK);

		this.getChildren().add(rechthoek);
	}
}