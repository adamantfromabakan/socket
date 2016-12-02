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
            System.out.println((new StringBuilder("Upload to:")).append(hostDir).toString());
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
        String server = "r19ftp.main.russianpost.ru";
        int port = 21;
        String user = "hakasenergo";
        String pass = "ertGq1Njhf0";
        String ftpdir = "/khenergo/";
        String localdir = "c:/temp/post/";
        String filename = "uploadertest.rar";
        String errtxt = "usage jar file: [server] [port] [login] [password] [ftpdir] [localdir] [filename]";
        InputStream inStream = null;
        OutputStream outStream = null;
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
        System.out.println("args[6]="+args[6]);
        if(args[6].equals("-"))
        {

            File dir = new File(localdir);
            File dirarch = new File(localdir+"ARHIV");
            boolean created = dirarch.mkdir();
            if(dir.isDirectory())
            {
            	System.out.println("Start local directory scan");
            	FTPUploader ftpUploader = new FTPUploader(server, port, user, pass);
                for(File item : dir.listFiles()){
                     if(item.isFile()){                          
                         filename=item.getName().toString();
                         ftpUploader.uploadFile((new StringBuilder(String.valueOf(localdir))).append(filename).toString(), filename, ftpdir);
                         File fromFile = item;
                         File toFile = new File(localdir+"ARHIV/"+filename);
                         //System.out.println(fromFile.renameTo(toFile));
                         inStream = new FileInputStream(fromFile);
                         outStream = new FileOutputStream(toFile);
                         byte[] buffer = new byte[1024];
                         int length;
                         while ((length = inStream.read(buffer)) > 0) {
                             outStream.write(buffer, 0, length);
                         }
                         inStream = null;
                         outStream = null;
                         //System.out.println(fromFile.delete());
                         /*File file = new File("C:/temp/post/ARHIV/uploadertest.txt");
                         if(file.delete()){
                             System.out.println("C:/temp/post/ARHIV/uploadertest.tx");
                         }else System.out.println("Файла /Users/prologistic/file.txt не обнаружено");*/
                     }
                 }
                for(File fldel : dir.listFiles()){
                    if(fldel.isFile()){
                        new File(fldel.getAbsolutePath()).delete();
                        System.out.println(fldel.delete());
                    }
                }                
                System.out.println("Done");
                ftpUploader.disconnect();
            }
        } else {
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