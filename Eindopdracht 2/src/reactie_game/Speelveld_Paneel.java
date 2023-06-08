package reactie_game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.Random;
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
	private final int speelveldh = 680;
	private final int speelveldd = 800;
	private double x;
	private double y;
	public void randomwaarde() {
							    Random random = new Random();
							    do {
							        x = random.nextDouble() * speelveldd;
							        y = random.nextDouble() * speelveldh;
						
							        if (x < 20) {
							            x = 20;
							        }
							        if (x > 720) {
							            x = 720;
							        }
							        if (y < 40) {
							            y = 40;
							        }
							        if (y > 620) {
							            y = 620;
							        }
							    } while (x < 20 || y < 40 || x > 720 || y > 620);
								}

	public Speelveld_Paneel() {
		//------------------------------
		Rectangle rechthoekS = new Rectangle(speelveldd,speelveldh);
		rechthoekS.setFill(Color.GREEN);
		//------------------------------
		this.getChildren().add(rechthoekS);
		//--------------
		//cirkel
		randomwaarde();
		System.out.println("X1 Waarde is:"+ x);
		System.out.println("Y1 Waarde is:"+ y);
		bal = new Biljartbal(x, y, 20, Color.RED, speelveldd, speelveldh);
		this.getChildren().add(bal);
		keyframe = new KeyFrame(Duration.millis(15), e -> bal.verplaats() );
		timeline = new Timeline(keyframe);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		//vierkant
		randomwaarde();
		System.out.println("X2 Waarde is:"+ x);
		System.out.println("Y2 Waarde is:"+ y);
		kant = new Vierkant(x, y, 40, 40, Color.BLUE, speelveldd, speelveldh);
		this.getChildren().add(kant);
		keyframe1 = new KeyFrame(Duration.millis(15), e -> kant.verplaats() );
		timeline1 = new Timeline(keyframe1);
		timeline1.setCycleCount(Timeline.INDEFINITE);
		timeline1.play();
		
		//rechthoek
		randomwaarde();
		System.out.println("X3 Waarde is:"+ x);
		System.out.println("Y3 Waarde is:"+ y);
		recht = new Rechthoek(x, y, 75, 40, Color.YELLOW, speelveldd, speelveldh);
		this.getChildren().add(recht);
		keyframe2 = new KeyFrame(Duration.millis(15), e -> recht.verplaats() );
		timeline2 = new Timeline(keyframe2);
		timeline2.setCycleCount(Timeline.INDEFINITE);
		timeline2.play();
		
		//ellipse
		randomwaarde();
		System.out.println("X4 Waarde is:"+ x);
		System.out.println("Y4 Waarde is:"+ y);
		elips = new Ellipsse(x, y, 20, 40, Color.AQUA, speelveldd, speelveldh);
		this.getChildren().add(elips);
		keyframe3 = new KeyFrame(Duration.millis(15), e -> elips.verplaats() );
		timeline3 = new Timeline(keyframe3);
		timeline3.setCycleCount(Timeline.INDEFINITE);
		timeline3.play();
		}
		
	
	
	
	}

