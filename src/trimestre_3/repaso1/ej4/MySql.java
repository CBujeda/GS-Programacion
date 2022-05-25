package trimestre_3.repaso1.ej4;

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
		/*
		 * Almacena el resultado de las consultas en un dato de 
		 * tipo ResultSet, que tiene sus propios métodos para trabajar
		 * con las tablas y columnas.
		 */
		private ResultSet resultSet = null;
		final private String host = "localhost:3306/repaso1";
		final private String user = "root";
		final private String passwd = "root";
		
		
		public void setDato(Constructors constr) throws Exception {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager
						.getConnection("jdbc:mysql://" + host + "?"
								+ "user=" + user + "&password=" + passwd );
				   //statement = connect.createStatement();
				   preparedStatement = connect
					       .prepareStatement("insert into constructors(id_constructor,constructor_ref,name,nacionality,url)"
					       					+ " values (?, ?, ?, ?, ?)");
				   preparedStatement.setInt(1, constr.getConstructorId());
				   preparedStatement.setString(2, constr.getConstructorRef());
				   preparedStatement.setString(3,constr.getName());
				   preparedStatement.setString(4,constr.getNationality());
				   preparedStatement.setString(5,constr.getUrl());
				   preparedStatement.executeUpdate();
				   //connect.commit();
			} catch (Exception e) {
				throw e;
			} finally {
			    close();
			}
		}
		
		public void setDato2(Constructors_Standings constr) throws Exception {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager
						.getConnection("jdbc:mysql://" + host + "?"
								+ "user=" + user + "&password=" + passwd );
				   //statement = connect.createStatement();
				   preparedStatement = connect
					       .prepareStatement("insert into constructor_sendings(constructorStandingsId"+
					    		   				",raceId,constructorId,position,positionText,wins)"
					       					+ " values (?, ?, ?, ?, ?, ?)"); 
				   preparedStatement.setInt(1, constr.getConstructorStandingsId());
				   preparedStatement.setInt(2, constr.getRaceId());
				   preparedStatement.setInt(3, constr.getConstructorId());
				   preparedStatement.setInt(4, constr.getPosition());
				   preparedStatement.setString(5, constr.getPositionText());
				   preparedStatement.setInt(6, constr.getWins());
				   preparedStatement.executeUpdate();
				   //connect.commit();
			} catch (Exception e) {
				throw e;
			} finally {
			    close();
			}
		}
		
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
