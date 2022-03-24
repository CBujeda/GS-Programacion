package trimestre_3.mysql.prueba;

public class Inicio {
	public static void main(String[] args) throws Exception {
		MySQLAccess dao = new MySQLAccess();
		dao.readDataBase(); 
	}
}