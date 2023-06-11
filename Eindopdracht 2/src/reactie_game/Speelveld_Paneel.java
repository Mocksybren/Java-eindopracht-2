package reactie_game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;
import java.util.Random;
import javafx.scene.control.Label;

public class Speelveld_Paneel extends Pane {
	private score_paneel scorePaneel; // koppeling score_paneel
	private Knop_Paneel knop_paneel; // koppeling knop_paneel
	// object timelines
	Timeline timelinestart = new Timeline(); // timeline start
	private Timeline timeline;
	private KeyFrame keyframe;
	private Timeline timeline1;
	private KeyFrame keyframe1;
	private Timeline timeline2;
	private KeyFrame keyframe2;
	private Timeline timeline3;
	private KeyFrame keyframe3;
	// object timelines
	// objecten
	private Biljartbal bal;
	private Vierkant kant;
	private Rechthoek recht;
	private Ellipsse elips;
	// objecten
	// fixed parameters
	private final int speelveldh = 680; // hoogte
	private final int speelveldd = 800; // breedte
	private double x; // X- as
	private double y; // Y- as
	// fixed parameters
	private boolean isspelgestart = false; // spel start flag
	int cirkelcheck; // flag checker
	int vierkantcheck; // flag checker
	int rechthoekcheck; // flag checker
	int eclipsecheck; // flag checker
	int cir = 0; // Aantal figuren
	int vie = 0; // Aantal figuren
	int rec = 0; // Aantal figuren
	int ecl = 0; // Aantal figuren
	int fout = 0; // Aantal fouten
	double goed = 0; // Aantal goed
	Label speluitleg = new Label(); // uitleglabel maken

	public Speelveld_Paneel() {
		knop_paneel = new Knop_Paneel(); // knop_paneel koppeling
		// ------------
		// -----------
		// Label invullen
		speluitleg.setText("Welkom bij het reactie spel \n"
				+ "De bedoeling is dat je zo snel mogelijk de figuren weg klikt doormiddel van de onderstaande knoppen. \n"
				+ "Als je de verkeerde knop drukt dan wordt dit fout gezien. \n"
				+ "Er zijn vier figuren die op random verschijnen \n"
				+ "Hoe lager de score is, hoe beter je doet");
		speluitleg.setWrapText(true);
		speluitleg.setTextFill(Color.WHITE);
		speluitleg.setFont(Font.font("Arial", 16));
		speluitleg.setLayoutY((speelveldh - speluitleg.getHeight()) / 2);
		// ------------------------------
		Rectangle rechthoekS = new Rectangle(speelveldd, speelveldh);
		rechthoekS.setFill(Color.GREEN);
		// ------------------------------
		this.getChildren().addAll(rechthoekS, speluitleg);
		// --------------

	}

	// --------------------
	// Figuren
	// --------------------
	void cirkel() {
		// cirkel
		randomwaarde();
		// System.out.println("X1 Waarde is:"+ x);
		// System.out.println("Y1 Waarde is:"+ y);
		bal = new Biljartbal(x, y, 20, Color.RED, speelveldd, speelveldh);
		this.getChildren().add(bal);
		long startTijd = System.currentTimeMillis();

		KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
			long tijdverstreken = System.currentTimeMillis() - startTijd;
			long miliseconde = tijdverstreken % 1000;
			long seconde = tijdverstreken / 1000;
			seconde %= 60;
			scorePaneel.updateTimeline1(seconde, miliseconde);
		});

		keyframe = new KeyFrame(Duration.millis(15), e -> {
			bal.verplaats();
		});

		timeline = new Timeline(keyframe, tijdUpdateKeyFrame);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		cirkelcheck = 1;
	}

	void vierkant() {
		// vierkant
		randomwaarde();
		// System.out.println("X2 Waarde is:"+ x);
		// System.out.println("Y2 Waarde is:"+ y);
		kant = new Vierkant(x, y, 40, 40, Color.BLUE, speelveldd, speelveldh);
		this.getChildren().add(kant);
		long startTijd = System.currentTimeMillis();

		KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
			long tijdverstreken = System.currentTimeMillis() - startTijd;
			long miliseconde = tijdverstreken % 1000;
			long seconde = tijdverstreken / 1000;
			seconde %= 60;
			scorePaneel.updateTimeline2(seconde, miliseconde);
		});
		keyframe1 = new KeyFrame(Duration.millis(15), e -> kant.verplaats());
		timeline1 = new Timeline(keyframe1, tijdUpdateKeyFrame);
		timeline1.setCycleCount(Timeline.INDEFINITE);
		timeline1.play();
		vierkantcheck = 1;
	}

	void rechthoek() {
		// rechthoek
		randomwaarde();
		// System.out.println("X3 Waarde is:"+ x);
		// System.out.println("Y3 Waarde is:"+ y);
		recht = new Rechthoek(x, y, 75, 40, Color.YELLOW, speelveldd, speelveldh);
		this.getChildren().add(recht);
		long startTijd = System.currentTimeMillis();

		KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
			long tijdverstreken = System.currentTimeMillis() - startTijd;
			long miliseconde = tijdverstreken % 1000;
			long seconde = tijdverstreken / 1000;
			seconde %= 60;
			scorePaneel.updateTimeline3(seconde, miliseconde);
		});
		keyframe2 = new KeyFrame(Duration.millis(15), e -> recht.verplaats());
		timeline2 = new Timeline(keyframe2, tijdUpdateKeyFrame);
		timeline2.setCycleCount(Timeline.INDEFINITE);
		timeline2.play();
		rechthoekcheck = 1;
	}

	void eclipse() {
		// ellipse
		randomwaarde();
		// System.out.println("X4 Waarde is:"+ x);
		// System.out.println("Y4 Waarde is:"+ y);
		elips = new Ellipsse(x, y, 20, 40, Color.AQUA, speelveldd, speelveldh);
		this.getChildren().add(elips);
		long startTijd = System.currentTimeMillis();

		KeyFrame tijdUpdateKeyFrame = new KeyFrame(Duration.millis(1), e -> {
			long tijdverstreken = System.currentTimeMillis() - startTijd;
			long miliseconde = tijdverstreken % 1000;
			long seconde = tijdverstreken / 1000;
			seconde %= 60;
			scorePaneel.updateTimeline4(seconde, miliseconde);
		});
		keyframe3 = new KeyFrame(Duration.millis(15), e -> elips.verplaats());
		timeline3 = new Timeline(keyframe3, tijdUpdateKeyFrame);
		timeline3.setCycleCount(Timeline.INDEFINITE);
		timeline3.play();
		eclipsecheck = 1;
	}

	// --------------------
	// Figuren
	// --------------------
	// --------------------
	// start/random/reset/startflag
	// --------------------
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
			speluitleg.setText("");
			Random random = new Random();
			int interval = random.nextInt(4000) + 1000;
			KeyFrame keyframe = new KeyFrame(Duration.millis(interval), e -> {
				// System.out.println("cir :" + cir);
				// System.out.println("vie :" + vie);
				// System.out.println("rec :" + rec);
				// System.out.println("ecl :" + ecl);
				if (cir != 10 || vie != 10 || rec != 10 || ecl != 10) {
					randomswitch();
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
		} else if (cir == 10 && vie == 10 && rec == 10 && ecl == 10) {
			reset();
			isspelgestart = false;
			timelinestart.stop();
		}
	}

	void randomswitch() {
		Random random = new Random();
		int switchcase;
		switchcase = random.nextInt(4) + 1;

		switch (switchcase) {
		case 1:
			if (cir != 10 && cirkelcheck == 0) {
				cirkel();
				cir = cir + 1;
			}
			break;
		case 2:
			if (vie != 10 && vierkantcheck == 0) {
				vierkant();
				vie = vie + 1;
			}
			break;
		case 3:
			if (rec != 10 && rechthoekcheck == 0) {
				rechthoek();
				rec = rec + 1;
			}

			break;
		case 4:
			if (ecl != 10 && eclipsecheck == 0) {
				eclipse();
				ecl = ecl + 1;
			}
			break;
		}
	}

	void reset() {
		if (cir == 10 && vie == 10 && rec == 10 && ecl == 10) {
			cir = 0;
			vie = 0;
			rec = 0;
			ecl = 0;
			timelinestart.stop();
			timelinestart.getKeyFrames().clear();
			System.out.println("Test complete");
			knop_paneel.schakelknoppenuit();
			knop_paneel.schakelherstartknopuit(false);
			// reset var en timeline

			// tel gem score op
		}
	}

	public void setspelstart() {
		isspelgestart = true;
	}

	// --------------------
	// start/random/reset/startflag
	// --------------------
	// --------------------
	// Figuren klik
	// --------------------
	void cirkelklik() {
		if (cirkelcheck == 1) {
			timeline.stop();
			String timeline1string = scorePaneel.getTimeline1().replace(":", ".");
			double score = Double.parseDouble(timeline1string);
			timeline.getKeyFrames().clear();
			this.getChildren().remove(bal);
			// System.out.println("cirkel");
			cirkelcheck = 0;
			goed += score;
			System.out.println(goed);
			scorePaneel.scoreg_update(goed);
		} else if (cirkelcheck == 0) {
			fout++;
			scorePaneel.scoref_update(fout);
		}
	}

	void vierkantklik() {
		if (vierkantcheck == 1) {
			timeline1.stop();
			String timeline2string = scorePaneel.getTimeline2().replace(":", ".");
			double score = Double.parseDouble(timeline2string);
			timeline1.getKeyFrames().clear();
			this.getChildren().remove(kant);
			// System.out.println("vierkant");
			vierkantcheck = 0;
			goed += score;
			System.out.println(goed);
			scorePaneel.scoreg_update(goed);
		} else if (vierkantcheck == 0) {
			fout++;
			scorePaneel.scoref_update(fout);
		}
	}

	void rechthoekklik() {
		if (rechthoekcheck == 1) {
			timeline2.stop();
			String timeline3string = scorePaneel.getTimeline3().replace(":", ".");
			double score = Double.parseDouble(timeline3string);
			timeline2.getKeyFrames().clear();
			this.getChildren().remove(recht);
			// System.out.println("rechthoek");
			rechthoekcheck = 0;
			goed += score;
			System.out.println(goed);
			scorePaneel.scoreg_update(goed);
		} else if (rechthoekcheck == 0) {
			fout++;
			scorePaneel.scoref_update(fout);
		}
	}

	void eclipseklik() {
		if (eclipsecheck == 1) {
			timeline3.stop();
			String timeline4string = scorePaneel.getTimeline4().replace(":", ".");
			double score = Double.parseDouble(timeline4string);
			timeline3.getKeyFrames().clear();
			this.getChildren().remove(elips);
			// System.out.println("eclipse");
			eclipsecheck = 0;
			goed += score;
			System.out.println(goed);
			scorePaneel.scoreg_update(goed);
		} else if (eclipsecheck == 0) {
			fout++;
			scorePaneel.scoref_update(fout);
		}
	}

	// --------------------
	// Figuren klik
	// --------------------
	// --------------------
	// koppeling panelen
	// --------------------
	public void setScorePaneel(score_paneel scorePaneel) {
		this.scorePaneel = scorePaneel;
	}

	public void setKnopPaneel(Knop_Paneel knopPaneel) {
		this.knop_paneel = knopPaneel;
	}
	// --------------------
	// koppeling panelen
	// --------------------

}
