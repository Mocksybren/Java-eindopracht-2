package reactie_game;

import javafx.scene.shape.Circle;
import javafx.scene.paint.*;

public class Biljartbal extends Circle {
	private final int straal;
	private final double maxX, maxY;
	private double dx, dy;

	public Biljartbal(int x, int y, int straal, Color kleur, double maxX, double maxY) {
		super(x, y, straal);
		this.straal = straal;
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
		if ((getCenterX() < straal) || (getCenterX() >= maxX - straal))
			dx = -dx;
// Als je voorbij de onder- of bovenkant bent, draai dan de y-richting om
		if ((getCenterY() >= maxY - straal) || (getCenterY() < straal))
			dy = -dy;
	}
}