package reactie_game;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.text.DecimalFormat;

public class score_paneel extends Pane {
	Label scoreg = new Label();
	Label scoref = new Label();

	Label timeline1 = new Label();
	Label timeline2 = new Label();
	Label timeline3 = new Label();
	Label timeline4 = new Label();

	DecimalFormat decimalFormat = new DecimalFormat("#.##");

	public score_paneel() {
		// label aanmaak
		Label scoreglabel = new Label();
		Label scoreflabel = new Label();

		Label timeline1Label = new Label();
		Label timeline2Label = new Label();
		Label timeline3Label = new Label();
		Label timeline4Label = new Label();

		this.setPrefWidth(200);
		this.setStyle("-fx-background-color: gray;");

		// ------------------------------

		// --------------------------
		scoreglabel.setText("SCORE: ");
		scoreglabel.setTextFill(Color.WHITE);
		scoreglabel.setFont(Font.font("Arial", 26));
		scoreglabel.setTranslateY(50);

		scoreg.setText("0");
		scoreg.setTextFill(Color.WHITE);
		scoreg.setFont(Font.font("Arial", 26));
		scoreg.setTranslateY(75);

		// ------------------------------
		scoreflabel.setText("FOUTEN: ");
		scoreflabel.setTextFill(Color.WHITE);
		scoreflabel.setFont(Font.font("Arial", 26));
		scoreflabel.setTranslateY(100);

		scoref.setText("0");
		scoref.setTextFill(Color.WHITE);
		scoref.setFont(Font.font("Arial", 26));
		scoref.setTranslateY(125);

		// -----------------------------
		timeline1Label.setText("Cirkel: ");
		timeline1Label.setTextFill(Color.WHITE);
		timeline1Label.setFont(Font.font("Arial", 26));
		timeline1Label.setTranslateY(350);

		timeline1.setText("");
		timeline1.setTextFill(Color.WHITE);
		timeline1.setFont(Font.font("Arial", 24));
		timeline1.setTranslateY(375);

		timeline2Label.setText("Vierkant: ");
		timeline2Label.setTextFill(Color.WHITE);
		timeline2Label.setFont(Font.font("Arial", 26));
		timeline2Label.setTranslateY(400);

		timeline2.setText("");
		timeline2.setTextFill(Color.WHITE);
		timeline2.setFont(Font.font("Arial", 24));
		timeline2.setTranslateY(425);

		timeline3Label.setText("Rechthoek: ");
		timeline3Label.setTextFill(Color.WHITE);
		timeline3Label.setFont(Font.font("Arial", 26));
		timeline3Label.setTranslateY(450);

		timeline3.setText("");
		timeline3.setTextFill(Color.WHITE);
		timeline3.setFont(Font.font("Arial", 24));
		timeline3.setTranslateY(475);

		timeline4Label.setText("Ellipse: ");
		timeline4Label.setTextFill(Color.WHITE);
		timeline4Label.setFont(Font.font("Arial", 26));
		timeline4Label.setTranslateY(500);

		timeline4.setText("");
		timeline4.setTextFill(Color.WHITE);
		timeline4.setFont(Font.font("Arial", 24));
		timeline4.setTranslateY(525);

		this.getChildren().addAll(scoreglabel, scoreflabel, scoreg, scoref, timeline1Label, timeline2Label,
				timeline3Label, timeline4Label, timeline1, timeline2, timeline3, timeline4);

	}

	public void updateTimeline1(long seconde, long miliseconde) {
		String tijdString = String.format("%02d:%02d", seconde, miliseconde);
		timeline1.setText(tijdString);
	}

	public void updateTimeline2(long seconde, long miliseconde) {
		String tijdString = String.format("%02d:%02d", seconde, miliseconde);
		timeline2.setText(tijdString);
	}

	public void updateTimeline3(long seconde, long miliseconde) {
		String tijdString = String.format("%02d:%02d", seconde, miliseconde);
		timeline3.setText(tijdString);
	}

	public void updateTimeline4(long seconde, long miliseconde) {
		String tijdString = String.format("%02d:%02d", seconde, miliseconde);
		timeline4.setText(tijdString);
	}

	public void scoref_update(int score) {
		scoref.setText(Integer.toString(score));
	}

	public void scoreg_update(double score) {
		String rscore = decimalFormat.format(score);
		scoreg.setText(rscore);
	}

	public String getTimeline1() {
		return timeline1.getText();
	}

	public String getTimeline2() {
		return timeline2.getText();
	}

	public String getTimeline3() {
		return timeline3.getText();
	}

	public String getTimeline4() {
		return timeline4.getText();
	}

}
