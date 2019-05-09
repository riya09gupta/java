package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class Data1 {
	public static void main(String [] args) throws ClassNotFoundException, Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		System.out.println("connection stablish");
		String query = "insert into posts values(67,'riya','this is second title')";
		Statement  st = con.createStatement();
		int res = st.executeUpdate(query);
		System.out.println("rows affexted : "+res);
	}
}