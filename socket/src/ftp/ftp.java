package ftp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.commons.net.ftp.FTPClient;

public class ftp {
    public static String[] getList(String host, String user, String password, String folder) {
        FTPClient ftp = new FTPClient();
        try {
            ftp.connect(host);
            ftp.login(user, password);
            ftp.changeWorkingDirectory(folder);
            String[] arrstring = ftp.listNames();
            return arrstring;
        }
        catch (IOException e) {
            System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 getList(FTPClient)");
            e.printStackTrace();
        }
        finally {
            try {
                ftp.logout();
                ftp.disconnect();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void upload(String host, String user, String password, String outFile, String inFile) {
        FTPClient ftp = new FTPClient();
        FileInputStream fis = null;
        try {
            try {
                ftp.connect(host);
                ftp.login(user, password);
                fis = new FileInputStream(inFile);
                ftp.storeFile(outFile, (InputStream)fis);
            }
            catch (IOException e) {
                e.printStackTrace();
                try {
                    ftp.logout();
                    ftp.disconnect();
                    fis.close();
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
        finally {
            try {
                ftp.logout();
                ftp.disconnect();
                fis.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void download(String host, String user, String password, String outFile, String inFile) {
        FTPClient ftp = new FTPClient();
        FileOutputStream fos = null;
        try {
            try {
                ftp.connect(host);
                ftp.login(user, password);
                fos = new FileOutputStream(inFile);
                ftp.retrieveFile(outFile, (OutputStream)fos);
            }
            catch (IOException e) {
                e.printStackTrace();
                try {
                    fos.close();
                }
                catch (Exception e1) {
                    System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 \u0437\u0430\u043a\u0440\u044b\u0442\u0438\u044f \u0432\u044b\u0445\u043e\u0434\u043d\u043e\u0433\u043e \u043f\u043e\u0442\u043e\u043a\u0430");
                }
                try {
                    ftp.logout();
                }
                catch (Exception e2) {
                    System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 ftp.logout");
                }
                try {
                    ftp.disconnect();
                }
                catch (Exception e2) {
                    System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 ftp.disconnect");
                }
            }
        }
        finally {
            try {
                fos.close();
            }
            catch (Exception e) {
                System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 \u0437\u0430\u043a\u0440\u044b\u0442\u0438\u044f \u0432\u044b\u0445\u043e\u0434\u043d\u043e\u0433\u043e \u043f\u043e\u0442\u043e\u043a\u0430");
            }
            try {
                ftp.logout();
            }
            catch (Exception e) {
                System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 ftp.logout");
            }
            try {
                ftp.disconnect();
            }
            catch (Exception e) {
                System.out.println("\u041e\u0448\u0438\u0431\u043a\u0430 ftp.disconnect");
            }
        }
    }

    public static void delete(String host, String user, String password, String outFile) {
        FTPClient ftp = new FTPClient();
        try {
            try {
                ftp.connect(host);
                ftp.login(user, password);
                ftp.deleteFile(outFile);
            }
            catch (IOException e) {
                e.printStackTrace();
                try {
                    ftp.logout();
                    ftp.disconnect();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        finally {
            try {
                ftp.logout();
                ftp.disconnect();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}