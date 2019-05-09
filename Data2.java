package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Data2 {
	public static void main(String [] args) throws ClassNotFoundException, Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		System.out.println("connection stablish");
		String query = "update posts set title = 'yogesh' where id = 1";
		Statement  st = con.createStatement();
		int res = st.executeUpdate(query);
		System.out.println("rows affexted : "+res);
	}

}
