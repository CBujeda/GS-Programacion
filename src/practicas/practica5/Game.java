package practicas.practica5;

import java.util.ArrayList;

public class Game {
	
	public static void start(ArrayList<String[]> imgs,String[] stats ) {
		SqlAccess bd = new SqlAccess();
		ArrayList<Avatar> avatar = null;
		ArrayList<Arma> arma = null;
		ArrayList<Pregunta> pregunta = null;
		ArrayList<Poder> poder = null;
		try {
			avatar = bd.getAvatar();
			arma = bd.getArma();
			pregunta = bd.getPregunta();
			poder = bd.getPoder();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Character player = new Character();
		String name = "";
		history1(imgs,stats);
		Screen.viewComment(imgs.get(6), stats, "Ahora elije un Nombre para tu character...");
		name = Inicio.sc();
		Screen.sleep(2000);
		Screen.viewComment(imgs.get(6), stats, "Ahora elije un Avatar para tu character...");
		if(name.equalsIgnoreCase("")) {
			name = "Lilya"; // nombre default
		}
		player.setName(name);
		Screen.space();
		Screen.sleep(2000);
		Screen.space();
		String[] cAvatar = new String[avatar.size()];
		for(int i = 0; i< cAvatar.length; i++) {
			cAvatar[i] = "["+i+"] "+avatar.get(i).getName()+ "  -  "+avatar.get(i).getVida()+"♥";
		}
		String datos = "";
		while(true) {
			Screen.view(cAvatar, stats);
			datos = Inicio.sc();
			int data;
			try {
				data = Integer.parseInt(datos);
			}catch(Exception e) {
				data = -1;
			}
			if(data >= 0 && data < avatar.size()) {
				break;
			}
		}
		player.setAvatar(avatar.get(Integer.parseInt(datos)));
		Screen.space();
		Screen.viewComment(imgs.get(6), stats, "Ahora elije un Arma para tu character...");
		Screen.sleep(2000);
		Screen.space();
		String[] cArma = new String[arma.size()];
		for(int i = 0 ; i < cArma.length;i++) {
			cArma[i] = "["+i+"] "+arma.get(i).getName()+"  -  "+arma.get(i).getDanno()+ " Daño";
		}
		datos = "";
		while(true) {
			Screen.view(cArma, stats);
			datos = Inicio.sc();
			int data;
			try {
				data = Integer.parseInt(datos);
			}catch(Exception e) {
				data = -1;
			}
			if(data >= 0 && data < arma.size()) {
				break;
			}
		}
		player.setArma(arma.get(Integer.parseInt(datos)));
		Screen.space();
		Screen.viewComment(imgs.get(6), stats, "Ahora elije un Poder para tu character...");
		Screen.sleep(2000);
		Screen.space();
		String[] cPoder = new String[poder.size()];
		for(int i = 0 ; i < cPoder.length;i++) {
			cPoder[i] = "["+i+"] "+poder.get(i).getName()+
					"  -  "+poder.get(i).getDanno()+
					"-Daño"+"  -  "+poder.get(i).getDefensa()+"-Defensa";
		}
		datos = "";
		while(true) {
			Screen.view(cPoder, stats);
			datos = Inicio.sc();
			int data;
			try {
				data = Integer.parseInt(datos);
			}catch(Exception e) {
				data = -1;
			}
			if(data >= 0 && data < poder.size()) {
				break;
			}
		}
		player.setPoder(poder.get(Integer.parseInt(datos)));
		play(imgs, stats,player,pregunta);
	}

	public static void play(ArrayList<String[]> imgs,String[] stats,Character player,ArrayList<Pregunta> pregunta) {
		stats[0] = Integer.toString(player.getAvatar().getVida());
		stats[1] = "100";
		stats[2] = player.getPoder().getName();
		stats[3] = player.getArma().getName();
		stats[4] = player.getAvatar().getName();
		stats[5] = player.getName();
		boolean perdido = false;
		Screen.view(imgs.get(0), stats);
		for(int i = 0; i < pregunta.size(); i++) {
			stats = pregunta(imgs, stats, player, pregunta.get(i));
			try {
				if(Integer.parseInt(stats[0]) <= 0) {
					Screen.viewComment(imgs.get(0), stats, "HAS PERDIDO");
					Screen.sleep(1000);
					perdido = true;
					break;
				}
			}catch(Exception e) {
				Screen.viewComment(imgs.get(0), stats, "ERROR INESPERADO");
				Screen.sleep(1000);
			}
		}
		if(perdido == false) {
			Screen.viewComment(imgs.get(0), stats, "HAS GANADO!  -  Puntos" + stats[1]);
			Screen.sleep(1000);
		}
		
		
		
	}
	
	public static String[] pregunta(ArrayList<String[]> imgs,String[] stats,Character player,Pregunta pregunta) {
		int prandom;
		while(true) {
			 prandom = (int) Math.round(Math.random()*10);	
			if(prandom >= 0 && prandom < 10) {
				break;
			}
		}
		Screen.sleep(1000);
		Screen.space();
		Screen.viewComment(imgs.get(0), stats,"Pregunta: " + pregunta.getPregunta());
		//System.out.println(prandom);
		Screen.sleep(10000);
		Screen.space();
		boolean correcta =  false;
		while(true){
			Screen.space();
			if(prandom < 5) {
				Screen.viewComment(imgs.get(0), stats,"Respuestas: [1]:"
						+ pregunta.getCorrecta() + " - [2]: " + pregunta.getIncorrecta());
			}else {
				Screen.viewComment(imgs.get(0), stats,"Respuestas: [1]:"
						+ pregunta.getIncorrecta() + " - [2]: " + pregunta.getCorrecta());
			}
			String entrada = Inicio.sc();
			if(entrada.equalsIgnoreCase("1")) {
				Screen.space();
				if(prandom < 5) {
					Screen.viewComment(imgs.get(0), stats,"Respuesta Correcta!");
					correcta = true; 
				}else {
					Screen.viewComment(imgs.get(0), stats,"Respuesta Incorrecta");
				}
				break;
			}else if(entrada.equalsIgnoreCase("2")) {
				Screen.space();
				if(prandom < 5) {
					Screen.viewComment(imgs.get(0), stats,"Respuesta Incorrecta!");
				}else {
					Screen.viewComment(imgs.get(0), stats,"Respuesta Correcta");
					correcta = true;
				}
				break;
			}else {
				Screen.space();
				Screen.viewComment(imgs.get(0), stats,"Respuesta no valida");
			}
		}
		try {
			if(correcta == true) {
				stats[1] = Integer.toString( 
						Integer.parseInt(stats[1]) + 
						player.getPoder().getDanno() + 
						player.getArma().getDanno());
			}else {
				stats[0] = Integer.toString(Integer.parseInt(stats[0]) - 100 + player.getPoder().getDefensa()-50);
			}
		}catch(Exception e) {
			Screen.viewComment(imgs.get(0), stats, "ERROR INESPERADO");
		}
		
		Screen.sleep(1000);
		Screen.space();
		return stats;
	}
	
	public static void history1(ArrayList<String[]> imgs,String[] stats) {
		Screen.space();
		Screen.viewComment(imgs.get(0), stats, "Hace mucho tiempo...");
		Screen.sleep(2000);
		Screen.space();
		Screen.viewComment(imgs.get(0), stats, "En una torre muy lejana....");
		Screen.sleep(2000);
		Screen.space();
		Screen.viewComment(imgs.get(5), stats, "Existia una pequeña Hada");
		Screen.sleep(2000);
		Screen.space();
		Screen.viewComment(imgs.get(0), stats, "Pero un viejo anciano la apresaba");
		Screen.sleep(2000);
		Screen.space();
		Screen.viewComment(imgs.get(4), stats, "Asi que tu mi joven caballera");
		Screen.sleep(2000);
		Screen.space();
		Screen.viewComment(imgs.get(0), stats, "Vence al anciano y sal victoriosa de la torre");
		Screen.sleep(2000);
		Screen.space();
	}
}
