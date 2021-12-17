package trimestre_1.APruebas;

public class Prueba30112021 {

	public static void main(String[] arg) {
		String[][] a = new String [10][10];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j< a[i].length; j++) {
				a[i][j] = "F" + i + "-C" + j;
				System.out.print(a[i][j] + " |");
			}
			System.out.println();
		}
	}
}
