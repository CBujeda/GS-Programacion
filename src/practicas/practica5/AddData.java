package practicas.practica5;

import java.util.ArrayList;

public class AddData {
	
	/**
	 * Pre:
	 * Post: Dicho metodo se encarga de mostrar el menu de añadir diferentes
	 * 		 datos a la BBDD
	 */
	public static void inicio(ArrayList<String[]> imgs, String[] stats) {
		Screen.space();
		Screen.viewComment(imgs.get(0), stats, "Elije una opcion: ");
		Screen.sleep(2000);
		Screen.space();
		
		String[] addopt = { " --------MENU PARA AÑADIR DATOS--------",
							"[1] Añadir avatar",
							"[2] Añadir arma",
							"[3] Añadir pregunta",
							"[4] Añadir poder",
							"[5] Atras"};
		String input = "";
		while(true) {
			Screen.view(addopt, stats);
			input = Inicio.sc();
			if(	input.equalsIgnoreCase("1") ||
				input.equalsIgnoreCase("2") || 
				input.equalsIgnoreCase("3") || 
				input.equalsIgnoreCase("4") || 
				input.equalsIgnoreCase("5")) {
				break;
			}
		}
		SqlAccess db = new SqlAccess();
		String entrada = "";
		int entradaint = 0;
		Screen.space();
		if(input.equalsIgnoreCase("1")) {
			Avatar anew = new Avatar();
			Screen.viewComment(imgs.get(0), stats, "Elije un nombre: ");
			entrada = Inicio.sc();
			anew.setName(entrada);
			
			while(true) {
				Screen.viewComment(imgs.get(0), stats, "Elije un La vida total: ");
				entradaint = Inicio.scInt();
				Screen.space();
				if(entradaint >= 100 && entradaint <= 1000) {
					break;
				} else {
					Screen.viewComment(imgs.get(0), stats,
							"Valores incorrectos reintento en 3s  Valores entre(100 - 1000)");
					Screen.sleep(3000);
					Screen.space();
				}
			}
			anew.setVida(entradaint);
			Screen.space();
			try {
				db.setAvatar(anew);
			} catch (Exception e) {
				System.out.println("[ERROR INESPERADO] No se pudo añadir el avatar");
				e.printStackTrace();
			}
		} else if(input.equalsIgnoreCase("2")) {
			Arma armnew = new Arma();
			Screen.viewComment(imgs.get(0), stats, "Elije un nombre: ");
			entrada = Inicio.sc();
			armnew.setName(entrada);
			Screen.space();
			while(true) {
				Screen.viewComment(imgs.get(0), stats, "Elije un daño total: ");
				entradaint = Inicio.scInt();
				if(entradaint >= 10 && entradaint <= 100) {
					break;
				} else {
					Screen.viewComment(imgs.get(0), stats,
							"Valores incorrectos reintento en 3s  Valores entre(10 - 100)");
					Screen.sleep(3000);
					Screen.space();
				}
			}
			armnew.setDanno(entradaint);
			Screen.space();
			try {
				db.setArma(armnew);;
			} catch (Exception e) {
				System.out.println("[ERROR INESPERADO] No se pudo añadir el arma");
				e.printStackTrace();
			}
		} else if(input.equalsIgnoreCase("3")) {
			Pregunta pregnew = new Pregunta();
			Screen.viewComment(imgs.get(0), stats, "Pregunta: ");
			entrada = Inicio.sc();
			pregnew.setPregunta(entrada);
			Screen.space();
			Screen.viewComment(imgs.get(0), stats, "Respuesta correcta: ");
			entrada = Inicio.sc();
			pregnew.setCorrecta(entrada);
			Screen.space();
			Screen.viewComment(imgs.get(0), stats, "Respuesta Incorrecta: ");
			entrada = Inicio.sc();
			pregnew.setIncorrecta(entrada);
			Screen.space();
			try {
				db.setPregunta(pregnew);
			} catch (Exception e) {
				System.out.println("[ERROR INESPERADO] No se pudo añadir la pregunta");
				e.printStackTrace();
			}
		} else if(input.equalsIgnoreCase("4")) {
			Poder podnew = new Poder();
			Screen.viewComment(imgs.get(0), stats, "Nombre de poder: ");		
			entrada = Inicio.sc();
			podnew.setName(entrada);
			Screen.space();
			while(true) {
				Screen.viewComment(imgs.get(0), stats, "Elije un daño total: ");
				entradaint = Inicio.scInt();
				if(entradaint >= 0 && entradaint <= 100) {
					break;
				} else {
					Screen.viewComment(imgs.get(0), stats,
							"Valores incorrectos reintento en 3s  Valores entre(0 - 100)");
					Screen.sleep(3000);
					Screen.space();
				}
			}
			podnew.setDanno(entradaint);
			while(true) {
				Screen.viewComment(imgs.get(0), stats, "Elije un Defensa total: ");
				entradaint = Inicio.scInt();
				if(entradaint >= 0 && entradaint <= 200) {
					break;
				} else {
					Screen.viewComment(imgs.get(0), stats,
							"Valores incorrectos reintento en 3s  Valores entre(0 - 200)");
					Screen.sleep(3000);
					Screen.space();
				}
			}
			Screen.space();
			podnew.setDefensa(entradaint);
			try {
				db.setPoder(podnew);
			} catch (Exception e) {
				System.out.println("[ERROR INESPERADO] No se pudo añadir el Poder");
				e.printStackTrace();
			}
		}
	}
}
