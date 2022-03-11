package trimestre_3.ficheros_binarios.tareas.ejercicio_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Inicio {
	
	public static void escritura( DataOutputStream f ,int a_c, int a_a, int a_s, double p) {
			
		try {
			f.writeInt(a_c);
			f.writeInt(a_a);
			f.writeInt(a_s);
			f.writeDouble(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void crearf(String ubic) {
		try {
			DataOutputStream f = new DataOutputStream(new FileOutputStream(ubic));
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Cuantas lineas a escribir: ");
			int size = sc.nextInt();
			
			for(int i = 0; i < size ; i++) {
				System.out.print("Asignaturas cursadas: ");
				int a_c = sc.nextInt();
				System.out.print("Asignaturas aprobadas: ");
				int a_a = sc.nextInt();
				System.out.print("Asignaturas suspendidas: ");
				int a_s = sc.nextInt();
				System.out.print("Precio total: ");
				double p = sc.nextDouble();
				escritura(f, a_c,a_a,a_s,p);
			}
			
			//asignaturas cursadas, asignaturas aprobadas, asignaturas suspendidas y precio total;
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void leerf(String ubic) {
		
		try {
			DataInputStream f = new DataInputStream(new FileInputStream(ubic));
			System.out.println("asignaturas cursadas | asignaturas aprobadas |"
							 + " asignaturas suspendidas | precio total");
			int ac_sum = 0;
			int aa_sum = 0;
			int as_sum = 0;
			double p_sum = 0;
			int cont = 0;
			try {
				
				while (true) {
				//asignaturas cursadas, asignaturas aprobadas, asignaturas suspendidas y precio total;
				
				int a_c = f.readInt();
				int a_a = f.readInt();
				int a_s = f.readInt();
				double p = f.readDouble();
				ac_sum = ac_sum + a_c;
				aa_sum = aa_sum + a_a;
				as_sum = as_sum + a_s; 
				p_sum  = p_sum  + p;
				System.out.println( "   " + a_c +
									"   " + a_a +
									"   " + a_s +
									"   " + p);
				cont++;
				}
			} catch (IOException e) {}
				
			System.out.println("Medias:");
			System.out.println(" > Asignaturas aprobadas: " + (aa_sum / cont));
			System.out.println(" > Precio: " + (p_sum / cont));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] arg) {
		String ubic = "C:\\eclip\\ejer1.dat";
		crearf(ubic);
		leerf(ubic);
		//asignaturas cursadas, asignaturas aprobadas, asignaturas suspendidas y precio total;
		
		
	}
}
