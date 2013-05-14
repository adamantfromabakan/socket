package jdbc;

import java.sql.*;

import oracle.jdbc.driver.*;

public class oracleconn {


	    final private static String driverName = "oracle.jdbc.driver.OracleDriver";
	    private static String url;
	    final private static String server = "10.1.1.12";
	    final private static String port = "1521";
	    final private static String sid = "ADAMANT";
	    final private static String username = "AG_CHEMA";
	    final private static String password = "ag";
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
	    	ResultSet rs=stmt.executeQuery("SELECT table_name FROM user_tables");
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
