package practicas.practica5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	
	
	public ArrayList<String[]> getImg() throws Exception {
		ArrayList<String[]> imgs = new ArrayList<String[]>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			statement = connect.createStatement();
			   resultSet = statement
				       .executeQuery("SELECT * from img");
				while (resultSet.next()) {
				   String data = resultSet.getString(2);
				   imgs.add(data.split(","));
				}
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
		return imgs;
	}
	
	
	
	public ArrayList<Avatar> getAvatar() throws Exception {
		ArrayList<Avatar> avatar = new ArrayList<Avatar>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			statement = connect.createStatement();
			   resultSet = statement
				       .executeQuery("SELECT * from avatares");
				while (resultSet.next()) {
				   String data = resultSet.getString(2);
				   int data2 = resultSet.getInt(3);
				   avatar.add(new Avatar(data, data2));
				}
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
		return avatar;
	}
	
	
	public ArrayList<Arma> getArma() throws Exception {
		ArrayList<Arma> Arma = new ArrayList<Arma>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			statement = connect.createStatement();
			   resultSet = statement
				       .executeQuery("SELECT * from arma");
				while (resultSet.next()) {
				   String data = resultSet.getString(2);
				   int data2 = resultSet.getInt(3);
				   Arma.add(new Arma(data, data2));
				}
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
		return Arma;
	}
	
	public ArrayList<Pregunta> getPregunta() throws Exception {
		ArrayList<Pregunta> pregunta = new ArrayList<Pregunta>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			statement = connect.createStatement();
			   resultSet = statement
				       .executeQuery("SELECT * from pregunta");
				while (resultSet.next()) {
				   String data = resultSet.getString(2);
				   String data2 = resultSet.getString(3);
				   String data3 = resultSet.getString(4);
				   pregunta.add(new Pregunta(data,data2,data3));
				}
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
		return pregunta;
	}
	
	
	public ArrayList<Poder> getPoder() throws Exception {
		ArrayList<Poder> poder = new ArrayList<Poder>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			statement = connect.createStatement();
			   resultSet = statement
				       .executeQuery("SELECT * from poder");
				while (resultSet.next()) {
				   String data = resultSet.getString(2);
				   int data2 = resultSet.getInt(3);
				   int data3 = resultSet.getInt(4);
				   poder.add(new Poder(data,data2,data3));
				}
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
		return poder;
	}
	
	public ArrayList<RankPorf> getRank() throws Exception {
		ArrayList<RankPorf> poder = new ArrayList<RankPorf>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			statement = connect.createStatement();
			   resultSet = statement
				       .executeQuery("SELECT * from ranklist");
				while (resultSet.next()) {
				   String data = resultSet.getString(2);
				   int data2 = resultSet.getInt(3);
				   int data3 = resultSet.getInt(4);
				   poder.add(new RankPorf(data,data2,data3));
				}
		} catch (Exception e) {
			throw e;
		} finally {
		    close();
		}
		return poder;
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
