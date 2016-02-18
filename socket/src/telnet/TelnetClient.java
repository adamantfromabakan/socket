package telnet;

import java.io.*;
import java.net.*;

public class TelnetClient {

   /**
    * @param args - host, port, username, password
    */
   public static void main(String[] args) 
   {
       //System.out.println("Starting");
       //System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
       new TelnetClient(args[0], args[1], args[2], args[3]);
   }

   public TelnetClient(String host, String port, String username, String password)
   {
       //System.out.println(host + " " +port + " " + username + " " + password);
       try
       {
           int intPort = Integer.parseInt(port);
           Socket telnet = new Socket(host, intPort);

           //System.out.println(intPort + " " + " " + telnet.getRemoteSocketAddress() + " " + telnet.isConnected());

           PrintWriter telnetOut = new PrintWriter(telnet.getOutputStream());
           telnetOut.println(username);
           telnetOut.println(password);
           String exit = "quit";
           telnetOut.println(exit);
           telnetOut.flush();

           InputStream telnetIn = telnet.getInputStream();

           telnetOut.close();
           telnetIn.close();
           telnet.close();
           //System.out.println(intPort + " " + " " + telnet.getRemoteSocketAddress() + " " + telnet.isConnected());
       }catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
}