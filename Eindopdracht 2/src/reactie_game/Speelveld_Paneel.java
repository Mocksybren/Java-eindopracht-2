package reactie_game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import java.util.Random;

public class Speelveld_Paneel extends Pane {
	private score_paneel scorePaneel;
	private Knop_Paneel knop_paneel;
	//object timelines
	Timeline timelinestart = new Timeline();
	private Timeline timeline;
	private KeyFrame keyframe;
	private Timeline timeline1;
	private KeyFrame keyframe1;
	private Timeline timeline2;
	private KeyFrame keyframe2;
	private Timeline timeline3;
	private KeyFrame keyframe3;
	//object timelines
	private Biljartbal bal;
	private Vierkant kant;
	private Rechthoek recht;
	private Ellipsse elips;
	private final int speelveldh = 680;
	private final int speelveldd = 800;
	private double x;
	private double y;
	private boolean isspelgestart = false;
	int c;
	int v;
	int r;
	int l;
	int cir = 0;
	int vie = 0;
	int rec = 0;
	int ecl = 0;
	int f = 0;
	int timelinecheck = 0;
	
	public Speelveld_Paneel() {
		//------------------------------
		Rectangle rechthoekS = new Rectangle(speelveldd,speelveldh);
		rechthoekS.setFill(Color.GREEN);
		//------------------------------
		this.getChildren().add(rechthoekS);
		//--------------
		
	}
		
	void cirkel() {
		//cirkel
				randomwaarde();
				//System.out.println("X1 Waarde is:"+ x);
				//System.out.println("Y1 Waarde is:"+ y);
				bal = new Biljartbal(x, y, 20, Color.RED, speelveldd, speelveldh);
				this.getChildren().add(bal);
				long startTime = System.currentTimeMillis();
				
				KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
					long elapsedTime = System.currentTimeMillis() - startTime;
					long miliseconde = elapsedTime % 1000;
			        long seconde = elapsedTime / 1000;
			        long minuten = seconde / 60;
			        seconde %= 60;
			        scorePaneel.updateTimeline1(minuten, seconde,miliseconde);
			    });

			    keyframe = new KeyFrame(Duration.millis(15), e -> {
			        bal.verplaats();
			    });
				
				timeline = new Timeline(keyframe,tijdUpdateKeyFrame);
				timeline.setCycleCount(Timeline.INDEFINITE);
				timeline.play();
				c = 1;
	}
	void vierkant() {
		//vierkant
				randomwaarde();
				//System.out.println("X2 Waarde is:"+ x);
				//System.out.println("Y2 Waarde is:"+ y);
				kant = new Vierkant(x, y, 40, 40, Color.BLUE, speelveldd, speelveldh);
				this.getChildren().add(kant);
				long startTime = System.currentTimeMillis();
				
				KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
					long elapsedTime = System.currentTimeMillis() - startTime;
					long miliseconde = elapsedTime % 1000;
			        long seconde = elapsedTime / 1000;
			        long minuten = seconde / 60;
			        seconde %= 60;
			        scorePaneel.updateTimeline2(minuten, seconde,miliseconde);
			    });
				keyframe1 = new KeyFrame(Duration.millis(15), e -> kant.verplaats() );
				timeline1 = new Timeline(keyframe1,tijdUpdateKeyFrame);
				timeline1.setCycleCount(Timeline.INDEFINITE);
				timeline1.play();
				v = 1;
	}
	void rechthoek() {
		//rechthoek
				randomwaarde();
				//System.out.println("X3 Waarde is:"+ x);
				//System.out.println("Y3 Waarde is:"+ y);
				recht = new Rechthoek(x, y, 75, 40, Color.YELLOW, speelveldd, speelveldh);
				this.getChildren().add(recht);
				long startTime = System.currentTimeMillis();
				
				KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
					long elapsedTime = System.currentTimeMillis() - startTime;
					long miliseconde = elapsedTime % 1000;
			        long seconde = elapsedTime / 1000;
			        long minuten = seconde / 60;
			        seconde %= 60;
			        scorePaneel.updateTimeline3(minuten, seconde,miliseconde);
			    });
				keyframe2 = new KeyFrame(Duration.millis(15), e -> recht.verplaats() );
				timeline2 = new Timeline(keyframe2,tijdUpdateKeyFrame);
				timeline2.setCycleCount(Timeline.INDEFINITE);
				timeline2.play();
				r = 1;
	}
	void eclipse() {
		//ellipse
				randomwaarde();
				//System.out.println("X4 Waarde is:"+ x);
				//System.out.println("Y4 Waarde is:"+ y);
				elips = new Ellipsse(x, y, 20, 40, Color.AQUA, speelveldd, speelveldh);
				this.getChildren().add(elips);
				long startTime = System.currentTimeMillis();
				
				KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
					long elapsedTime = System.currentTimeMillis() - startTime;
					long miliseconde = elapsedTime % 1000;
			        long seconde = elapsedTime / 1000;
			        long minuten = seconde / 60;
			        seconde %= 60;
			        scorePaneel.updateTimeline4(minuten, seconde,miliseconde);
			    });
				keyframe3 = new KeyFrame(Duration.millis(15), e -> elips.verplaats() );
				timeline3 = new Timeline(keyframe3,tijdUpdateKeyFrame);
				timeline3.setCycleCount(Timeline.INDEFINITE);
				timeline3.play();
				l = 1;
				}
	 void randomwaarde() {
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
	 void start() {
		 if (!isspelgestart) {
		 
		    KeyFrame keyframe = new KeyFrame(Duration.millis(1000), e -> {

		        if (cir != 1 && c == 0) {
		            cirkel();
		            //System.out.println(cir);
		        } else if (vie != 1 && v == 0) {
		            vierkant();
		        } else if (rec != 1 && r == 0) {
		            rechthoek();
		        } else if (ecl != 1 && l == 0) {
		            eclipse();
		        } else {
		        	reset();
		        	isspelgestart = false;
		        	timelinestart.stop();
		        }
		        
		    });
		    timelinestart.getKeyFrames().add(keyframe);
		    timelinestart.setCycleCount(Timeline.INDEFINITE);
		    timelinestart.play();
		    isspelgestart = true;
		 } 
		    	System.out.println(vie + ecl);
		    
	 }
	 void cirkelklik() {
		 if (c == 1) {
		 timeline.stop();
		 timeline.getKeyFrames().clear();
		 this.getChildren().remove(bal);
		 System.out.println("cirkel");
		 cir = cir + 1;
		 c = 0;
		 } else if (c == 0) {
			 f++;
			 scorePaneel.scoref_update(f);
		 }
	 }
	 void vierkantklik() {
		 if (v == 1) {
		 timeline1.stop();
		 timeline1.getKeyFrames().clear();
		 this.getChildren().remove(kant);
		 System.out.println("vierkant");
		 v = 0;
         vie = vie + 1;
		 } else if (v == 0) {
			 f++;
			 scorePaneel.scoref_update(f);
		 }
	 }
	 void rechthoekklik() {
		 if (r == 1) {
		 timeline2.stop();
		 timeline2.getKeyFrames().clear();
		 this.getChildren().remove(recht);
		 System.out.println("rechthoek");
		 r = 0;
         rec = rec + 1;
		 } else if (r == 0) {
			 f++;
			 scorePaneel.scoref_update(f);
		 }
	 }
	 void eclipseklik() {
		 if (l == 1) {
		 timeline3.stop();
		 timeline3.getKeyFrames().clear();
		 this.getChildren().remove(elips);
		 System.out.println("eclipse");
		 l = 0;
         ecl = ecl + 1;
		 } else if (l == 0) {
			 f++;
			 scorePaneel.scoref_update(f);
		 }
	 }
	 public void setScorePaneel(score_paneel scorePaneel) {
	        this.scorePaneel = scorePaneel;
	    }
	
	public void setKnopPaneel(Knop_Paneel knopPaneel) {
    this.knop_paneel = knopPaneel;
}
void reset() {
if (cir == 1 && vie == 1 && rec == 1 && ecl == 1) {
	cir = 0;
	vie = 0;
	rec = 0;
	ecl = 0;
	timelinestart.stop();
	timelinestart.getKeyFrames().clear();
	System.out.println("Test complete");
	knop_paneel.schakelknoppenuit();
	knop_paneel.schakelstartknopuit(false);
	//reset var en timeline 
	//tel gem score op
	}
}

public void setspelstart() {
	isspelgestart = true;
}
}

