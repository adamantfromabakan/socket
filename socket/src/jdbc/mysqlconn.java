package jdbc;
import java.sql.*;

import javax.swing.JOptionPane;

public class mysqlconn {

	static public final String driver = "com.mysql.jdbc.Driver";
	static public final String connection = 
	"jdbc:mysql://90.189.123.3:3306/mysql";
	static public final String user = "root";
	static public final String password =  JOptionPane.showInputDialog("Enter 'password'");

	public static void main(String args[]) {
	try {
	Class.forName(driver);
	Connection con = DriverManager.getConnection(connection, user, password);

	System.out.println("Jdbc Mysql Connection String :");
	System.out.println(connection);

	System.out.println("User Name :" + user);
	System.out.println("Password :" + password);
	String vHOST;String vUSER; 
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT HOST,USER FROM user WHERE user!='root'");
	ResultSetMetaData meta = rs.getMetaData();
	System.out.println(rs.getConcurrency());
	System.out.println(meta.getColumnCount());
	
	System.out.println(meta.getColumnLabel(1));
	System.out.println(meta.getColumnDisplaySize(1));
	while (rs.next()) 
	{
	 vHOST = rs.getString("HOST");
	 vUSER = rs.getString("USER");
	 System.out.println(vHOST + " " + vUSER);
	}
	//stmt.executeUpdate("create table greetings (id int, Name CHAR(100))");
	//stmt.executeUpdate("delete from greetings");
	//stmt.executeUpdate("alter table greetings add (id int)");
	//stmt.executeUpdate("alter table greetings drop Name");	
	//stmt.executeUpdate("alter table greetings add (Name CHAR(100))");
	//stmt.executeUpdate("insert into greetings values ('Hello, world!',1)");
	//stmt.executeUpdate("create table BlogPost (id LONG,title CHAR(128),body CHAR(254),date DATE,publishedName BOOLEAN)");
	rs.close();
	if (!con.isClosed()) {
	con.close();
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	
}
