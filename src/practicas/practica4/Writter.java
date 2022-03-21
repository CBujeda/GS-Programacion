package practicas.practica4;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Writter {
	
	
	private static void escribir_matricula(DataOutputStream f, int nip_alumno, int cod_asignatura) {
			try {
				f.writeInt(nip_alumno);
				f.writeInt(cod_asignatura);
			} catch (IOException e) {
				System.out.println("Error al escribir en el fichero");
			}
	}
	
	public static void matriculas(ArrayList<Matricula> l) {	
		try {
			DataOutputStream f = new DataOutputStream(new FileOutputStream("C:\\eclip\\practica4\\matriculas.dat"));
			
			// ----- Revisar
			for(int i = 0; i < l.size(); i++) {
				
				if(l.get(i).getCod_asignatura() != -1 && l.get(i).getNip_alumno() != -1) {
					escribir_matricula(f,l.get(i).getNip_alumno(),l.get(i).getCod_asignatura());
				}
			}
			f.close();
		}  catch(FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
		} catch (IOException e) {
			System.out.println("Error en operación de E/S con el fichero ");
		}
		
	}
}
