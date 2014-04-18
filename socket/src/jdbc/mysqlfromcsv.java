package jdbc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class mysqlfromcsv {
	public static String pt = System.getProperty("user.home")+File.separator;
	static public final String driver = "com.mysql.jdbc.Driver";
	static public final String connection =	"jdbc:mysql://172.27.40.8:3306/test";
	static public final String user = "root";
	static public final String password =  "password";

	public static void main(String args[]) {
		String err_string ="Usage: java -jar mysqlfromcsv.jar [host or ip] [database name] [csv file] [table name] [marker bill]";
		
		/*
	    String str_host ="localhost";
        String str_db="test";
        String str_file="C:/SERVER/JARS/openfiles_monitoring.txt";
        String str_table="model_bill_monitoring_proc";
        String str_marker="MODUS";	
		*/
		
		String str_host ="";
        String str_db="";
        String str_file="";
        String str_table="";
        String str_marker="";
                
        if (args.length!=5) {
        	System.out.println(err_string);
        	System.exit(0);
        }
        
        if ((args[0])=="") {
        	System.out.println(err_string);
        	System.exit(0);
        } else {
        str_host   =args[0];
        }

        if ((args[1])=="") {
        	System.out.println(err_string);
        	System.exit(0);
        } else {
        str_db   =args[1];
        }

        if ((args[2])=="") {
        	System.out.println(err_string);
        	System.exit(0);
        } else {
        str_file   =args[2];
        }

        if ((args[3])=="") {
        	System.out.println(err_string);
        	System.exit(0);
        } else {
        	str_table   =args[3];
        }

        if ((args[4])=="") {
        	System.out.println(err_string);
        	System.exit(0);
        } else {
        	str_marker   =args[4];
        }
        
        
        String str_connection =	"jdbc:mysql://"+str_host+":3306/"+str_db+"?characterEncoding=UTF-8";
    	String[] t ;
 
	try {
	Class.forName(driver);
	Connection con = DriverManager.getConnection(str_connection, user, password);

	//System.out.println("Jdbc Mysql Connection String :");
	//System.out.println(connection);
	//System.out.println("User Name :" + user);
	//System.out.println("Password :" + password);
	String vcnt; 
	Statement stmt=con.createStatement();
	ResultSet rs = null;
	//rs=stmt.executeQuery("set character utf8");
	//rs=stmt.executeQuery("set names utf8");
	
	System.err.println(System.getProperty("user.home")+File.separator);
    //----------------
    Logger log = Logger.getAnonymousLogger();
    StringBuilder sb = new StringBuilder();
    try {
    	//System.out.println(str_file);
     InputStream inputStream = new FileInputStream(new File(/*pt + */str_file));
     BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
     try {
     String line = reader.readLine();
     while (line != null) {
     //	 System.out.println(line);
     //sb.append(line);
     line = reader.readLine();
     line = line.replace((char) 34,(char) 32);
     //System.out.println( (int) '"' );
     //System.out.println( (char) 34 );
     //System.out.println(line.toString());
     //String utf8String= new String(line.getBytes("windows-1251"),"UTF-8");
     //String cp1251text = line;
     //String utf8text = new String(cp1251text.getBytes("utf-8")); 
 	 
 	//str_table="model_bill_monitoring";
 	//System.out.println(str_table.equalsIgnoreCase("model_bill_monitoring")); 	 
 
 	 if (str_table.equalsIgnoreCase("model_bill_monitoring")) {
     	String delims = "[;]";
 		t = line.split(delims);
 		 String sqltxt="insert into model_bill_monitoring (bill,f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18) values (upper('"+t[0]+"'),'"+t[1]+"','"+t[2]+"','"+t[3]+"','"+t[4]+"','"+t[5]+"','"+t[6]+"','"+t[7]+"','"+t[8]+"','"+t[9]+"','"+t[10]+"','"+t[11]+"','"+t[12]+"','"+t[13]+"','"+t[14]+"','"+t[15]+"','"+t[16]+"','"+t[17]+"','"+t[18]+"','"+t[19]+"')";
 		 System.out.println(sqltxt);
 		//System.out.println("length array "+t.length);
 		 stmt.executeUpdate(sqltxt);
 	 }

 	 if (str_table.equalsIgnoreCase("model_bill_monitoring_proc")) {
     	String delims = "[,]";
 		t = line.split(delims);
 		 if (t.length==5) {
 			String sqltxt="insert into model_bill_monitoring_proc (bill,histdate,os_id,os_user,os_pid,procname,os_file,open_type) values (upper('"+str_marker+"'),now(),'"+t[0].trim()+"','"+t[1].trim()+"','"+t[2].trim()+"','"+t[3].trim()+"','"+t[4].trim()+"','LOCAL')";
 	 		 System.out.println(sqltxt);
 	 		 //System.out.println("length array "+t.length);
 	 		 stmt.executeUpdate(sqltxt);
 		 }
 		 if (t.length==7) {
 			String t5 = new String(t[5].getBytes("Cp866"));
 			String sqltxt="insert into model_bill_monitoring_proc (bill,histdate,hostname,os_id,os_user,os_type,os_locks,os_rezhim,os_file,open_type) values (upper('"+str_marker+"'),now(),'"+t[0].trim()+"','"+t[1].trim()+"','"+t[2].trim()+"','"+t[3].trim()+"','"+t[4].trim()+"','"+""+"','"+t[6].trim()+"','NETWORK')";
 	 		 System.out.println(sqltxt);
 	 		 //System.out.println("length array "+t.length);
 	 		 stmt.executeUpdate(sqltxt);
 		 }
 	 } 	 
 	 //rs=stmt.executeQuery(sqltxt);
     
     }
     } finally {
     reader.close();
     }
    } catch (IOException e) {
     log.info("Caught exception while processing file: " + e.getMessage());
    }

	
	
	

	
	//ResultSetMetaData meta = rs.getMetaData();
	//System.out.println(rs.getConcurrency());
	//System.out.println(meta.getColumnCount());
	
	//System.out.println(meta.getColumnLabel(1));
	//System.out.println(meta.getColumnDisplaySize(1));
	/*while (rs.next()) 
	{
	 vcnt = rs.getString("cnt");
	 System.out.println(vcnt);
	}*/

	rs.close();
	if (!con.isClosed()) {
	con.close();
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
	}
}
