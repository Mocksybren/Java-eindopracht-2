package reactie_game;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class Rechthoek extends Rectangle {
	private final double maxX, maxY;
	private double dx, dy;
	private int x,y;

	public Rechthoek(int x, int y,int w,int h, Color kleur, double maxX, double maxY) {
		super(x, y,w,h);
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
		setFill(kleur);
		dx = 3 * Math.random() + 1;
		dy = 4 * Math.random() + 1;
	}

	public void verplaats() {
	    double xuit = x + dx;
	    double yuit = y + dy;

	    //Controleer of de rechthoek de linker- of rechtergrens raakt
	    if (xuit < 0 || xuit + getWidth() > maxX) {
	        dx = -dx;
	    }

	    //Controleer of de rechthoek de boven- of ondergrens raakt
	    if (yuit < 0 || yuit + getHeight() > maxY) {
	        dy = -dy;
	    }

	    //Werk de positie van de rechthoek bij
	    x += dx;
	    y += dy;

	    //Verplaats de rechthoek naar de nieuwe positie
	    setX(x);
	    setY(y);
	}

}