package practicas.practica5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlAccess {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	/*
	 * Almacena el resultado de las consultas en un dato de 
	 * tipo ResultSet, que tiene sus propios métodos para trabajar
	 * con las tablas y columnas.
	 */
	private ResultSet resultSet = null;
	final private String host = "localhost:3306/rol_game";
	final private String user = "root";
	final private String passwd = "root";
	
	
	
	
	
	
	
	
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
