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
       new TelnetClient(args[0], args[1], args[2], args[3]/*, args[4]*/);
   }

   public TelnetClient(String host, String port, String username, String password/*, String cmd*/)
   {
       System.out.println(host + " " +port + " " + username + " " + password);
       try
       {
           int intPort = Integer.parseInt(port);
           Socket telnet = new Socket(host, intPort);

           System.out.println(intPort + " " + " " + telnet.getRemoteSocketAddress() + " " + telnet.isConnected());

           PrintWriter telnetOut = new PrintWriter(telnet.getOutputStream());
           telnetOut.println(username);
           telnetOut.println(password);
           InputStream telnetIn = telnet.getInputStream();
           DataInputStream din=new DataInputStream(telnetIn);
           System.out.println(din.readUTF());
         /*  if (cmd == "") {
               String exit = "reboot";
               telnetOut.println(exit);
               telnetOut.flush();
           } else {
               String txtcmd = cmd;
               telnetOut.println(txtcmd);
               telnetOut.flush();
           } */          
           String exit = "reboot";
           telnetOut.println(exit);
           telnetOut.flush();

           //InputStream telnetIn = telnet.getInputStream();

           telnetOut.close();
           telnetIn.close();
           telnet.close();
           System.out.println(intPort + " " + " " + telnet.getRemoteSocketAddress() + " " + telnet.isConnected());
       }catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
}