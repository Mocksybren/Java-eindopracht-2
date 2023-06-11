package reactie_game;

import javafx.scene.shape.Ellipse;
import javafx.scene.paint.*;

public class Ellipsse extends Ellipse {
	private final int straalx, straaly;
	private final double maxX, maxY;
	private double dx, dy;

	public Ellipsse(double x, double y, int straalx, int straaly, Color kleur, double maxX, double maxY) {
		super(x, y, straalx, straaly);
		this.straalx = straalx;
		this.straaly = straaly;
		this.maxX = maxX;
		this.maxY = maxY;
		final RadialGradient gradient = new RadialGradient(0, 0, .35, .35, .5, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, Color.WHITE), new Stop(1.0, kleur));
		this.setFill(gradient);
		dx = 3 * Math.random() + 1;
		dy = 4 * Math.random() + 1;
	}

	public void verplaats() {
		setCenterX(getCenterX() + dx);
		setCenterY(getCenterY() + dy);
// Als je voorbij de linker- of rechterkant bent, draai dan de x-richting om
		if ((getCenterX() < straalx) || (getCenterX() >= maxX - straalx))
			dx = -dx;
// Als je voorbij de onder- of bovenkant bent, draai dan de y-richting om
		if ((getCenterY() >= maxY - straaly) || (getCenterY() < straaly))
			dy = -dy;
	}
}