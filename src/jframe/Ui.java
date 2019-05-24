package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.JToggleButton;

public class Ui extends JFrame {
	Scanner sc = new Scanner(System.in);
	JLabel jlabelID,jlabeltitle,jlabelbody;
	JTextField jtextfiledId,jtextTitle,jtextBody;
	JButton jbuttonsave,jbuttonexit;
	//private JLabel ;
	static Connection con;
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public Ui(){
		setTitle("UI JDBC");
		setSize(600, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpanal = new JPanel();
		jpanal.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
		jlabelID =new JLabel("ID");
		jlabeltitle= new JLabel("Title");
		jlabelbody= new JLabel("Body");
		
		jtextfiledId = new JTextField(10);
		jtextTitle = new JTextField(10);
		jtextBody = new JTextField(10);
		jbuttonsave = new JButton("save");
		jbuttonexit = new JButton("Exit");
		
		jpanal.add(jlabelID);
		jpanal.add(jtextfiledId);
		jpanal.add(jlabeltitle);
		jpanal.add(jtextTitle);
		jpanal.add(jlabelbody);
		jpanal.add(jtextBody);
		jpanal.add(jbuttonsave);
		jpanal.add(jbuttonexit);
		add(jpanal);
	
		jbuttonsave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("save is clicked");
				System.out.println("enter the post id");
				//int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the post title");
				
				//String title= sc.nextLine();
				System.out.println("enter the post body");
				//String  body = sc.nextLine();
				
				//int id = e.getActionCommand();
				String title = e.getActionCommand();
				String body = e.getActionCommand();
				
				
				try {
					PreparedStatement prp = con.prepareStatement("insert into post values(?,?,?)");
					//prp.setInt(1,id);
					prp.setString(2, title);
					prp.setString(3,body);
					int i = prp.executeUpdate();
					System.out.println("no.of rows affected" +i);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		//jbuttonsave.addActionListener((ActionEvent e) -> System.out.println("save is clicked"));
		setVisible(true);
		
	}
	
}
