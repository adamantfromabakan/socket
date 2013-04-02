package socket;

import java.io.*;
import java.net.*;

class SampleClient extends Thread
{
    public static void main(String args[])
    {
        try
        {
            // открываем сокет и коннектимся к localhost:3128
            // получаем сокет сервера
            String str_command = "";
            String str_address = "localhost";
            String str_port = "0";        	
            
            String str_orderd_list = "imei:353451047760580:orders_list,quit;";

            str_address=args[0];
            str_port   =args[1];
            str_command=args[2];
/*
            str_address="localhost";
            str_port   ="80";
            str_command="POST http://localhost/mtrtalks/listverify.php";
*/

            Socket s = new Socket(str_address, Integer.parseInt(str_port));
            //s.setSoTimeout(10);
            //Socket s = new Socket("90.189.119.84", 35572);
            //Socket s = new Socket("smtp.yandex.ru", 25);
            // "90.189.119.84", 35572
            
            // берём поток вывода и выводим туда первый аргумент
            // заданный при вызове, адрес открытого сокета и его порт
            //args[0] = args[0]+"\n"+s.getInetAddress().getHostAddress()+":"+s.getLocalPort();
            str_command = str_command+"\n"+s.getInetAddress().getHostAddress()+":"+s.getLocalPort();
            //s.getOutputStream().write(args[0].getBytes());
            s.getOutputStream().write(str_command.getBytes());

            // читаем ответ
            byte buf[] = new byte[64*1024];
            int r = s.getInputStream().read(buf);
            String data = new String(buf, 0, r);

            // выводим ответ в консоль
            System.out.println(data);
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} // вывод исключений
    }
}