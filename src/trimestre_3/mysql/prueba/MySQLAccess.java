package trimestre_3.mysql.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
	
	/*
	 * Almacenamos la conexión con nuestra bd en 
	 * un objeto de tipo Connection. La abrimos cuando
	 * queremos empezar a operar con la BD y siempre
	 * debemos cerrarla al finalizar.
	 */
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	/*
	 * Almacena el resultado de las consultas en un dato de 
	 * tipo ResultSet, que tiene sus propios métodos para trabajar
	 * con las tablas y columnas.
	 */
	private ResultSet resultSet = null;
	
	/*
	 * Almacenamos los datos de conexión con nuestra BD.
	 */
	final private String host = "localhost:3306/pruebas_prog";
	final private String user = "root";
	final private String passwd = "root";

	public void readDataBase() throws Exception {
		try {
			/*
			 * Cargamos el driver MySQL que hemos descargado anteriormente.
			 * Cada BD tiene su propio driver, este únicamente es para 
			 * las BD MysSQL.
			 */
			Class.forName("com.mysql.jdbc.Driver");
   
			// Setup the connection with the DB
			/*
			 * Establecemos la conexión con nuestra BD utilizando
			 * los datos de conexión que teníamos almacenados
			 * anteriormente.
			 */
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );

		   /*
		    * Creamos statement para que la BD nos permita realizar
		    * consultas
		    */
		   statement = connect.createStatement();
		   /*
		    * Invocamos al método escribir, que muestra por pantalla
		    * el resultado de la consulta anterior.
		    */
		   resultSet = statement
			       .executeQuery("SELECT * from prog");
		   writeResultSet(resultSet);
		   /*
		    * Cuando queremos utilizar variables para realizar las consultas y 
		    * además queremos hacerlas de forma más eficiente podemos usar
		    * preparedStatement.
		    */
		   preparedStatement = connect
		       .prepareStatement("insert into prog(id,"
		       					+ " string)"
		       					+ " values (?, ?)");
		  
		   preparedStatement.setInt(1, 2);
		   preparedStatement.setString(2, "Hola");
		   //preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
		   System.out.println("QUERY ---> insertando...");
		   preparedStatement.executeUpdate();
		
		   preparedStatement = connect
				   .prepareStatement("SELECT * from prog");
		   System.out.println("QUERY ---> haciendo select...");
		   System.out.println("-ID   -  DATA-");
		   resultSet = preparedStatement.executeQuery();
		   writeResultSet(resultSet);
		   
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
	}

	/**
	 * Pre: ---
	 * Post: muestra por pantalla el contenido almacenado en [resultSet].
	 */
	private void writeResultSet(ResultSet resultSet) throws SQLException {
		/*
		 * Mientras resultSet contenga más usuarios, seguimos avanzando
		 * de manera similar a los ficheros de texto.
		 */
		while (resultSet.next()) {
			/*
			 * Podemos seleccionar la columna de la que queremos leer el dato
			 * poniendo su nombre, o también indicando su número de columna...
			 * siempre empezando desde 1!
			 * 				EJ: resultSet.getSTring(2);
			 */
		   int id = resultSet.getInt(1);
		   String data = resultSet.getString(2);
		   System.out.println("" + id + "  -  "+  data);
		}
	}

	/**
	 * Pre: ---
	 * Post: cerramos todas las conexiones abiertas, el resultSet
	 * 		y el statement. Si no se cierran correctamente, puede
	 * 		ocurrir que las consultas no devuelvan el resultado esperado.
	 * 		Además, si dejamos muchas conexiones a la BD abiertas
	 * 		podemos llegar a saturarla y no aceptará más conexiones. 
	 */
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			} if (statement != null) {
				statement.close();
			} if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {}
	}

}