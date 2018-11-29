import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelBotones extends JPanel implements ConfiguradorDibujo {

	private JButton circulo, rectangulo, texto, seleccionador;
	private JTextField tipoGuardado;
	private Color colorin;
	private int figura;
	private AreaDibujo area;
	
	public void setAreaDibujo(AreaDibujo area) {
		this.area = area;
		
	}
	
	public PanelBotones() {
		
		colorin = Color.BLACK;
		circulo = new JButton("circulo");
		rectangulo = new JButton("rectangulo");
		texto = new JButton("texto");
		seleccionador = new JButton("color");
		tipoGuardado = new JTextField("tipo");
		
		
		setLayout(new GridLayout(5, 1));
		add(circulo);
		add(rectangulo);
		add(texto);
		add(tipoGuardado);
		add(seleccionador);
		
		circulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setFigura(ConfiguradorDibujo.CIRCULO);
			}
		});
		
		rectangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setFigura(ConfiguradorDibujo.RECTANGULO);
			}
		});
		
		texto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setFigura(ConfiguradorDibujo.TEXTO);
			}
		});
		
		seleccionador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("boton");
				colorin = JColorChooser.showDialog(PanelBotones.this, "elige un colorin", Color.BLACK);
				System.out.println(colorin);
			}
		});
	}
	
	private void setFigura(int figura) {
		this.figura = figura;
		switch(figura) {
			case ConfiguradorDibujo.CIRCULO:
				tipoGuardado.setText("circulo");
				break;
			case ConfiguradorDibujo.RECTANGULO:
				tipoGuardado.setText("rectangulo");
				break;
			case ConfiguradorDibujo.TEXTO:
				tipoGuardado.setText("texto");
				break;
		}
	}

	@Override
	public int getFigura() {
		return figura;
	}

	@Override
	public Color getColor() {
		return colorin;
	}
}
