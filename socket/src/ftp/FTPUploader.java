package ftp;

import java.io.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FTPUploader
{

    public FTPUploader(String host, int port, String user, String pwd)
        throws Exception
    {
        ftp = null;
        ftp = new FTPClient();
        ftp.connect(host, port);
        ftp.enterLocalPassiveMode();
        int reply = ftp.getReplyCode();
        showServerReply(ftp);
        if(!FTPReply.isPositiveCompletion(reply))
        {
            ftp.disconnect();
            throw new Exception("Exception in connecting to FTP Server");
        } else
        {
            ftp.login(user, pwd);
            showServerReply(ftp);
            ftp.setFileType(2);
            return;
        }
    }

    public void uploadFile(String localFileFullName, String fileName, String hostDir)
        throws Exception
    {
        try
        {
            ftp.changeWorkingDirectory(hostDir);
            showServerReply(ftp);
            java.io.InputStream input = new FileInputStream(new File(localFileFullName));
            ftp.storeFile((new StringBuilder(String.valueOf(hostDir))).append(fileName).toString(), input);
            int reply = ftp.getReplyCode();
            showServerReply(ftp);
            System.out.println((new StringBuilder("Upload from:")).append(localFileFullName).toString());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void disconnect()
    {
        if(ftp.isConnected())
            try
            {
                ftp.logout();
                ftp.disconnect();
                showServerReply(ftp);
            }
            catch(IOException ioexception) { }
    }

    public static void main(String args[])
        throws Exception
    {
        String server = "90.189.111.202";
        int port = 21;
        String user = "hakenrg_ftp";
        String pass = "Qm3pXtNr";
        String ftpdir = "/in/";
        String localdir = "c:/temp/2/";
        String filename = "test.txt";
        String errtxt = "usage jar file: [server] [port] [login] [password] [ftpdir] [localdir] [filename]";
        if(args.length != 7)
        {
            System.out.println(errtxt);
            return;
        }
        if(args[0] == "")
        {
            System.out.println(errtxt);
            return;
        }
        server = args[0];
        if(args[1] == "")
        {
            System.out.println(errtxt);
            return;
        }
        port = Integer.valueOf(args[1]).intValue();
        if(args[2] == "")
        {
            System.out.println(errtxt);
            return;
        }
        user = args[2];
        if(args[3] == "")
        {
            System.out.println(errtxt);
            return;
        }
        pass = args[3];
        if(args[4] == "")
        {
            System.out.println(errtxt);
            return;
        }
        ftpdir = args[4];
        if(args[5] == "")
        {
            System.out.println(errtxt);
            return;
        }
        localdir = args[5];
        if(args[6] == "")
        {
            System.out.println(errtxt);
            return;
        } else
        {
            filename = args[6];
            System.out.println("Start");
            FTPUploader ftpUploader = new FTPUploader(server, port, user, pass);
            ftpUploader.uploadFile((new StringBuilder(String.valueOf(localdir))).append(filename).toString(), filename, ftpdir);
            ftpUploader.disconnect();
            System.out.println("Done");
            return;
        }
    }

    private static void showServerReply(FTPClient ftpClient)
    {
        String replies[] = ftpClient.getReplyStrings();
        if(replies != null && replies.length > 0)
        {
            String as[];
            int j = (as = replies).length;
            for(int i = 0; i < j; i++)
            {
                String aReply = as[i];
                System.out.println((new StringBuilder("SERVER: ")).append(aReply).toString());
            }

        }
    }

    FTPClient ftp;
}