package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import sun.rmi.runtime.Log;

public class connect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//View v;
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
            BufferedReader in = null;
            Socket clientSocket = null;
            String fromServer;

            clientSocket = new Socket("localhost", 35570);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            /*in = new BufferedReader(new inputStreamReader( clientSocket.getInputStream()));

            // Цикл до тех пор, пока есть поступающие сообщения
            while ((fromServer = in.readLine()) != null) { 
            	//Отображаем полученное сообщение
            	System.out.println("Server: " + fromServer); 
            	}*/
             out.println("imei:354777031525012,tracker,DDMMYYHHmm,,,,A,4912.8247,N,01634.1452,E,speed;");
            out.close();
            in.close();
            clientSocket.close();

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


