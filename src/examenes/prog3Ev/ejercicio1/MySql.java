package examenes.prog3Ev.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import practicas.practica5.Avatar;
import practicas.practica5.Poder;

public class MySql {
		private Connection connect = null;
		private Statement statement = null;
		private PreparedStatement preparedStatement = null;

		private ResultSet resultSet = null;
		final private String host = "localhost:3306/examen";
		final private String user = "root";
		final private String passwd = "root";
		
		/**
		 * Pre:
		 * Post: Método el cual inserta los datos recibidos en MySql
		 */
		public void setDato(String dato, String letra, int linea) throws Exception {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager
						.getConnection("jdbc:mysql://" + host + "?"
								+ "user=" + user + "&password=" + passwd );
				//statement = connect.createStatement();
				preparedStatement = connect
					       .prepareStatement("insert into registro(palabra,letra,linea)"
					       					+ " values (?, ?, ?)");
				   
				preparedStatement.setString(1, dato);
				preparedStatement.setString(2, letra);
				preparedStatement.setInt(3, linea);
				preparedStatement.executeUpdate();
				//connect.commit();
			} catch (Exception e) {
				throw e;
			} finally {
			    close();
			}
		}
		
		/**
		 * Pre:
		 * Post: Método el cual cierra todas las conexiones
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
