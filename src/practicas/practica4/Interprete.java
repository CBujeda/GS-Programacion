package practicas.practica4;

import java.util.Scanner;

public class Interprete {

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
					Reader.matriculas();
				}else if(command.toLowerCase().contains("asignaturas")) {
					if( command.split(" ").length == 2 ||
						command.split(" ").length == 3) {
						
						System.out.println("Valido");
						
					}else {esintaxis(command);}
				}else if(command.toLowerCase().contains("alumnos")) {
					System.out.println("Funciona 2");
				}else if(command.toLowerCase().contains("eliminar")) {
					System.out.println("Funciona 3");
				}else if(command.toLowerCase().contains("matricular")) {
					System.out.println("Funciona 3");
				}else if(command.equalsIgnoreCase("help")) {
					
				}else {
					System.out.println("El comando \""+command+"\" no se encontro");
				}
			}else { // cuando command no es nada es que se ha saltado
				System.out.println("ADVERTENCIA | Scanner se salto una toma");
			}			
		}	
	}
}
