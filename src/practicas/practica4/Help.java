package practicas.practica4;

public class Help {
	
	public static void m1() {
		System.out.println("\r\n"
				+ "• Matrículas  - Informa del número total de matrículas de"
				+ " alumnos en diferentes asignaturas.");
		System.out.println("\r\n"
				+ "• Asignaturas {nip alumno} [A | C] "
				+ "- Lista asignaturas matriculadas de un alumno\r\n"
				+ "	- [A] Orden Alfabetico\r\n"
				+ "	- [C] Orden por codigo de asignatura creciente\r\n"
				+ "	- [ ] Orden por codigo de asignatura creciente");
		System.out.println("\r\n"
				+ "• Alumnos {codigo asignatura} [A | N]"
				+ " - Lista de alumnos matriculados en una asignatura\r\n"
				+ "	- [A] Orden Alfabetico\r\n"
				+ "	- [N] Orden por nip de alumno creciente\r\n"
				+ "	- [ ] Orden por nip de alumno creciente");
		System.out.println("\r\n"
				+"• Eliminar nip { codigo } -- Elimina matriculaciones por asignatura\r\n"
				+ "	- {codigo} Elimina matriculaciones alumno por asignatura\r\n"
				+ "		       - [EX:]  (LIST) {codigo} = 30201,30202,30203,30204\r\n"
				+ "	- { } 	   Elimina todas las matriculaciones de un alumno");

		
	}

}
