package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try
        {
			
            Socket s = new Socket("90.189.119.84", 35572);
            //Socket s = new Socket("localhost", 8888);
            //Socket s = new Socket("smtp.yandex.ru", 25);
		    String message = "imei:353451047760580:orders_list,quit;";
		    message=message+"\n";//+s.getInetAddress().getHostAddress()+":"+s.getLocalPort();
            s.getOutputStream().write(message.getBytes());
            //s.setSoTimeout(100);            
            //            byte buf[] = new byte[64*1024];
            //int r = s.getInputStream().read(buf);
            //String data = new String(buf, 0, r);
            //System.out.println(data);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF8"),16384);
            //System.out.println( in.readLine() );

            String line = null;
            StringBuilder responseData = new StringBuilder();
            while((line = in.readLine()) != null) {
            	//System.out.println( line);
            	//String phrase = line;
            	//String delims = "[|]";
            	//String[] tokens = phrase.split(delims);
            	System.out.println(line);
            }          
           
        }
        catch(Exception e)
        {System.out.println("init error: "+e);}
		
		
	}

}
/* Reads UTF-8 character data; lines are terminated with '\n' 
public static String readLine(InputStream in) throws IOException {
  ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  while (true) {
    int b = in.read();
    if (b < 0) {
      throw new IOException("Data truncated");
    }
    if (b == 0x0A) {
      break;
    }
    buffer.write(b);
  }
  return new String(buffer.toByteArray(), "UTF-8");
}
*/