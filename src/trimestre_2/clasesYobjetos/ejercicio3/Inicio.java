package trimestre_2.clasesYobjetos.ejercicio3;
import java.util.Scanner;

public class Inicio {
	
	public static void spaces(int sp) {
		for(int i = 0; i < sp; i++) {
			System.out.println();	
		}		
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------\n"+
							"PROGRAMA GESTOR DE ELECTRODOMESTICOS\n"+
							"------------------------------------");
		System.out.print("Cuantas Maximas televisiones desea crear?");
		int cels = sc.nextInt();
		Television[] tv = new Television[cels];
		System.out.print("Cuantas Maximas Lavadoras desea crear?");
		cels = sc.nextInt();
		Lavadoras[] la = new Lavadoras[cels];
		System.out.print("Cuantas Maximas Electrodomesticos desea crear?");
		cels = sc.nextInt();
		Electrodomestico[] el = new Electrodomestico[cels];
		boolean newp = true;
		int ctv = 0;
		int	cla = 0;
		int cel = 0;
		int opt = -1;
		double resolucion;
		boolean sintetizadorTDT;
		double precio;
		String color;
		String consumo;
		double peso;
		double carga;
		while(true) {
			resolucion = 0;
			sintetizadorTDT = false;
			precio = 0;
			color = "";
			consumo ="";
			peso = 0;
			carga = 0;
			spaces(20);
			System.out.println("¿Que desea añadir?"
					+ "\n 1 = new Tv"
					+ "\n 2 = new Lavadora"
					+ "\n 3 = new Elecrodomestico"
					+ "\n 4 = Exit");
			opt = sc.nextInt();
			if(newp == false) {
				System.out.println("Televisiones " + ctv + " de " + tv.length);
				System.out.println("Lavadoras " + cla + " de " + la.length);
				System.out.println("Electrodomesticos " + cel + " de " + el.length);
			}
			if(opt == 1) {
				if(ctv == tv.length) {
					System.out.println("Alcanzaste el limite");
				}else {	
					System.out.print("Resolucion:");
					resolucion = sc.nextDouble();
					System.out.print("Sintetizador TDT:");
					sintetizadorTDT = sc.nextBoolean();
					System.out.print("Precio:");
					precio = sc.nextDouble();
					System.out.print("Color:");
					color = sc.next();
					System.out.print("Consumo:");
					consumo = sc.next();
					System.out.print("Peso:");
					peso = sc.nextDouble();
					tv[ctv] = new Television(resolucion,sintetizadorTDT,precio,color,consumo,peso);
					ctv++;	
				}
			}else if(opt == 2) {
				if(cla == la.length) {
					System.out.println("Alcanzaste el limite");
				}else {	
					System.out.print("Precio:");
					precio = sc.nextDouble();
					System.out.print("Color:");
					color = sc.next();
					System.out.print("Consumo:");
					consumo = sc.next();
					System.out.print("Peso:");
					peso = sc.nextDouble();
					System.out.print("Carga:");
					carga = sc.nextDouble();
					la[cla] = new Lavadoras(precio,color,consumo,peso,carga);
					cla++;
				}
				
			}else if(opt == 3) {
				if(cel == el.length) {
					System.out.println("Alcanzaste el limite");
				}else {
					System.out.print("Precio:");
					precio = sc.nextDouble();
					System.out.print("Color:");
					color = sc.next();
					System.out.print("Consumo:");
					consumo = sc.next();
					System.out.print("Peso:");
					peso = sc.nextDouble();
					el[cel] = new Electrodomestico(precio,color,consumo,peso);
					cel++;
				}
			}else if(opt == 4) {
				break;
			}
			newp = false;
			
		}
		
	}
}