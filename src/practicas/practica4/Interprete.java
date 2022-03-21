package practicas.practica4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Interprete {
	
	public static void matric() {
		ArrayList<Matricula> l = Reader.matriculas();
		System.out.println("Numero total de matriculas: " + l.size());
	}
	
	// alumno de prueba 627867
	public static void asignaturas(boolean type, String nip) { //si es true es tipo A
		ArrayList<String[]> lAsig = Reader.asignaturas();
		ArrayList<Matricula> lMatric = Reader.matriculas();
		ArrayList<Asignaturas_nip> lasig_nip = new ArrayList<Asignaturas_nip>();
		boolean existe = false;
		for(int i = 0; i < lMatric.size(); i++) {
			if(Integer.toString(lMatric.get(i)
					.getNip_alumno()).trim().equalsIgnoreCase(nip.trim())) {
				existe = true;
				for(int r = 0; r < lAsig.size(); r++) {
					if(Integer.toString(lMatric.get(i).getCod_asignatura())
							.trim().equalsIgnoreCase(lAsig.get(r)[0].trim())) {				
						lasig_nip.add(new Asignaturas_nip(Integer.parseInt(nip), 
								lMatric.get(i).getCod_asignatura(),  lAsig.get(r)[4]));
					}
				}
			}
		}	
		if(type == true) { Collections.sort(lasig_nip);
		}else { lasig_nip = Organizadores.asignaturas_num_creciente(lasig_nip); }
		if(existe == false) {
			System.out.println("El alumno con el nip " + nip + " no existe");
		}else {
			System.out.println("NIP ║ CODIGO ║ ASIGNATURA");
			System.out.println("═══════════════════════════");
			for(int i = 0; i< lasig_nip.size();i++) {
				System.out.println(lasig_nip.get(i).getNip() + " " +
									lasig_nip.get(i).getCod_asig() + " " +
									lasig_nip.get(i).getAsig());
			}
		}
		//System.out.println("Tipo: " + type);
		//System.out.println("Nip: " + nip);
	}
	
	// asignatura de prueba 30201
	public static void alumnos(boolean type, String codigo) {
		ArrayList<Matricula> lMatric = Reader.matriculas();
		ArrayList<String[]> lAlumno = Reader.alumnos();
		ArrayList<Alumno_codigo> lAlumcod = new ArrayList<Alumno_codigo>(); 
		boolean existe = false;
		for(int i = 0; i < lMatric.size(); i++) {
			if(Integer.toString(lMatric.get(i)
					.getCod_asignatura()).equalsIgnoreCase(codigo)) {
				existe = true;
				for(int r = 0; r < lAlumno.size();r++) {
					if(Integer.toString(lMatric.get(i).getNip_alumno())
							.equalsIgnoreCase(lAlumno.get(r)[0])) {
						//System.out.println(lAlumno.get(i)[2]);
						lAlumcod.add(new Alumno_codigo(lAlumno.get(i)[2] +
								" " + lAlumno.get(i)[1],lMatric.get(i).getNip_alumno(),
								Integer.parseInt(codigo)));
					}
				}
			}
		}
		
		if(type == true) { Collections.sort(lAlumcod);
		}else {  }
		if(existe == false) {
			System.out.println("La asignatura con el codigo " + codigo + " no existe");
		}else {
			System.out.println("ALUMNO ║ NIP ║ CODIGO");
			System.out.println("═══════════════════════════");
		}
		// ---------------------------------------Prosegir
		for(int i = 0; i < lAlumcod.size(); i++) {
			System.out.println(lAlumcod.get(i).getAlumno() 
					+ " ║ " + lAlumcod.get(i).getNip() 
					+ " ║ " + lAlumcod.get(i).getCodigo());
		}
		System.out.println("Tipo: " + type);
		System.out.println("Nip: " + codigo);
	}
	
	public static void esintaxis(String data) {
		System.out.println("Sintaxis del comando \""+ data +" \" Incorrecta");
	}
	
	public static void logo() {
		System.out.println(
				"    _____   __________________  ____  ____  __________________\r\n"
				+ "   /  _/ | / /_  __/ ____/ __ \\/ __ \\/ __ \\/ ____/_  __/ ____/\r\n"
				+ "   / //  |/ / / / / __/ / /_/ / /_/ / /_/ / __/   / / / __/   \r\n"
				+ " _/ // /|  / / / / /___/ _, _/ ____/ _, _/ /___  / / / /___   \r\n"
				+ "/___/_/ |_/ /_/ /_____/_/ |_/_/   /_/ |_/_____/ /_/ /_____/   \r\n"
				+ "________________________________________________________________");
	}
	
	public static void console() {
		logo();
		
		Scanner sc = new Scanner(System.in);
		String command = "";
		
		while(true) {
			System.out.print("Orden > ");
			command = sc.nextLine();
			if(!command.equalsIgnoreCase("")) {
			// Dejo con exit tambien para facilitar mi uso ya que estoy mas acostumbrada
				if(command.equalsIgnoreCase("fin") || command.equalsIgnoreCase("exit")) {
					break;
				}else if(command.equalsIgnoreCase("matriculas")) {
					matric();
				}else if(command.toLowerCase().contains("asignaturas")) {
					if( command.split(" ").length == 2 ||
						command.split(" ").length == 3) {
						if(command.split(" ").length == 3) {
							if(command.split(" ")[2].equalsIgnoreCase("a")) {
								asignaturas(true, command.split(" ")[1]); // es "A"
							}else { asignaturas(false, command.split(" ")[1]); } // es diferente a "A"
						}else { asignaturas(false, command.split(" ")[1]); } // no contiene atributo
					}else { esintaxis(command); }// error de sintaxis
				}else if(command.toLowerCase().contains("alumnos")) {
					System.out.println("Funciona 2");
					
					if( command.split(" ").length == 2 ||
							command.split(" ").length == 3) {
							if(command.split(" ").length == 3) {
								if(command.split(" ")[2].equalsIgnoreCase("a")) {
									alumnos(true, command.split(" ")[1]); // es "A"
								}else { alumnos(false, command.split(" ")[1]); } // es diferente a "A"
							}else { alumnos(false, command.split(" ")[1]); } // no contiene atributo
						}else { esintaxis(command); }// error de sintaxis
					
					
					
					
				}else if(command.toLowerCase().contains("eliminar")) {
					System.out.println("Funciona 3");
				}else if(command.toLowerCase().contains("matricular")) {
					System.out.println("Funciona 3");
				}else if(command.equalsIgnoreCase("help")) {
					Help.m1();
				}else {
					System.out.println("El comando \""+command+"\" no se encontro");
				}
			}else { // cuando command no es nada es que se ha saltado
				System.out.println("          ADVERTENCIA | Scanner se salto una toma");
			}			
		}	
	}
}
