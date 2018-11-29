import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.*;

import figuras.increibles.Figura;

public class Ventana extends JFrame {

	// constantes 
	// valores que no van a cambiar
	// normalmente utilizados cuando hay un valor recurrente
	public static final int EJEMPLO = 1;
	public static final int EJEMPLO_SEGUNDO = 2;
	
	private PanelBotones botones;
	private AreaDibujo areaDibujo;
	private JMenuBar barra;
	private JMenu menu;
	private JMenuItem guardar,leer;
	
	public Ventana() {
		super("PAINT");
		setSize(800,800);
		setLocation(200,200);
		
		botones = new PanelBotones();
		areaDibujo = new AreaDibujo(botones);
		
		//add(b1);
		setLayout(new BorderLayout());
		add(botones, BorderLayout.WEST);
		add(areaDibujo, BorderLayout.CENTER);
		
		guardar = new JMenuItem("Guardar");
		leer = new JMenuItem("Abrir");
		
		menu = new JMenu("Archivo");
		barra = new JMenuBar();
		
		guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					FileWriter fw = new FileWriter("archivito.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					
					LinkedList<Figura> figuras = areaDibujo.getFiguras();
					for(int i = 0; i < figuras.size(); i++) {
						System.out.println(figuras.get(i));
						pw.println(figuras.get(i));
					}
					
					pw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
 				
			}
		});
		
		menu.add(leer);
		menu.add(guardar);
		barra.add(menu);
		
		
		setJMenuBar(barra);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	
}
