package trimestre_2.tareaExtra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Inicio {
	
	public static String tratador(String data) {
		boolean comillas = false;
		String datoFin = "";
		for(int i = 0; i < data.length(); i++) {
			
			if(data.substring(i,i + 1).equalsIgnoreCase("\"")) {
				if(comillas == false) {
					comillas = true;
				}else {
					comillas = false;
				}
			}
			if(comillas == true) {
				if(!data.substring(i,i + 1).equalsIgnoreCase(",")) {
					datoFin = datoFin + data.substring(i,i + 1);
				}
			}else{
				datoFin = datoFin + data.substring(i,i + 1);
			}
			
		}
		return datoFin;
	}
	
	public static ArrayList<DatosCont> mayores(ArrayList<DatosCont>  list) { // Revisar
		DatosCont temp = new DatosCont("");
		for(int i = 0; i < list.size(); i++) {
			for(int r = i; r < list.size();r++) {
				if(list.get(i).getCont() < list.get(r).getCont()) {
					
					temp.setAll(list.get(i).getName(),
								list.get(i).getCont());
					
					list.get(i).setAll( list.get(r).getName(),
										list.get(r).getCont());
					
					list.get(r).setAll( temp.getName(),
										temp.getCont());
				}
			}
		}
		
		return list;
	}
	
	public static int  timeCorrector(String datos) {
		String hora = "";
		hora = datos.replaceAll(" ", "").replaceAll("c:", "").replaceAll("c", ""); // quitamos lo que da error
		if(hora.substring(1,2).equalsIgnoreCase(":")) { // comprobamos si es de 1 digito o de 2
			hora = hora.substring(0, 1);
		}else {
			hora = hora.substring(0,2);
		}
		return  Integer.parseInt(hora);
	}
	
	public static void mList(ArrayList<DatosCont>  list, int cant, String txt) { 
		if(cant > list.size() || cant <= 0) {
			cant = list.size();
		}
		if(!txt.equals("0")) { // Hago las comprobaciones de esta forma por si se quisiera mostrar mas datos
			System.out.print(txt);
		}
		for(int i = 0; i < cant; i++) {
			if(txt.equals("0") && cant > 1) {
				System.out.println();
			}
			System.out.println(list.get(i).getName() + " > " + list.get(i).getCont());
		}
	}
	
	public static void main(String[] arg) {
	
		File f = new File("C:\\eclip\\Airplane.csv");
		ArrayList<DatosCont>  listAviones = new ArrayList<DatosCont>();
		ArrayList<DatosCont>  listLocations = new ArrayList<DatosCont>();
		ArrayList<DatosCont>  listTiempo = new ArrayList<DatosCont>();
		ArrayList<DatosCont>  listHistorial = new ArrayList<DatosCont>();
		try {
			Scanner file = new Scanner(f);
			String data;
			String[] datos;
			if(file.hasNextLine()) {
				file.nextLine();
			}
			boolean cont = false;
			boolean existeAvion = false;
			boolean existeLocate = false;
			boolean existeHistorial = false;
			String year = "";
			int tempo = 100;
			System.out.println("Cargando...");
			while(file.hasNextLine()) {
				existeAvion = false;
				existeLocate = false;
				existeHistorial = false;
				data = tratador(file.nextLine());
				datos = data.split(",");
				year = "";
				year = datos[0].substring(6, 10);
				if(cont == false) {
					listAviones.add(new DatosCont(datos[6]));
					listLocations.add(new DatosCont(datos[2]));
					
					listTiempo.add(new DatosCont("morning")); // 0
					listTiempo.add(new DatosCont("afternoon")); // 1
					listTiempo.add(new DatosCont("night")); // 2
					listHistorial.add(new DatosCont(year));
				} else {
					for(int i = 0; i < listAviones.size();i++) { // list aviones
						if(listAviones.get(i).getName().trim().equalsIgnoreCase(datos[6].trim())) {
							listAviones.get(i).sumCont();
							existeAvion = true;
						}
					}
					
					for(int i = 0; i < listLocations.size();i++) { // list locations
						
						if(!datos[2].equalsIgnoreCase("")) { // Correccion de campos sin datos
							if(listLocations.get(i).getName().equalsIgnoreCase(datos[2])) {
								listLocations.get(i).sumCont();
								existeLocate = true;
							}
						}	
					}

					for(int i = 0; i < listHistorial.size(); i++) {
						if(!datos[0].equalsIgnoreCase("")) {
							if(Integer.parseInt(listHistorial.get(i).getName()) == Integer.parseInt(year)) {
								listHistorial.get(i).sumCont();
								existeHistorial = true;
							}
							
						}	
					}
					
					tempo = 100;
					if(!datos[1].equalsIgnoreCase("")) { // Correccion de dato horas
						tempo = timeCorrector(datos[1]); // convertir horas en numero
						if(tempo <= 24 && tempo >= 0) {
							if(tempo >= 6 &&   tempo < 13 ) { // saber si es mañana, tarde, noche
								listTiempo.get(0).sumCont();
							}else if(tempo >= 13 && tempo < 20){
								listTiempo.get(1).sumCont();
							}else if(tempo >= 20 && tempo <= 24|| tempo >= 0 && tempo < 6) {
								listTiempo.get(2).sumCont();
							}
						}
					}
					
					if(!existeAvion == true) {
						listAviones.add(new DatosCont(datos[6]));
					}
					if(!existeLocate == true) {
						listLocations.add(new DatosCont(datos[2]));
					}
					if(!existeHistorial == true) {
						listHistorial.add(new DatosCont(year));
					}
				}
				cont = true;
			}
			
			mList(mayores(listAviones),1,"Avion con mas accidentes: ");
			mList(mayores(listLocations),1,"Localización con mas accidentes: ");
			System.out.println("Por la mañana hubo ( " + listTiempo.get(0).getCont() + " ) accidentes");
			System.out.println("Por la tarde hubo ( " + listTiempo.get(1).getCont() + " ) accidentes");
			System.out.println("Por la noche hubo ( " + listTiempo.get(2).getCont() + " ) accidentes");
			
			System.out.println("Historial de años y sus accidentes");
			mList(listHistorial,0,"");
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
