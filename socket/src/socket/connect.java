package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sun.rmi.runtime.Log;

public class connect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//View v;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmm");
        String strTime = simpleDateFormat.format(new Date());
        String testconnect = "imei:354777031525012,tracker,"+strTime+",,F,0000.0000,A,0000.0000,N,0000.0000,E,0;";
        String str_orderd_list = "imei:353451047760580:orders_list,quit;";
        System.out.println(strTime); 
        System.out.println(testconnect);
		try {
            /*//Log.v("Tcp","Clicked the button");
               InetAddress serveraddress=InetAddress.getByName("127.0.0.1");
              // Log.v("Tcp", "Got the InetAddress");
            Socket s = new Socket(serveraddress,1111);
            //Log.v("Tcp","Got the Socket address");
            OutputStream out = s.getOutputStream();
            PrintWriter output = new PrintWriter(out);
            byte[] b;
            
			//out.write(b);
            output.print("imei:354777031525012,tracker,DDMMYYHHmm,,,,A,4912.8247,N,01634.1452,E,speed;");
            out.close();*/
            
            PrintWriter out = null;
            PrintWriter in = null;
            //BufferedReader in = null;
            Socket clientSocketOut = null;
            Socket clientSocketIn = null;
            String fromServer;

            //clientSocket = new Socket("localhost", 35570);
            //clientSocketOut = new Socket("90.189.119.84", 35570);
            clientSocketIn = new Socket("90.189.119.84", 35572);
            
            //out = new PrintWriter(clientSocketOut.getOutputStream(), true);
            in = new PrintWriter(clientSocketIn.getOutputStream(), true);
            /*in = new BufferedReader(new inputStreamReader( clientSocketIn.getInputStream()));

            // Цикл до тех пор, пока есть поступающие сообщения
            while ((fromServer = in.readLine()) != null) { 
            	//Отображаем полученное сообщение
            	System.out.println("Server: " + fromServer); 
            	}*/

             //out.println(testconnect);
             in.println(testconnect);
            //out.close();
            in.close();
            //clientSocketOut.close();
            clientSocketIn.close();

    } catch (UnknownHostException e) {
        System.out.println(e.toString());
        //Log.v("Tcp",e.toString());
    } catch (IOException e) {
    	System.out.println(e.toString());
        //Log.v("Tcp",e.toString());
    }catch (Exception e) {
    	System.out.println(e.toString());

    } 
}
	}


