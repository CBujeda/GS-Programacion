package practicas.practica4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Interprete {
	
	public static void matric() {
		ArrayList<Matricula> l = Reader.matriculas();
		System.out.println("Numero total de matriculas: " + l.size());
	}
	
	// nip = 627867 // codigos 30201,30202,30203,30204
	public static void matricular(String nip, String codigo) {
		ArrayList<Matricula> l = Reader.matriculas();
		ArrayList<String[]> lAsig = Reader.asignaturas();
		ArrayList<String[]> lAlumno = Reader.alumnos();
		System.out.println(nip + " " + codigo);
		String[] codigos = codigo.split(",");
		boolean valided = true;
		boolean esAlumno = false;
		boolean[] esAsig = new boolean[codigos.length];
		for(int i = 0; i < esAsig.length; i++) {
			esAsig[i] = false;
		}
		boolean AsigValid = true;
		if(!codigo.equalsIgnoreCase("false")) { // comprobacion de validez
			for(int i = 0; i < codigos.length; i++) { 
				try {
					Double.parseDouble(codigos[i]);
					if(Double.parseDouble(codigos[i]) < 0) {
						valided = false;
						System.out.println("Codigo invalido (no puede ser menor a 0)");
					}
		        }catch(NumberFormatException e) {
		        	valided = false;
		            System.out.println("No es numerico");
		        }
			}
			try {
		        Double.parseDouble(nip);
		        if(Double.parseDouble(nip) < 0) {
		        	valided = false;
					System.out.println("Codigo invalido (no puede ser menor a 0)");
		        }
			}catch(NumberFormatException e) {
	        	valided = false;
	        	System.out.println("invalido");
	        }
			
			if(valided == true) {
				for(int i = 0; i < lAlumno.size(); i++) {
					if(lAlumno.get(i)[0].equalsIgnoreCase(nip)) {
						esAlumno = true;
					}	
				}
				if(esAlumno == true) {
					for(int i = 0; i < lAsig.size(); i++) {
						for(int r = 0; r < codigos.length; r++) {
							if(lAsig.get(i)[0].equalsIgnoreCase(codigos[r])) {
								esAsig[r] = true;
							}
						}
					}
					for(int i = 0; i < esAsig.length; i++) {
						if(esAsig[i] == false) {
							AsigValid = false;
						}
					}
					if(AsigValid == true) {
						// matricular 627867 30201,30202,30203,30204
						// matricular 627867 30201,30202,30203,30204,30206
						
						// revisar -------------------------------
						System.out.println("               NIP ║  CODIGO");
						System.out.println("══════════════════════════════");
						boolean existe = false;
						for(int i = 0; i < codigos.length; i++) {
							existe = false;
							for(int r = 0; r < l.size(); r++) {
								if(Integer.toString(l.get(r)
										.getNip_alumno()).equalsIgnoreCase(nip)) {
									if(Integer.toString(l.get(r)
											.getCod_asignatura())
											.equalsIgnoreCase(codigos[i])) {
										existe = true;
									}	
								}	
							}
							if(existe == false) {
								System.out.println("Matriculando: " + nip
															  + " " + codigos[i]);
								l.add(new Matricula(Integer.parseInt(nip)
												   ,Integer.parseInt(codigos[i])));
							}else {
								System.out.println("Matricula:    " + nip 
										+ " " + codigos[i] + " ya existenete");
							}
						}
						System.out.println("Escribiendo datos....");
						Writter.matriculas(l); // escribiendo matriculas....
					}else {
						System.out.println("No se puedo ejecutar ya que "
										 + "alguna asignatura es invalida");
					}
				}else {
					System.out.println("No se puedo ejecutar ya que "
							 + "el alumno es invalido");
				}
			}else {
				System.out.println("No se puedo ejecutar ya que "
							 	 + "los datos son erroneos");
			}
		}else {
			System.out.println("No se puedo ejecutar ya que se debe "
							 + "de constar una lista de codigos");
		}	
	}
	
	// prueba eliminar 627867 30201,30202,30203,30204
	public static void eliminar(String nip, String codigo) {
		ArrayList<Matricula> l = Reader.matriculas();
		for(int i = 0; i < l.size(); i++) {
			String[] cadena = null;
			if(!codigo.equalsIgnoreCase("false")) {
				 cadena = codigo.split(",");
			}
			if(Integer.toString(l.get(i).getNip_alumno()).equalsIgnoreCase(nip)) {
				if(codigo.equalsIgnoreCase("false")) {
					System.out.println("Eliminado: " + l.get(i).getNip_alumno() + "(NIP)" 
							+ " " + l.get(i).getCod_asignatura()+ "(CODIGO)");
					l.get(i).setNulo();
				}else {
					for(int r = 0; r < cadena.length; r++) {
						if(Integer.toString(l.get(i).getCod_asignatura())
													.equalsIgnoreCase(cadena[r])) {
							System.out.println("Eliminado: " + 
													l.get(i).getNip_alumno() + "(NIP)" 
													+ " " + l.get(i).getCod_asignatura()
													+ "(CODIGO)");
							l.get(i).setNulo();
						}
					}
				}
			}
		}
		Writter.matriculas(l);
		
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
						lAlumcod.add(new Alumno_codigo(lAlumno.get(r)[2] +
								" " + lAlumno.get(r)[1],lMatric.get(i).getNip_alumno(),
								Integer.parseInt(codigo)));
					}
				}
			}
		}
		
		if(type == true) { Collections.sort(lAlumcod);
		}else {lAlumcod = Organizadores.alumnos_num_creciente(lAlumcod);  }
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
		//System.out.println("Tipo: " + type);
		//System.out.println("Nip: " + codigo);
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
							System.out.println("Advertencia | Codigos ingnorados");
							if(command.split(" ")[2].equalsIgnoreCase("a")) {
								asignaturas(true, command.split(" ")[1]); // es "A"
							}else { asignaturas(false, command.split(" ")[1]); } // es diferente a "A"
						}else { asignaturas(false, command.split(" ")[1]); } // no contiene atributo
					}else { esintaxis(command); }// error de sintaxis
				}else if(command.toLowerCase().contains("alumnos")) {
					if( command.split(" ").length == 2 ||
							command.split(" ").length == 3) {
							if(command.split(" ").length == 3) {
								if(command.split(" ")[2].equalsIgnoreCase("a")) {
									alumnos(true, command.split(" ")[1]); // es "A"
								}else { alumnos(false, command.split(" ")[1]); } // es diferente a "A"
							}else { alumnos(false, command.split(" ")[1]); } // no contiene atributo
						}else { esintaxis(command); }// error de sintaxis
				}else if(command.toLowerCase().contains("eliminar")) {
					if( command.split(" ").length == 2 || // comprobacion de tamaño
							command.split(" ").length == 3) {
						if(command.split(" ").length == 3) { // si es 3 manda datos
							eliminar(command.split(" ")[1],
									 command.split(" ")[2]);
						} else { eliminar(command.split(" ")[1],"false"); }	//manda datos				
					}else { esintaxis(command); } // error sintaxis
				}else if(command.toLowerCase().contains("matricular")) {
					if( command.split(" ").length == 2 || // si es 2 o 3
							command.split(" ").length == 3) {
						if(command.split(" ").length == 3) { 
							matricular(command.split(" ")[1],
									 command.split(" ")[2]);
						} else { matricular(command.split(" ")[1],"false"); }					
					}else { esintaxis(command); }					
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
