import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame implements MouseInputListener {

	public Ventana() {
		
		setTitle("Dibujo");
		setSize(400, 400);
		setLocation(200, 200);
		
		addMouseMotionListener(this);
		addMouseListener(this);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.ORANGE);
		
		g.drawLine(10, 10, 100, 100);
		
		g.fillRect(20, 20, 100, 100);
		
		g.fillOval(150, 150, 100, 100);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		// down + up en un rango de tiempo
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// bajó el botón
		System.out.println(e.getX() + "");
		System.out.println(e.getY() + "");
		
		repaint();
		// solicitar repintado
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// subió el botón
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// entro en un área
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//salió del área
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//arrastrado - click + movimiento
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// movimiento - arrastrado - click
	}
	
	// recursividad - 2 opciones con return de valor y sin el
	public void contar(int inicio, int fin) {
		
		// caso base - cómo terminar la ejecución de la recursividad 
		if(inicio > fin)
			return;
		
		System.out.println(inicio);
		
		// invocar nuevamente considerando desplazamiento
		contar(inicio + 1, fin);
	}
	
	public int sumatoria(int inicio, int fin) {
		
		if(inicio == fin)
			return inicio;
		
		return inicio + sumatoria(inicio + 1, fin);
	}
	
}
