import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
	
	private JLabel label;
	private JTextArea area;
	private JTextField field;
	private JPanel panel;
	private JButton b1, b2;
	private JMenuBar barra;
	private JMenu menu1, menu2;
	private JMenuItem item1, item2, item3;
	
	public Ventana() {
		
		super("VENTANA");
		setSize(400, 400);
		setLocation(400, 400);
		
		barra = new JMenuBar();
		menu1 = new JMenu("Menu1");
		menu2 = new JMenu("Menu2");
		item1 = new JMenuItem("item1");
		item2 = new JMenuItem("item2");
		item3 = new JMenuItem("item3");
		
		menu1.add(item1);
		menu1.add(item2);
		menu2.add(item3);
		menu1.add(menu2);
		barra.add(menu1);
		
		// menu
		setJMenuBar(barra);
		
		panel = new JPanel();
		
		label = new JLabel("hola");
		area = new JTextArea();
		field = new JTextField();
		b1 = new JButton("b1");
		b2 = new JButton("b2");
		
		
		// layouts - maneras de organizar un contenedor 
		BorderLayout layoutVentana = new BorderLayout();
		setLayout(layoutVentana);
		
		GridLayout layoutPanel = new GridLayout(2, 2);
		panel.setLayout(layoutPanel);
		
		panel.add(area);
		panel.add(field);
		panel.add(b1);
		panel.add(b2);
		
		add(label, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		
		b1.addActionListener(this);
		
		// clase anónima
		// se define como parámetro
		// no tiene nombre / identificador
		// sirve exclusivamente para implementación de métodos abstractos / interfaz
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent eventito) {
				System.out.println("salu2");
			}
		});
		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("implementando actionlistener en el frame");
	}
}
