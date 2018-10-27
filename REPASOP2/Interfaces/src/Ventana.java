import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		super("Mi primer ventana en Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hace que cierres la ventana
		PanelDibujo pd = new PanelDibujo();
		this.add(pd);// Agregas todo
		this.pack();
		this.setVisible(true); // Abre la ventanas

	}

	public static void main(String[] args) {
		Ventana miVentanita = new Ventana();
	}

}
