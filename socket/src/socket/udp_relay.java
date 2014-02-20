package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udp_relay {
    public static void main(String args[])
    {
        DatagramSocket sock = null;
        DatagramSocket sock_relay = null;
        //int port = 53;
        //String hoststr = "172.27.40.246";
        
        String hoststr = "127.0.0.1";
        int port = 0;

        if ((args[0])=="") {
        	hoststr = "127.0.0.1";
       } else {
    	    hoststr = args[0];
       }
        
        if ((args[1])=="") {
        	 port = 0;
        } else {
        	 port = Integer.parseInt(args[1]);
        }
        
        
        try
        {
            //1. creating a server socket, parameter is local port number
            sock = new DatagramSocket(port);
            sock_relay = new DatagramSocket();
            InetAddress host_relay = InetAddress.getByName(hoststr);
             
            //buffer to receive incoming data
            byte[] buffer = new byte[65536];
            DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
             
            //2. Wait for an incoming data
            echo("Server socket created. Waiting for incoming data...");
             
            //communication loop
            while(true)
            {
                sock.receive(incoming);
                byte[] data = incoming.getData();
                String s = new String(data, 0, incoming.getLength());
                
                ///////////relay send from recieve data////////////////////////////
                byte[] b = s.getBytes();
                DatagramPacket  dp_relay = new DatagramPacket(b , b.length , host_relay , port);
                sock_relay.send(dp_relay); 
                byte[] buffer_reply = new byte[65536];
                DatagramPacket reply = new DatagramPacket(buffer_reply, buffer_reply.length);
                sock_relay.receive(reply);
                 
                byte[] data_reply = reply.getData();
                String s_reply = new String(data_reply, 0, reply.getLength());
                ///////////////////////////////////////////////////////////////////
                
                //echo the details of incoming data - client ip : client port - client message
                echo(incoming.getAddress().getHostAddress() + " : " + incoming.getPort() + " - " + s);
                s = "OK : " + s;
                DatagramPacket dp = new DatagramPacket(s_reply.getBytes() , s_reply.getBytes().length , incoming.getAddress() , incoming.getPort());
                sock.send(dp);
            }
        }
         
        catch(IOException e)
        {
            System.err.println("IOException " + e);
        }
    }
     
    //simple function to echo data to terminal
    public static void echo(String msg)
    {
        System.out.println(msg);
    }
}
