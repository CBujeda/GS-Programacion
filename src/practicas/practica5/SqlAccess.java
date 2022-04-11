package practicas.practica5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Dicha clase se encarga de hacer las conexiones mysql
 */
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
	
	
	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la tabla img de la BBDD
	 */
	public ArrayList<String[]> getImg() throws Exception {
		ArrayList<String[]> imgs = new ArrayList<String[]>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			preparedStatement = connect
					   .prepareStatement("SELECT * from img");
			resultSet = preparedStatement.executeQuery();
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
	
	
	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la tabla avatares de la BBDD
	 */
	public ArrayList<Avatar> getAvatar() throws Exception {
		ArrayList<Avatar> avatar = new ArrayList<Avatar>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			preparedStatement = connect
					   .prepareStatement("SELECT * from avatares");
			resultSet = preparedStatement.executeQuery();
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
	
	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la tabla arma de la BBDD
	 */
	public ArrayList<Arma> getArma() throws Exception {
		ArrayList<Arma> Arma = new ArrayList<Arma>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			preparedStatement = connect
					   .prepareStatement("SELECT * from arma");
			resultSet = preparedStatement.executeQuery();
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
	
	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la tabla pregunta de la BBDD
	 */
	public ArrayList<Pregunta> getPregunta() throws Exception {
		ArrayList<Pregunta> pregunta = new ArrayList<Pregunta>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			preparedStatement = connect
					   .prepareStatement("SELECT * from pregunta");
			resultSet = preparedStatement.executeQuery();
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
	
	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la tabla poder de la BBDD
	 */
	public ArrayList<Poder> getPoder() throws Exception {
		ArrayList<Poder> poder = new ArrayList<Poder>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			preparedStatement = connect
					   .prepareStatement("SELECT * from poder");
			resultSet = preparedStatement.executeQuery();
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
	
	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la tabla ranklist de la BBDD
	 */
	public ArrayList<RankPorf> getRank() throws Exception {
		ArrayList<RankPorf> poder = new ArrayList<RankPorf>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			preparedStatement = connect
					   .prepareStatement("SELECT * from ranklist");
			resultSet = preparedStatement.executeQuery();
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
	
	/**
	 * Pre:
	 * Post: Metodo el cual inserta a la tabla ranklist de la BBDD un dato
	 */
	public void setRank(RankPorf rank) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			   //statement = connect.createStatement();
			   preparedStatement = connect
				       .prepareStatement("insert into ranklist(name,vida,puntos)"
				       					+ " values (?, ?, ?)");
			   
			   preparedStatement.setString(1, rank.getName());
			   preparedStatement.setInt(2, rank.getVida());
			   preparedStatement.setInt(3, rank.getPuntos());
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
	 * Post: Metodo el cual inserta a la tabla avatares de la BBDD un dato
	 */
	public void setAvatar(Avatar avatar) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			   //statement = connect.createStatement();
			   preparedStatement = connect
				       .prepareStatement("insert into avatares(name,vida)"
				       					+ " values (?, ?)");
			   
			   preparedStatement.setString(1, avatar.getName());
			   preparedStatement.setInt(2, avatar.getVida());
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
	 * Post: Metodo el cual inserta a la tabla arma de la BBDD un dato
	 */
	public void setArma(Arma arma) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			   //statement = connect.createStatement();
			   preparedStatement = connect
				       .prepareStatement("insert into arma(name,danno)"
				       					+ " values (?, ?)");
			   
			   preparedStatement.setString(1, arma.getName());
			   preparedStatement.setInt(2, arma.getDanno());
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
	 * Post: Metodo el cual inserta a la tabla pregunta de la BBDD un dato
	 */
	public void setPregunta(Pregunta pregunta) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			   //statement = connect.createStatement();
			   preparedStatement = connect
				       .prepareStatement("insert into pregunta(pregunta,resp_correcta,resp_incorrecta)"
				       					+ " values (?, ?,?)");
			   
			   preparedStatement.setString(1, pregunta.getPregunta());
			   preparedStatement.setString(2, pregunta.getCorrecta());
			   preparedStatement.setString(3, pregunta.getIncorrecta());
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
	 * Post: Metodo el cual inserta a la tabla poder de la BBDD un dato
	 */
	public void setPoder(Poder poder) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?"
							+ "user=" + user + "&password=" + passwd );
			   //statement = connect.createStatement();
			   preparedStatement = connect
				       .prepareStatement("insert into poder(name,danno,defensa)"
				       					+ " values (?, ?,?)");
			   
			   preparedStatement.setString(1, poder.getName());
			   preparedStatement.setInt(2, poder.getDanno());
			   preparedStatement.setInt(3, poder.getDefensa());
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
	 * Post: Metodo el cual cierra toda conexion con MySql
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
