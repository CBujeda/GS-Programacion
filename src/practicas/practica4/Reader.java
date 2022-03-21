package practicas.practica4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Reader {
	
	public static ArrayList<Matricula> matriculas() {
		ArrayList<Matricula> l = new ArrayList<Matricula>();
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(
								"C:\\eclip\\practica4\\matriculas.dat"));
			while(true) {
				try {
					int nip_alumno = f.readInt();
					int cod_asignatura = f.readInt();
					l.add(new Matricula(nip_alumno,cod_asignatura));
				} catch (IOException e) {break;}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return l;
	}
	
	public static ArrayList<String[]> asignaturas() {
		ArrayList<String[]> l = new ArrayList<String[]>();
		File f = new File("C:\\eclip\\practica4\\asignaturas.txt");
		String[] data;
		String[] dataProcess = new String [5];
		try {
			Scanner file = new Scanner(f);
			while(file.hasNextLine()) {
				data = file.nextLine().split(" ");
				dataProcess = new String [5];
				for(int i = 0; i < data.length; i++) { // procesa los datos en una tabla
					if(i < 4) {
						dataProcess[i] = data[i];
					}else {
						if(dataProcess[4] == null) {
							dataProcess[4] = data[i];
						}else {
							dataProcess[4] = dataProcess[4] + " " + data[i];
						}
					}
				}
				l.add(dataProcess);
				//file.close(); // no cerramos ya que si no scanner revienta
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	
	public static ArrayList<String[]> alumnos() {
		File f = new File("C:\\eclip\\practica4\\alumnos.csv");
		ArrayList<String[]> l = new ArrayList<String[]>();
		try {
			String [] data;
			Scanner file = new Scanner(f);
			if(file.hasNextLine()) {
				file.nextLine();
			}
			while(file.hasNextLine()) {
				data = file.nextLine().split(";");
				l.add(data);
				
			}
			//file.close(); // no cerramos ya que si no scanner revienta
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
		
	}
}
