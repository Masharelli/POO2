import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelControles extends JPanel implements ActionListener, MouseListener, MouseMotionListener {

	private JTextField tfNombre;
	private JButton btsaludar, btfondo;
	private JRadioButton rbRojo, rbVerde, rbAzul;
	private PanelDibujo pd;
	private JPanel pColor;
	

	public PanelControles(PanelDibujo pd) {
		super();
		this.pd = pd; // Por aqui es la comunicacion

		this.setPreferredSize(new Dimension(150, 600));
		this.tfNombre = new JTextField(10);
		this.btsaludar = new JButton("saludar");
		this.btfondo = new JButton("Cambiar fondo");
		this.rbRojo = new JRadioButton("Color Rojo", true);
		this.rbVerde = new JRadioButton("Color Verde");
		this.rbAzul = new JRadioButton("Color Azul");

		this.btsaludar.addActionListener(this);
		this.btfondo.addActionListener(this);

		// ButtonGruoup sirve para que los botones sepan de la existencia del otro
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbRojo);
		bg.add(this.rbVerde);
		bg.add(this.rbAzul);

		this.add(new JLabel("Escribe tu nombre"));
		this.add(this.tfNombre);
		this.add(this.btsaludar);

		this.add(this.rbRojo);
		this.add(this.rbVerde);
		this.add(this.rbAzul);

		this.add(this.btfondo);
		
		this.add(new JLabel("Color de globo"));

		this.pColor = new JPanel();
		this.pColor.setPreferredSize(new Dimension(70, 70));
		this.pColor.setBackground(Color.RED);
		this.pColor.addMouseListener(this);
		this.add(pColor);

	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.btsaludar) {
			this.pd.setNombre(this.tfNombre.getText());
		} else {
			if (this.rbRojo.isSelected()) {
				this.setBackground(Color.RED);

			} else if (this.rbVerde.isSelected()) {
				this.setBackground(Color.GREEN);
			} else if (this.rbAzul.isSelected()) {
				this.setBackground(Color.BLUE);
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Color color = JColorChooser.showDialog(this.pd, "Selecciona un color " , this.pColor.getBackground());
		this.pColor.setBackground(color);
		this.pd.setglobo(color);
			
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
