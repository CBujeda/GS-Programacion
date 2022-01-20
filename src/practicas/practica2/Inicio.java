package practicas.practica2;

public class Inicio {

	public static Boolean[][] genTable(int x, int y) {
		Boolean[][] t = new Boolean[y][x];
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				int a = (int) Math.round(Math.random()*100);
				if(a > 20) {
					t[i][j] = false; 
				}else{
					t[i][j] = true;
				}
			}
		}
		return t;
	}
	
	public static void main(String[] arg) {
		
		//-------------------X--Y--
		Visor.array(genTable(10,10));
		
	}
	
	
}
