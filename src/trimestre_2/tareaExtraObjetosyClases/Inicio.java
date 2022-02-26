package trimestre_2.tareaExtraObjetosyClases;

import java.util.Scanner;
import java.util.ArrayList;

public class Inicio {

	public static void limpiar(int x) {
		for(int i = 0; i < x ; i++) {
			System.out.println();
		}
	}
	public static void menu() {
		System.out.println("+---------------------+");
		System.out.println("- 1 Registrar trabajo -");
		System.out.println("- 2 Mostrar trabajo   -");
		System.out.println("- 3 Coste piezas      -");
		System.out.println("- 4 Finalizar trabajo -");
		System.out.println("- 5 Aumentar horas    -");
		System.out.println("- 6 Salir             -");
		System.out.println("+---------------------+");
	}
	
	public static void menu2() {
		System.out.println("Elija un tipo de trabajo: ");
		System.out.println("+--------------+");
		System.out.println("+ 1 Reparacion +");
		System.out.println("+ 2 Revision   +");
		System.out.println("+--------------+");
	}
	public static void menu3() {
		System.out.println("Elija un material: ");
		System.out.println("+---------------+");
		System.out.println("+ 1 Piezas      +");
		System.out.println("+ 2 Pintura     +");
		System.out.println("+---------------+");
	}
	public static void menu4() {
		System.out.println("Que tipo de reparacion va ha elegir?");
		System.out.println("+-------------------+");
		System.out.println("+ 1 Mecanica        +");
		System.out.println("+ 2 Chapa y pintura +");
		System.out.println("+-------------------+");
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String eStr = "";
		ArrayList<Reparaciones> listReparaciones = new ArrayList<Reparaciones>();
		ArrayList<Revisiones> listRevisiones = new ArrayList<Revisiones>();
		Material piezas = new Material (0);
		Material pintura = new Material (0);
		while(true) {
			menu();
			eStr = "";
			eStr = sc.nextLine();
			if(eStr.equalsIgnoreCase("1")) {
				limpiar(20);
				menu2();
				eStr = "";
				eStr = sc.nextLine();
				if(eStr.equalsIgnoreCase("1")) {
					while(true) {
						int tipo = -1;
						while(true) {
							menu4();
							eStr = "";
							eStr = sc.nextLine();
							if(eStr.equalsIgnoreCase("1")) {
								tipo = 1;
								break;
							}else if(eStr.equalsIgnoreCase("2")) {
								tipo = 2;
								break;
							}else {
								System.out.println("Elija una opcion valida");
							}
						}
						menu3();
						eStr = "";
						eStr = sc.nextLine();
						System.out.print("Descripcion: ");
						String descripcion = sc.nextLine();
						if(eStr.equalsIgnoreCase("1")) {
							listReparaciones.add(new Reparaciones 
									(listReparaciones.size(),descripcion, piezas, tipo));
							break;
						} else if (eStr.equalsIgnoreCase("2")) {
							listReparaciones.add(new Reparaciones 
									(listReparaciones.size(),descripcion, pintura, tipo));
							break;
						}
					}
					
				}else if(eStr.equalsIgnoreCase("2")) {
					eStr = "";
					System.out.println("Descripcion: ");
					eStr = sc.nextLine();
					listRevisiones.add(new Revisiones(listRevisiones.size(),eStr));
				}else {
					System.out.println("ERROR: No eligio una opcion correcta");
				}
				
				
			}else if (eStr.equalsIgnoreCase("2")) {
				System.out.println("+------------------------------------------+");
				System.out.println("Reparaciones");
				System.out.println("+------>>>>>>>");
				if(listReparaciones.size() == 0) {
					System.out.println("No hay registros de Reparaciones");
				}
				for(int i = 0; i < listReparaciones.size(); i++) {
					System.out.println("Id: " 
										+ listReparaciones.get(i).getId());
					System.out.println("Decripcion: " 
										+ listReparaciones.get(i).getDescription());
					System.out.println("Horas: " 
										+ listReparaciones.get(i).getHoras() + "hs");
					System.out.println("Precio: " 
										+ listReparaciones.get(i).getPrecio() + "€");
					if( listReparaciones.get(i).getTipo() == 1) {
						System.out.println("Tipo: Mecanica");
					}else if(listReparaciones.get(i).getTipo() == 2) {
						System.out.println("Tipo: Chapa y pintura");
					}
					
					if(listReparaciones.get(i).getFinalizado() == true) {
						System.out.println("Finalizado: SI");
					}else {
						System.out.println("Finalizado: NO");
					}
					System.out.println("+------>>>>>>>");
				}
				System.out.println();
				System.out.println("Revisiones");
				System.out.println("+------>>>>>>>");
				if(listRevisiones.size() == 0) {
					System.out.println("No hay registros de Revisiones");
				}
				for(int i = 0; i < listRevisiones.size(); i++) {
					//--------------------pROSEGIR
					System.out.println("Id: "+ 
							listRevisiones.get(i).getId());
					System.out.println("Descripcion: "+ 
							listRevisiones.get(i).getDescription());
					System.out.println("Horas: "+ 
							listRevisiones.get(i).getHoras() + "hs");
					System.out.println("Precio: "+ 
							listRevisiones.get(i).getPrecio() + "€");
					if(listRevisiones.get(i).getFinalizado() == true) {
						System.out.println("Finalizado: SI");
					}else {
						System.out.println("Finalizado: NO");
					}
					System.out.println("+------>>>>>>>");

				}
				
			}else if (eStr.equalsIgnoreCase("3")) {
				System.out.println("+- MODIFICAR COSTE MATERIALES -+");
				System.out.println("+ 1 PIEZAS");
				System.out.println("+ 2 PINTURA");
				eStr = sc.nextLine();
				if(eStr.equalsIgnoreCase("1") || eStr.equalsIgnoreCase("2")) {
					
					System.out.print("Escriba el precio en valor numerico: ");
					double eInt = sc.nextDouble();
					if(eStr.equalsIgnoreCase("1")) {
						piezas.setCoste(eInt);
					}else if(eStr.equalsIgnoreCase("2")) {
						pintura.setCoste(eInt);
					}
					System.out.println("Piezas: " + piezas.getCoste() + "€");
					System.out.println("Pintura: " + pintura.getCoste() + "€");
					
					
					
				}else {
					System.out.println("ERROR: Valor no valido");
				}
			}else if (eStr.equalsIgnoreCase("4")) {
				while(true) {
					System.out.println("¿Que desea finalizar?");
					System.out.println("+------------------+");
					System.out.println("+ 1 Reparacion     +");
					System.out.println("+ 2 Revision       +");
					System.out.println("+------------------+");
					eStr = sc.nextLine();
					System.out.println("Usando esta opcion se"
							+ " invertira el valor de la finalizacion");
					if(eStr.equalsIgnoreCase("1") ) {
						System.out.print("Elija una id:");
						int eInt = sc.nextInt();
						if(eInt < listReparaciones.size() && eInt >= 0) {
							if(listReparaciones.get(eInt).getFinalizado() == false) {
								listReparaciones.get(eInt).setFinalizado(true);
								System.out.println("Se ha finalizado la Reparacion");
							}else {
								listReparaciones.get(eInt).setFinalizado(false);
								System.out.println("Se ha eliminado la"
												+ " finalizacion de reparacion");
							}
							
						}else {
							System.out.println("[ERROR] No existe dicha reparacion");
						}
						break;
					}else if(eStr.equalsIgnoreCase("2")){
						System.out.print("Elija una id:");
						int eInt = sc.nextInt();
						if(eInt < listRevisiones.size() && eInt >= 0) {
							if(listRevisiones.get(eInt).getFinalizado() == false) {
								listRevisiones.get(eInt).setFinalizado(true);
								System.out.println("Se ha finalizado la Revision");
							}else {
								listRevisiones.get(eInt).setFinalizado(false);
								System.out.println("Se ha eliminado la"
										+ " finalizacion de revision");
							}				
						}else {
							System.out.println("[ERROR] No existe dicha revision");
						}
						break;
					}else {
						System.out.println("[ERROR] Elija un valor valido");
					}
				}
				
				
				
			}else if (eStr.equalsIgnoreCase("5")){
				while(true) {
					System.out.println("¿Que desea cambiar de horas?");
					System.out.println("+------------------+");
					System.out.println("+ 1 Reparacion     +");
					System.out.println("+ 2 Revision       +");
					System.out.println("+------------------+");
					eStr = sc.nextLine();
					System.out.println("Usando esta opcion se"
							+ " invertira el valor de la finalizacion");
					if(eStr.equalsIgnoreCase("1") ) {
						System.out.print("Elija una id:");
						int eInt = sc.nextInt();
						if(eInt < listReparaciones.size() && eInt >= 0) {
							int horas = sc.nextInt();
							listReparaciones.get(eInt).setHoras(horas);
							System.out.println("Horas: " 
							+ listReparaciones.get(eInt).getHoras());
						}else {
							System.out.println("[ERROR] No existe dicha reparacion");
						}
						break;
					}else if(eStr.equalsIgnoreCase("2")){
						System.out.print("Elija una id:");
						int eInt = sc.nextInt();
						if(eInt < listRevisiones.size() && eInt >= 0) {
							int horas = sc.nextInt();
							listRevisiones.get(eInt).setHoras(horas);
							System.out.println("Horas: " 
									+ listRevisiones.get(eInt).getHoras());
						}else {
							System.out.println("[ERROR] No existe dicha revision");
						}
						break;
					}else {
						System.out.println("[ERROR] Elija un valor valido");
					}
				}
			}else if (eStr.equalsIgnoreCase("6")) {
				break;
			}else {
				if(eStr.equalsIgnoreCase("")) {
				System.out.println("[ADVERTENCIA] Scanner salto valores y genero un"
									+ " error en dicho caso ingnore este mensaje" );
				}else {
					System.out.println("No se encontro el valor ||"
							+ " ERROR: Escriba un valor posible");
				}
			}
			
		}
		sc.close();
		
	}
}
