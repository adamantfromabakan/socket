package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;



public class test2 {

	private static final String TAG = "SocketTAXI";
	
	public static void main(String[] args) {
	     

        String message = "imei:354473050898478:orders_409_free,quit;";
	    message=message+"\n";
       
		try {
            		            
            PrintWriter in = null;
            Socket clientSocketIn = null;

            clientSocketIn = new Socket("90.189.119.84", 35572);

            in = new PrintWriter(clientSocketIn.getOutputStream(), true);
            in.println(message);
            in.close();
            clientSocketIn.close();
            

    }catch (Exception e) {
    	System.out.println(TAG+ e.toString());
        }
}

}
