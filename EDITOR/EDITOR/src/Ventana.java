import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
	
	private JTextArea area;
	private JFileChooser chooser;
	
	// MENU BAR
	JMenuBar barrita;	
	// MENUS
	JMenu menu1, menu2;
	// ITEMS
	private JMenuItem item1, item2, item3;
	
	Ventana(){
		super("EDITOR");
		setSize(400,400);
		setLocation(200,200);
		setLayout(new BorderLayout());
		
		chooser = new JFileChooser();
		
		area = new JTextArea();	
		barrita = new JMenuBar();	
		
		menu1 = new JMenu("File");
		menu2 = new JMenu("More Choices");
		
		item1 = new JMenuItem("Save");
		item2 = new JMenuItem("Load");
		item3 = new JMenuItem("etc");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		barrita.add(menu1);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(menu2);
		
		menu2.add(item3);
		
		add(area, BorderLayout.CENTER);
		
		setJMenuBar(barrita); // is to set the Bar 		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("PRESSED!");
		if(e.getSource() == item1) {
			//save
			int resultado = chooser.showSaveDialog(this);
			
			if(resultado == JFileChooser.APPROVE_OPTION);
				System.out.println(chooser.getSelectedFile().getPath());
				
				FileWriter fw;
				try {
					fw = new FileWriter(chooser.getSelectedFile().getPath());
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					
					pw.println(area.getText());
					
					
					pw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
		}
		
		if(e.getSource() == item2) {
			// load
			int resultado = chooser.showOpenDialog(this);
			
			if(resultado == JFileChooser.APPROVE_OPTION) {
				System.out.println(chooser.getSelectedFile().getPath());
				
				FileReader fr;
				try {
					fr = new FileReader(chooser.getSelectedFile().getPath());
					BufferedReader br = new BufferedReader(fr);
					String linea;
					System.out.println(br.readLine()); // make sure the txt is at Project level  
					while((linea = br.readLine()) != null) {
						area.append(linea + "\n");
						System.out.println(linea);
					}
					br.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}				
			}
		}	
	}
}
