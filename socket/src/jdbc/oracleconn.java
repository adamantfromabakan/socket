package jdbc;

import java.sql.*;

import javax.swing.JOptionPane;

import oracle.jdbc.driver.*;

public class oracleconn {


	    final private static String driverName = "oracle.jdbc.driver.OracleDriver";
	    private static String url;
	    final private static String server = "adamant-server";
	    final private static String port = "15211";
	    final private static String sid = "ADAMANT";
	    final private static String username = "adamant_chema";
	    final private static String password = JOptionPane.showInputDialog("Enter 'password'");
	    private static Connection connection;
	    private static boolean isConnected = false;
	    private static boolean connect() {
	    try {
	        url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + sid;
	        System.out.println(url);
	        Class.forName(driverName);
	        connection = DriverManager.getConnection(url, username, password);
	        System.out.println("connecting: " + url);
	        if(connection.equals(null))
	            isConnected = false;
	        else
	            isConnected = true;
	        String vtable_name;
	    	Statement stmt=connection.createStatement();
	    	ResultSet rs=stmt.executeQuery("SELECT say_hello_from_java_to('adamant') table_name FROM dual");
	    	ResultSetMetaData meta = rs.getMetaData();
	    	System.out.println(rs.getConcurrency());
	    	System.out.println(meta.getColumnCount());
	    	
	    	System.out.println(meta.getColumnLabel(1));
	    	System.out.println(meta.getColumnDisplaySize(1));
	    	while (rs.next()) 
	    	{
	    	 vtable_name = rs.getString("table_name");
	    	 System.out.println(vtable_name + " " );
	    	}
	    } catch (ClassNotFoundException e) {
	        System.out.println("ClassNotFoundException");
	        isConnected = false;
	    } catch (SQLException e) {
	        System.out.println("SQLException\n" + e.getMessage());
	        isConnected = false;
	    }
	    return isConnected;
	    }
	    public static void main(String[] args) {
	        if (connect()) System.out.println("connected");
	         else System.out.println("not connected");
	    }
	

}
