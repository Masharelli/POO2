import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelDibujo extends JPanel implements Runnable {
	private int xV, yV;

	
	private Image fondo;
	private String strNombre;
	private boolean movimiento = false;
	private Color globo; // el tipo de variable es color
	private int xt,yt;
	
	public PanelDibujo() {
		super();
		this.addMouseListener(new MouseAdapter() {
			
			@Override
		
				public void mouseClicked(MouseEvent e) {
					
					System.out.println("Se dio click en "+e.getX() + " , " +e.getY());
					movimiento = true;	
				}
			
		});
		
		
		
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				xt = e.getX();
				yt = e.getY();
				repaint();
			}
			
		});
		this.setPreferredSize(new Dimension(800, 600));
		this.globo = Color.RED;
		this.xV = this.yV = 0;
		
		this.xt = 110;
		this.yt = 570;
		this.fondo=new ImageIcon("Fondo pocoyo.jpg").getImage();
		this.strNombre="Pocoyo";
		
		Thread hilo = new Thread(this);
		hilo.start();

	}
	
	public void setNombre(String nombre) {
		this.strNombre=nombre;
		this.repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(this.fondo, 0, 0, this.getWidth(), this.getHeight(), this);
		
		g.setColor(Color.ORANGE);
		g.fillOval(50 + this.xV, 500 + this.yV, 200, 100);
			
		g.setColor(Color.CYAN);
		g.fillArc(50 + this.xV, 500 + this.yV, 200, 100, 0,100);
		
		g.setColor(Color.black);
		g.drawLine(100 + this.xV, 507 + this.yV, 100+this.xV, 407+this.yV);
		
		
		g.setColor(this.globo); // Es la variable del color
		g.fillOval(50 + this.xV, 307 + this.yV, 100, 100);
		
		g.setColor(Color.black);
		g.drawString("Vamos  " +this.strNombre+"!!",  this.xt,  + this.yt);

		// g.drawRect(150, 200, 300, 250);Dibuja el contorno
		// g.setColor(Color.BLUE); Defines el color que vas a utilizar
		// g.fillRect(100, 400, 50, 50); Rellena un cuadrado
		// g.setColor(Color.red);
		// g.fillOval(450, 150, 200, 150);
		// g.drawLine(100, 200, 50, 50);
		// g.drawString("Me dicen Picasso", 300, 250);
	}
	
	public void setglobo(Color color) { // un setter para poner el color
		this.globo = color ;
		repaint();
	}

	public void run() {
		try {
		while (this.xV<550) {
			if(this.movimiento) {
			this.xV+=2;
			this.yV--;
			repaint();
			}
			Thread.sleep(10);
		}
		}catch (Exception e) {
			System.out.println();
		}
	}

}