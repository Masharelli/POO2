package figuras.increibles;

import java.awt.Color;
import java.awt.Graphics;

public class Texto extends Figura {

	public Texto(int x, int y, int tipo, Color color) {
		super(x, y, tipo, color);
	}

	@Override
	public void dibujar(Graphics g) {
		g.setColor(getColor());
		g.drawString("salu2", getX(), getY());
	}

}
