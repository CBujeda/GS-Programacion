package trimestre_1.Ej_Repaso;
import java.util.Scanner;

public class Tarea_6 {

		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			String txt1 = sc.nextLine();
			String data = "";
			String txt2 = sc.nextLine();
			for(int i = txt1.length() -1; i > -1; i--) {
				data = data + txt1.substring(i, i + 1);
			}
			if(data.equals(txt2)) {
				System.out.println("¡SON ROTACIÓN!");
			}else {
				System.out.println("NO SON ROTACIÓN :(");
			}
		}
}
