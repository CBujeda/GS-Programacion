package retos.reto1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	
	/*
	public static ArrayList<Integer> organizador(ArrayList<Integer> l){
		int temp = 0;
		for(int i = 0; i < l.size(); i++) {
			for(int j = i+1; j < l.size(); j++) {
				if(l.get(i) < l.get(j)) {
					temp = l.get(j);
					l.set(j, l.get(i));
					l.set(i, temp);
				}
			}
		}
		return l;
	}
	*/
	public static ArrayList<Integer> reader(String dato) {
		File file = new File(dato);
		ArrayList<Integer> l = new ArrayList<Integer>();
		try {
			Scanner f = new Scanner(file);
			int total = 0;
			while(f.hasNextLine()) {
				total = 0;
				String linea = f.next();
				String [] data = linea.split(":");
				total = Integer.parseInt(data[0]) * 3600;
				total = total + Integer.parseInt(data[1]) * 60;
				total = total + Integer.parseInt(data[2]);
				
				l.add(total);
			}
			f.close();
	
			} catch(FileNotFoundException e) {
				System.out.println("El fichero " + dato + " no ha podido ser abierto.");
			}
		
			return l;
		}
	
	
	
	public static void main(String[] arg) {
		ArrayList<Integer> l = reader("C:\\eclip\\reto\\prueba1.txt");
		
		ArrayList<Agrup> la = new ArrayList<Agrup>();
		for(int i = 0; i < l.size(); i++) {
			la.add(new Agrup(l.get(i),0));
		}
		
		int a = 1;
		boolean temp = false;
		for(int i = 0; i< la.size(); i++) {
			temp = false;
			for(int j = i +1; j < la.size(); j++) {
				if(		la.get(i).getS()+1 == la.get(j).getS()||
						la.get(i).getS()-1 == la.get(j).getS()||
						la.get(i).getS() == la.get(j).getS()) {
					
					la.get(i).setG(a);
					la.get(j).setG(a);
					temp = true;
				}
			}
			System.out.println(la.get(i).getS());
		
		}
		
		for(int i = 0; i < la.size(); i++) {
			System.out.println(la.get(i).getG());
		}
		
		
		
		
	}

}
