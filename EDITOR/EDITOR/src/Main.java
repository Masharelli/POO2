import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		new Ventana();
		// object file reader - reads file
		// reads line by line buffered
		FileReader fr;
		try {
			fr = new FileReader("textito.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			System.out.println(br.readLine()); // make sure the txt is at Project level  
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close(); // this is to close the file completely
			
			FileWriter fw = new FileWriter("textito.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("linea 1");
			pw.println("linea 2");
			pw.println("hola");
			pw.println("saludos");
			bw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
