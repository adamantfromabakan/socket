package telnet;
//Telnet Client

import java.io.*;
import java.net.*;

public class telnet_rebooter {

   /**
    * @param args - host, port, username, password
    */
   public static void main(String[] args) 
   {
       //System.out.println("Starting");
       //System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
       new telnet_rebooter(args[0], args[1], args[2], args[3]/*, args[4]*/);
   }

   public telnet_rebooter(String host, String port, String username, String password/*, String cmd*/)
   {
       System.out.println(host + " " +port + " " + username + " " + password);
       try
       {
           int intPort = Integer.parseInt(port);
           Socket socket = new Socket("172.16.16.247", 23);
           socket.setKeepAlive(true);
           BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           PrintWriter w = new PrintWriter(socket.getOutputStream(),true);

           int c=0;
           while ((c = r.read()) != -1)
               System.out.print((char)c);

           w.println("admin"); // also tried simply \n or \r
           w.flush();
           //Thread.sleep(1000);

           while ((c = r.read()) != -1)
               System.out.print((char)c);

           w.println("admindir320\r\n");
           //Thread.sleep(1000);

           while ((c = r.read()) != -1)
               System.out.print((char)c);

           socket.close();     
     /*      Socket soc=new Socket(host,intPort);
           String LoginName;
           String Password;
           String Command;
           
           
           DataInputStream din=new DataInputStream(soc.getInputStream());        
           DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

           System.out.println("Welcome to Telnet Client");
           System.out.println("Your Credential Please...");
           System.out.print("Login Name :");

           LoginName=br.readLine();
           
           System.out.print("Password :");
           Password=br.readLine();
           
           dout.writeUTF(LoginName);
           dout.writeUTF(Password);

           if (din.readUTF().equals("ALLOWED"))
           {
               do
               {
               System.out.print("< Telnet Prompt >");
               Command=br.readLine();            
               dout.writeUTF(Command);
               if(!Command.equals("quit"))
               {
                   System.out.println(din.readUTF());        
               }                
               }while(!Command.equals("quit"));
           }
           soc.close();  */
       }catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
}



