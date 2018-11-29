import java.awt.Color;
import java.util.LinkedList;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import figuras.increibles.*;

public class AreaDibujo extends JPanel implements MouseListener {
	
	private ConfiguradorDibujo config;
	private LinkedList<Figura> figuras;

	public LinkedList<Figura> getFiguras(){ return figuras;}
	
	public AreaDibujo(ConfiguradorDibujo config) {
		
		addMouseListener(this);
		this.config = config;
		figuras = new LinkedList<>();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		// agregar varios dibujos es cuestión de manejar el arreglo figuras
		for(int i = 0; i < figuras.size(); i++) {
			
			figuras.get(i).dibujar(g);
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		switch(config.getFigura()) {
		
			case ConfiguradorDibujo.CIRCULO:
				figuras.add(new Circulo(
						e.getX(), 
						e.getY(), 
						ConfiguradorDibujo.CIRCULO, 
						config.getColor()));
				break;
			
			case ConfiguradorDibujo.RECTANGULO:
				figuras.add(new Rectangulo(
						e.getX(), 
						e.getY(), 
						ConfiguradorDibujo.RECTANGULO, 
						config.getColor()));
				break;
			
			case ConfiguradorDibujo.TEXTO:
				figuras.add(new Texto(
						e.getX(), 
						e.getY(), 
						ConfiguradorDibujo.TEXTO, 
						config.getColor()));
				break;
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited");
		
	}
}
