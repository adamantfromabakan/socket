package socket;

import java.io.*;
import java.net.*;

class SampleServer extends Thread
{
    Socket s;
    int num;

    public static void main(String args[])
    {
        try
        {   
            String str_port;
            int i = 0; // ������� �����������
            if ((args[0])=="") {
            str_port   ="8888";
            } else {
            str_port   =args[0];
            }


			// ���������� ����� �� ���������, ���� 3128
            ServerSocket server = new ServerSocket(Integer.parseInt(str_port), 0,
                    InetAddress.getByName("localhost"));

            System.out.println("server is started");

            // ������� ����
            while(true)
            {
                // ��� ������ �����������, ����� ���� ��������� ��������� �������
                // � ����� �������������� ����� � ����������� ������� �� ��������
                new SampleServer(i, server.accept());
                System.out.println("client connected");
                i++;
            }
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} // ����� ����������
    }

    public SampleServer(int num, Socket s)
    {
        // �������� ������
        this.num = num;
        this.s = s;

        // � ��������� ����� �������������� ����� (��. �-� run())
        setDaemon(true);
        setPriority(NORM_PRIORITY);
        start();
    }

    public void run()
    {
        try
        {
            // �� ������ ������� ���� ����� �������� ������
            InputStream is = s.getInputStream();
            // � ������ �� - ����� ������ �� ������� � �������
            OutputStream os = s.getOutputStream();

            // ������ ������ � 64 ���������
            byte buf[] = new byte[64*1024];
            // ������ 64�� �� �������, ��������� - ���-�� ������� �������� ������
            int r = is.read(buf);

            // ������ ������, ���������� ���������� �� ������� ����������
            String data = new String(buf, 0, r);

            // ��������� ������ �� ������ ������:
            data = ""+num+": "+"\n"+data;

            // ������� ������:
            os.write(data.getBytes());

            // ��������� ����������
            s.close();
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} // ����� ����������
    }
}