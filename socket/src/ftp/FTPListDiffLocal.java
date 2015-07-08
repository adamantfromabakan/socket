package ftp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class FTPListDiffLocal {
    public static void main(String[] args) throws SocketException, IOException {
        String server = "90.189.111.202";
        int port = 21;
        String user = "hakenrg_ftp";
        String pass = "Qm3pXtNr";
        String ftpdir = "/out/";
        String localdir = "c:/temp/2/";
        String downdir = "c:/temp/200/";
        boolean download = false;
        String errtxt = "usage jar file: [server] [port] [login] [password] [ftpdir] [localdir] [downdir] [0 or 1 flag to download]";
        if (args.length != 8) {
            System.out.println(errtxt);
            return;
        }
        if (args[0] == "") {
            System.out.println(errtxt);
            return;
        }
        server = args[0];
        if (args[1] == "") {
            System.out.println(errtxt);
            return;
        }
        port = Integer.valueOf(args[1]);
        if (args[2] == "") {
            System.out.println(errtxt);
            return;
        }
        user = args[2];
        if (args[3] == "") {
            System.out.println(errtxt);
            return;
        }
        pass = args[3];
        if (args[4] == "") {
            System.out.println(errtxt);
            return;
        }
        ftpdir = args[4];
        if (args[5] == "") {
            System.out.println(errtxt);
            return;
        }
        localdir = args[5];
        if (args[6] == "") {
            System.out.println(errtxt);
            return;
        }
        downdir = args[6];
        download = Integer.valueOf(args[7]) != 0;
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            FTPListDiffLocal.showServerReply(ftpClient);
            int replyCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion((int)replyCode)) {
                System.out.println("Connect failed");
                return;
            }
            ftpClient.enterLocalPassiveMode();
            boolean success = ftpClient.login(user, pass);
            FTPListDiffLocal.showServerReply(ftpClient);
            if (!success) {
                System.out.println("Could not login to the server");
                return;
            }
            try {
                ftpClient.setFileType(2);
                ftpClient.changeWorkingDirectory(ftpdir);
                FTPListDiffLocal.showServerReply(ftpClient);
                FTPFile[] allftpfiles = ftpClient.listFiles();
                String[] localfiles = FTPListDiffLocal.getFileNameFromFolder(localdir);
                System.out.println("Files in the local directory (pieces):" + localfiles.length);
                ArrayList<String> z = new ArrayList<String>();
                if (allftpfiles != null && allftpfiles.length > 0) {
                    for (FTPFile file : allftpfiles) {
                        if (!file.isFile()) continue;
                        z.add(file.getName());
                    }
                }
                String[] ftpfiles = z.toArray(new String[z.size()]);
                System.out.println("Files to FTP (pieces):" + ftpfiles.length);
                for (int i = 0; i < localfiles.length; ++i) {
                    for (int j = 0; j < ftpfiles.length; ++j) {
                        if (!localfiles[i].equals(ftpfiles[j]) && !ftpfiles[j].equals(".") && !ftpfiles[j].equals("..")) continue;
                        z.remove(j);
                        --j;
                        ftpfiles = z.toArray(new String[z.size()]);
                    }
                }
                System.out.println("Spot the difference in the files on the FTP:" + z);
                if (download && allftpfiles != null && allftpfiles.length > 0) {
                    for (FTPFile file : allftpfiles) {
                        if (!file.isFile()) continue;
                        for (int i2 = 0; i2 < ftpfiles.length; ++i2) {
                            if (!file.getName().equals(ftpfiles[i2])) continue;
                            FileOutputStream fos = new FileOutputStream(String.valueOf(downdir) + ftpfiles[i2]);
                            ftpClient.retrieveFile(ftpfiles[i2], (OutputStream)fos);
                            FTPListDiffLocal.showServerReply(ftpClient);
                            System.out.println("Downloaded file " + downdir + ftpfiles[i2]);
                            fos.close();
                        }
                    }
                }
            }
            catch (IOException ex) {
                System.out.println("Oops! Something wrong happened");
                ex.printStackTrace();
            }
        }
        finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                    FTPListDiffLocal.showServerReply(ftpClient);
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void printFileDetails(FTPFile[] files) {
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (FTPFile file : files) {
            String details = file.getName();
            if (file.isDirectory()) {
                details = "[" + details + "]";
            }
            details = String.valueOf(details) + "\t\t" + file.getSize();
            details = String.valueOf(details) + "\t\t" + dateFormater.format(file.getTimestamp().getTime());
            System.out.println(details);
        }
    }

    private static void printNames(String[] files) {
        if (files != null && files.length > 0) {
            for (String aFile : files) {
                System.out.println(aFile);
            }
        }
    }

    private static void showServerReply(FTPClient ftpClient) {
        String[] replies = ftpClient.getReplyStrings();
        if (replies != null && replies.length > 0) {
            for (String aReply : replies) {
                System.out.println("SERVER: " + aReply);
            }
        }
    }

    public static String[] getFileNameFromFolder(String folderName) {
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles();
        String[] lisfiles = folder.list();
        return lisfiles;
    }
}