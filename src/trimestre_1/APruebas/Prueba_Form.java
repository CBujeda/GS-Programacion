package trimestre_1.APruebas;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
public class Prueba_Form {

		private static void placeComponents(JPanel panel) {

			panel.setLayout(null);
			JLabel texto = new JLabel(" 0");
			texto.setBounds(10, 10, 80, 25);
			panel.add(texto);
			
			for(int i = 0; i < 30; i++) {
				
			}
		}
		
		public static void main(String[] args) {
			JFrame frame = new JFrame("Prueba");
			frame.setSize(600, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			frame.add(panel);
			placeComponents(panel);

			frame.setVisible(true);
		}

	
}
