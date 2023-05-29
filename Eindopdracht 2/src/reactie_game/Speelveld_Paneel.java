package reactie_game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
public class Speelveld_Paneel extends Pane {
	private final Timeline timeline;
	private final KeyFrame keyframe;
	private final Timeline timeline1;
	private final KeyFrame keyframe1;
	private final Timeline timeline2;
	private final KeyFrame keyframe2;
	private final Timeline timeline3;
	private final KeyFrame keyframe3;
	private final Biljartbal bal;
	private final Vierkant kant;
	private final Rechthoek recht;
	private final Ellipsse elips;
	public Speelveld_Paneel() {
		int speelveldh = 680;
		int speelveldd = 800;
		
		
		Rectangle rechthoekS = new Rectangle(speelveldd,speelveldh);
		rechthoekS.setFill(Color.GREEN);
		
		//------------------------------
		this.getChildren().add(rechthoekS);
		
		
		//cirkel
		bal = new Biljartbal(30, 40, 20, Color.RED, speelveldd, speelveldh);
		this.getChildren().add(bal);
		keyframe = new KeyFrame(Duration.millis(15), e -> bal.verplaats() );
		timeline = new Timeline(keyframe);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		//vierkant
		kant = new Vierkant(400, 400, 40, 40, Color.BLUE, speelveldd, speelveldh);
		this.getChildren().add(kant);
		keyframe1 = new KeyFrame(Duration.millis(15), e -> kant.verplaats() );
		timeline1 = new Timeline(keyframe1);
		timeline1.setCycleCount(Timeline.INDEFINITE);
		timeline1.play();
		
		//rechthoek
		recht = new Rechthoek(600, 120, 100, 40, Color.YELLOW, speelveldd, speelveldh);
		this.getChildren().add(recht);
		keyframe2 = new KeyFrame(Duration.millis(15), e -> recht.verplaats() );
		timeline2 = new Timeline(keyframe2);
		timeline2.setCycleCount(Timeline.INDEFINITE);
		timeline2.play();
		
		//ellipse
		elips = new Ellipsse(600, 120, 20, 40, Color.AQUA, speelveldd, speelveldh);
		this.getChildren().add(elips);
		keyframe3 = new KeyFrame(Duration.millis(15), e -> elips.verplaats() );
		timeline3 = new Timeline(keyframe3);
		timeline3.setCycleCount(Timeline.INDEFINITE);
		timeline3.play();
		}
		
		
	}

