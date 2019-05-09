package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	Connection con;

	public Test() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
	}

	public void add() throws SQLException {
		String ans;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter post id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter post title");
		String title = sc.nextLine();
		System.out.println("Enter post body");
		String body = sc.nextLine();
		String sql = "insert into posts values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, title);
		pst.setString(3, body);
		int i = pst.executeUpdate();
		System.out.println("rows afffected is: " + i);
		System.out.println("do you want to enter another value (y/n) ");
		ans = sc.nextLine();
		}while(ans.equals("y"));

	}

	public void delete() throws SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter post id");
		int id = s.nextInt();
		s.nextLine();
		String sql1 = "delete from posts where id = ?";
		PreparedStatement pst = con.prepareStatement(sql1);
		pst.setInt(1, id);
		int i = pst.executeUpdate();
		System.out.println("rows afffected is: " + i);

	}

	public void update() throws Exception {
		Scanner sss = new Scanner(System.in);
		System.out.println("Enter the required title name");
		String title = sss.nextLine();
		System.out.println("Enter the is where you want to change ");
		int id = sss.nextInt();
		String query = "update posts set title = ? where id = ?";
		PreparedStatement pstt = con.prepareStatement(query);
		pstt.setString(1, title);
		pstt.setInt(2, id);
		int res = pstt.executeUpdate();
		System.out.println("rows affexted : " + res);

	}

	public void fetch() throws Throwable {
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the id in which you want to fetch");
		int id = s3.nextInt();
		PreparedStatement psttt = con.prepareStatement("select * from posts where id = ?");
		psttt.setInt(1, id);
		ResultSet rs = psttt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
		}
		
	}
	public void display() throws Exception {
		Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery("select*from posts");
	    while (rs.next()) {
	    	System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
	    	
	    	
	    }
	}

}
