package reactie_game;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Speelveld_Paneel extends StackPane {
	public Speelveld_Paneel() {
		Rectangle rechthoek = new Rectangle(800,680);
		rechthoek.setFill(Color.GREEN);
		
		//------------------------------
		this.getChildren().add(rechthoek);
	}
}
