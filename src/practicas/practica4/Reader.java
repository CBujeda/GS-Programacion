package practicas.practica4;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
	
	public static void matriculas() {
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(
								"C:\\eclip\\practica4\\matriculas.dat"));
			while(true) {
				try {
					int nip_alumno = f.readInt();
					int cod_asignatura = f.readInt();
					System.out.println( nip_alumno + " " + cod_asignatura);
				} catch (IOException e) {break;}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
